package edu.neu.ccs.cs5004;

import java.io.File;
import java.io.IOException;

public class TemplateWriteForAll {
  private static final String TEXT_TYPE = ".txt";
  private static final String DIR = ".//";
  private static final String DIR_SEP = "//";

  /**
   * Write templates.
   *
   * @param templateParser templateParser
   * @param contactParser  contactParser
   * @param path           path of the output directory.
   * @param type           the type maybe email or letter
   * @throws IOException when there is mistake in file processing
   */
  //This is the last step
  // write one line in template
  public static void writeTemplates(TemplateParser templateParser,
                                    // when use in main function, the templateParser
                                    // was updated in advance
                                    ContactParser contactParser, String path, String type)
      throws IOException {
    //final String name = new String(type);
    int counter = 1;
    // for differentiate names of files
    for (int i = 0; i < contactParser.getContactFile().getContactMap().size(); i++) {
      try {
        // create a new directory if the directory does not exist.
        File file = new File(DIR + path);
        if (!file.exists()) {
          if (file.mkdir()) {
            System.out.println("Directory is created!");
          } else {
            System.out.println("Failed to create directory!");
          }
        }
        TemplateWrite.writeTemplate(templateParser,
            contactParser.getContactFile().getContactMap().get(counter - 1),
            DIR + path + DIR_SEP + type + counter + TEXT_TYPE);
      } catch (IOException e) {
        System.out.println("The file doesn't exist!");
      }
      counter++;
    }
  }
}