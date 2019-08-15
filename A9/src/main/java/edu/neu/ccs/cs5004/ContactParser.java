package edu.neu.ccs.cs5004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Produces the each receiver's hashmap with attached values by parsing lines.
 * populate hashmap contactFile by parse lines
 */

public class ContactParser implements IParser {
  private static final String REG_EXP = "\"(.*?)\"";
  private ContactFile contactFile;
  private List<String> header;
  private int number;

  /**
   * Creates an instance of contacts.
   */
  public ContactParser() {
    this.number = 0;
    this.contactFile = new ContactFile();
    this.header = new ArrayList<String>();
  }

  /**
   * Returns the contactfile.
   *
   * @return the contactfile
   */
  public ContactFile getContactFile() {
    return this.contactFile;
  }

  /**
   * Returns the header list.
   *
   * @return the header list
   */
  public List<String> getHeader() {
    return this.header;
  }

  @Override
  public void parse(String line) {
    Pattern parse = Pattern.compile(REG_EXP);
    Matcher matcher = parse.matcher(line);
    // everytime when parsing a line of the csv, if the header is not available
    if (this.header.isEmpty()) {
      while (matcher.find()) {
        this.header.add(matcher.group(1));
      }
    } else {
      Iterator<String> headerIter = this.header.iterator();
      while (matcher.find()) {
        this.contactFile.getContactMap().putIfAbsent(this.number, new HeaderMatch());
        // To update the headermatch hashmap.
        this.contactFile.getContactMap().get(this.number).getReceivers()
            .putIfAbsent(headerIter.next(),
                matcher.group(1));
      }
      this.number++;
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    ContactParser contactParserCompare = (ContactParser) obj;
    return Objects.equals(this.contactFile, contactParserCompare.getContactFile())
        && Objects.equals(this.header, contactParserCompare.getHeader());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.contactFile, header);
  }

  @Override
  public String toString() {
    return "Contacts{"
        + "contactFile =" + this.contactFile
        + ", header =" + header
        + '}';
  }
}