package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class FileReaderTest {
  TemplateParser templateParser;
  String path = "testRead.txt";
  @Before
  public void setUp() throws Exception {
    this.templateParser = new TemplateParser();
  }

  @Test
  public void readFile() throws IOException {
    FileReader.readFile(path, this.templateParser);
    assertEquals("[Dear , first_name,  , last_name, ,]", this.templateParser.getResTemplate().getTemplateLines().get(0).getLineList().toString());
    assertEquals("[As you may have heard or read,]", this.templateParser.getResTemplate().getTemplateLines().get(1).getLineList().toString());
  }
  @Test(expected = IOException.class)
  public void readFile2() throws IOException {
    FileReader.readFile("hello.txt", this.templateParser);
  }
}