package edu.neu.ccs.cs5004;

import java.io.IOException;

/**
 * Represents the system that control the whole process of parse and write.
 */
public class SystemController {
  private static final int FILE_NAME_START = 2;

  /**
   * Do the parse and write process accoding to the command line.
   *
   * @param args the command line uses put in.
   * @throws IOException mistake for file input and output.
   */
  public static void main(String[] args) throws IOException {

    // parse command line args
    CommandParser commandParser = new CommandParser(args);
    commandParser.check();

    // read in files line by line, parser it off to parser
    ContactParser contactParser = new ContactParser();
    FileReader.readFile(commandParser.getCsvFile(), contactParser);

    TemplateParser templateParser = new TemplateParser();
    FileReader.readFile(commandParser.getTemplate(), templateParser);


    // write messages: replace keywords in template, generate files, output to directory
    TemplateWriteForAll.writeTemplates(templateParser,
        contactParser,
        commandParser.getOutputDir(), commandParser.getType().substring(FILE_NAME_START));
    System.out.println(commandParser.getType().substring(FILE_NAME_START));
  }
}
