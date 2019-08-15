package edu.neu.ccs.cs5004;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Write template into output file.
 */
public class TemplateWrite {
  /**
   * Parse the template into the output files.
   *
   * @param templateParser templateParser
   * @param outputPath     outputPath
   * @throws IOException if there is mistake in file processing.
   */
  public static void writeTemplate(TemplateParser templateParser,
                                   HeaderMatch headerMatch, String outputPath)
      throws IOException {
    BufferedWriter bufferWrite = null;
    try {
      //Specify the file name and path here
      File file = new File(outputPath);
      // file gets created if there is no such file.
      if (!file.exists()) {
        if (file.createNewFile()) {
          System.out.println("The file creation succeed!");
        } else {
          System.out.println("Fail to create the file!");
        }
      }

      //FileWriter fileWriter = new FileWriter(file, true);
      FileOutputStream fileStream = new FileOutputStream(file);
      Writer fileWriter = new OutputStreamWriter(fileStream, "UTF-8");
      bufferWrite = new BufferedWriter(fileWriter);
      //String mycontent = "This String would be written";
      for (TemplateLine templateLine : templateParser.getResTemplate().getTemplateLines()) {
        bufferWrite.write(replaceTerm(templateLine, headerMatch));
      }
      bufferWrite.flush();
      System.out.println("File written Completed!");
      bufferWrite.close();
    } catch (IOException e) {
      throw new IOException("Exceptions for IO!");
    }
  }

  /**
   * Replace the terms in the templateLine and concatenate each term and placeholder into string.
   * @param templateLine the templateLine
   * @param headerMatch the headerMatch
   * @return the string after being replaced
   */
  //HashMap<String, String> wordMap
  public static String replaceTerm(TemplateLine templateLine, HeaderMatch headerMatch) {
    StringBuilder str = new StringBuilder();
    //String res = "";
    boolean order = true;
    for (String text : templateLine.getLineList()) {
      if (!order) {
        text = headerMatch.getReceivers().get(text);
        order = true;
      } else {
        order = false;
      }
      str.append(text);
    }
    return str.toString();
  }
}
