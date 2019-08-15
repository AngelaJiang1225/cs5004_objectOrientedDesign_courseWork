package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class TemplateWriteTest {
  private TemplateWrite templateWrite = new TemplateWrite();
  TemplateParser templateParser;
  HeaderMatch headerMatch;
  String outputPath = "testwrite.txt";
  @Before
  public void setUp() throws Exception {
    this.templateParser = new TemplateParser();
    templateParser.parse("Dear [[first_name]] [[last_name]],");
    this.headerMatch = new HeaderMatch(new HashMap<String, String>() {{
    put("first_name", "Angela");
    put("last_name", "Alley");
  }});
  }

  @Test
  public void replaceTerm() {
    String str = this.templateWrite.replaceTerm(this.templateParser.getResTemplate().getTemplateLines().get(0),
        this.headerMatch);
    assertEquals("Dear Angela Alley,", str);
  }
  @Test
  public void writeTemplate() throws IOException {
    this.templateWrite.writeTemplate(this.templateParser, this.headerMatch, this.outputPath);
    String encoding = "UTF-8";
    File file = new File(this.outputPath);
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
    assertEquals("Dear Angela Alley,", new String(filecontent, encoding));
  }
}