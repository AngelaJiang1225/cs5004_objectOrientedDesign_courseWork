package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class TemplateWriteForAllTest {
private TemplateParser templateParser = new TemplateParser();
private ContactParser contactParser = new ContactParser();
private String path = "email";
private String type = "email";
private String line1 = "[[first_name]] [[last_name]]";
private String line2 = "\"first_name\",\"last_name\",\"company_name\",\"address\",\"city\",\"county\",\"state\",\"zip\",\"phone1\",\"phone2\"";
private String line3 = "\"James\",\"Butt\",\"Benton, John B Jr\",\"6649 N Blue Gum St\",\"New Orleans\",\"Orleans\",\"LA\",\"70116\",\"504-621-8927\",\"504-845-1427\"";
  @Before
  public void setUp() throws IOException {
  this.templateParser.parse(this.line1);
  this.contactParser.parse(line2);
  this.contactParser.parse(line3);
  }

  @Test
  public void writeTemplates() throws IOException {
    TemplateWriteForAll.writeTemplates(this.templateParser, this.contactParser, this.path, this.type);
    String encoding = "UTF-8";
    File file = new File(".//email//email1.txt");
    Long filelength = file.length();
    byte[] filecontent = new byte[filelength.intValue()];
    try {
      FileInputStream in = new FileInputStream(file);
      in.read(filecontent);
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    assertEquals("James Butt", new String(filecontent, encoding));
  }
}