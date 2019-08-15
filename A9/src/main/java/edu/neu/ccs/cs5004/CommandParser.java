package edu.neu.ccs.cs5004;

/**
 * Class of CommandParser.
 */

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class CommandParser {

  public static final int COMMAND_MAX_LENGTH = 7;
  private String template = null; // template file
  private String csvFile = null; // csv file need to be read
  private String type = null; // email or letter
  private String outputDir = null; // output directory
  private String[] commandArgument;

  /**
   * Constructor of command argument.
   *
   * @param commandArgument command line argument
   */
  public CommandParser(String[] commandArgument) {
    if (commandArgument.length > COMMAND_MAX_LENGTH) {
      throw new IllegalArgumentException("Argument invalid!!!");
    }
    this.commandArgument = (String[]) commandArgument.clone();
  }

  /**
   * Check if those files is valid!
   *
   * @throws IllegalArgumentException throw exception if not valid.
   */
  public void check() throws IllegalArgumentException {
    this.setType();
    this.setTemplate();
    this.setCsvFile();
    this.setOutputDir();
    File csv = new File(this.getCsvFile());
    if (!csv.isFile()) {
      throw new IllegalArgumentException("Csv file is invalid!");
    }
    File template = new File(this.getTemplate());
    if (!template.isFile()) {
      throw new IllegalArgumentException("template file is invalid!");
    }
  }

  /**
   * getter of template.
   *
   * @return the template.
   */
  public String getTemplate() {
    return this.template;
  }

  /**
   * getter of csv file.
   *
   * @return the csv file.
   */
  public String getCsvFile() {
    return this.csvFile;
  }

  /**
   * getter of type.
   *
   * @return the type.
   */
  public String getType() {
    return this.type;
  }

  /**
   * getter of output directory.
   *
   * @return the output directory.
   */
  public String getOutputDir() {
    return this.outputDir;
  }

  /**
   * setter of type.
   */
  public void setType() {
    for (String item : this.commandArgument) {
      if (item.equals("--email") || item.equals("--letter")) {
        this.type = item;
        return;
      }
    }
    throw new IllegalArgumentException("Error! No --email or --letter flag");
  }

  /**
   * setter of template.
   */
  public void setTemplate() {
    if (this.type.equals("--email")) {
      for (int i = 0; i < this.commandArgument.length - 1; i++) {
        if (this.commandArgument[i].equals("--email-template")
            && this.commandArgument[i + 1].endsWith(".txt")) {
          this.template = this.commandArgument[i + 1];
          return;
        }
      }
    } else if (this.type.equals("--letter")) {
      for (int i = 0; i < this.commandArgument.length - 1; i++) {
        if (this.commandArgument[i].equals("--letter-template")
            && this.commandArgument[i + 1].endsWith(".txt")) {
          this.template = this.commandArgument[i + 1];
          return;
        }
      }
    }
    throw new IllegalArgumentException("the type is conflicted with the template type");
  }

  /**
   * setter of csv file.
   */
  public void setCsvFile() {
    for (int i = 0; i < this.commandArgument.length - 1; i++) {
      if (this.commandArgument[i].equals("--csv-file")
          && this.commandArgument[i + 1].endsWith(".csv")) {
        this.csvFile = this.commandArgument[i + 1];
        return;
      }
    }
    throw new IllegalArgumentException("Does not has a --csv-file flag followed by a csv file");
  }

  /**
   * setter of output directory.
   */
  public void setOutputDir() {
    for (int i = 0; i < this.commandArgument.length - 1; i++) {
      if (this.commandArgument[i].equals("--output-dir")) {
        this.outputDir = this.commandArgument[i + 1];
        return;
      }
    }
    throw new IllegalArgumentException("Does not have a --output-dir flag followed and"
        + "--output-dir flag cannot be the last argument");
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof CommandParser)) {
      return false;
    }
    CommandParser that = (CommandParser) object;
    return Objects.equals(getTemplate(), that.getTemplate())
        && Objects.equals(getCsvFile(), that.getCsvFile())
        && Objects.equals(getType(), that.getType())
        && Objects.equals(getOutputDir(), that.getOutputDir())
        && Arrays.equals(commandArgument, that.commandArgument);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(getTemplate(), getCsvFile(), getType(), getOutputDir());
    result = 31 * result + Arrays.hashCode(commandArgument);
    return result;
  }

  @Override
  public String toString() {
    return "CommandParser{"
        + "template='" + template + '\''
        + ", csvFile='" + csvFile + '\''
        + ", type='" + type + '\''
        + ", outputDir='" + outputDir + '\''
        + ", commandArgument=" + Arrays.toString(commandArgument)
        + '}';
  }

}
