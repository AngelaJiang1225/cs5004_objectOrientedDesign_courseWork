package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommandParserTest {
  private CommandParser commandParser;
  private CommandParser commandParser1;

  @Before
  public void setUp() throws Exception {
    String[] args = new String[7];
    args[0] = "--email";
    args[1] = "--email-template";
    args[2] = "emailtemplate.txt";
    args[3] = "--output-dir";
    args[4] = "emails";
    args[5] = "--csv-file";
    args[6] = "insurance_company_members.csv";
    String[] args1 = new String[7];
    args1[0] = "--letter";
    args1[1] = "--letter-template";
    args1[2] = "letter-emailtemplate.txt";
    args1[3] = "--output-dir";
    args1[4] = "letter";
    args1[5] = "--csv-file";
    args1[6] = "insurance_company_members.csv";
    this.commandParser = new CommandParser(args);
    this.commandParser1 = new CommandParser(args1);
  }

  @Test (expected = IllegalArgumentException.class)
  public void setUp1() throws Exception {
    String[] args = new String[8];
    args[0] = "--email";
    args[1] = "--email-template";
    args[2] = "--emailemailemplate.txt";
    args[3] = "--output-dir";
    args[4] = "emails";
    args[5] = "--csv-file";
    args[6] = "insurance_company_members.csv";
    this.commandParser = new CommandParser(args);
  }

  @Test (expected = IllegalArgumentException.class)
  public void check() {
    String[] args = new String[7];
    args[0] = "--email";
    args[1] = "--email-template";
    args[2] = "email-emailtemplate.txt";
    args[3] = "--output-dir";
    args[4] = "emails";
    args[5] = "--csv-file";
    args[6] = "insurance_company_members.csv";
    this.commandParser = new CommandParser(args);
    this.commandParser.check();
    Assert.assertEquals("emails", this.commandParser.getType());
  }

  @Test (expected = IllegalArgumentException.class)
  public void check3() {
    String[] args = new String[7];
    args[0] = "--email";
    args[1] = "--email-template";
    args[2] = "email--template.txt";
    args[3] = "--output-dir";
    args[4] = "emails";
    args[5] = "--csv-file";
    args[6] = "insurance_company_members.csv";
    this.commandParser = new CommandParser(args);
    this.commandParser.check();
    Assert.assertEquals("emails", this.commandParser.getType());
  }

  @Test (expected = IllegalArgumentException.class)
  public void check5() {
    String[] args = new String[7];
    args[0] = "--letter";
    args[1] = "--email-template";
    args[2] = "email-template.txt";
    args[3] = "--output-dir";
    args[4] = "emails";
    args[5] = "--csv-file";
    args[6] = "insurance_company_members.csv";
    this.commandParser = new CommandParser(args);
    this.commandParser.check();
    Assert.assertEquals("emails", this.commandParser.getType());
  }

  @Test (expected = IllegalArgumentException.class)
  public void check4() {
    this.commandParser1.check();
    Assert.assertEquals("letter", this.commandParser1.getType());
  }

  @Test
  public void check2() {
    this.commandParser.check();
    Assert.assertEquals("--email", this.commandParser.getType());
  }

  @Test
  public void getTemplate() {
    Assert.assertEquals(null, this.commandParser.getTemplate());
  }

  @Test
  public void getCsvFile() {
    Assert.assertEquals(null, this.commandParser.getCsvFile());
  }

  @Test
  public void getType() {
    Assert.assertEquals(null, this.commandParser.getType());
  }

  @Test
  public void getOutputDir() {
    this.commandParser.setOutputDir();
    Assert.assertEquals("emails", this.commandParser.getOutputDir());
  }

  @Test
  public void setType() {
    this.commandParser.setType();
    Assert.assertEquals("--email", this.commandParser.getType());
    this.commandParser1.setType();
    Assert.assertEquals("--letter", this.commandParser1.getType());
  }

  @Test (expected = IllegalArgumentException.class)
  public void setType1() {
    this.commandParser.setType();
    Assert.assertEquals("--email", this.commandParser.getType());
    this.commandParser1.setType();
    Assert.assertEquals("--letter", this.commandParser1.getType());
    String[] args = new String[7];
    args[0] = "--error";
    args[1] = "--email-template";
    args[2] = "email-emailtemplate.txt";
    args[3] = "--output-dir";
    args[4] = "emails";
    args[5] = "--csv-file";
    args[6] = "customer.csv";
    this.commandParser = new CommandParser(args);
    this.commandParser.setType();
  }

  @Test
  public void setTemplate() {
    this.commandParser.setType();
    this.commandParser.setTemplate();
    Assert.assertEquals("emailtemplate.txt", this.commandParser.getTemplate());
    this.commandParser1.setType();
    this.commandParser1.setTemplate();
    Assert.assertEquals("letter-emailtemplate.txt", this.commandParser1.getTemplate());
  }

  @Test
  public void setCsvFile() {
    this.commandParser.setCsvFile();
    Assert.assertEquals("insurance_company_members.csv", this.commandParser.getCsvFile());
  }

  @Test
  public void setOutputDir() {
    this.commandParser.setOutputDir();
    Assert.assertEquals("emails", this.commandParser.getOutputDir());
  }

  @Test
  public void equals() {
    Assert.assertEquals(false, this.commandParser.equals(new Integer(1)));
    Assert.assertEquals(false, this.commandParser.equals(this.commandParser1));
    Assert.assertEquals(true, this.commandParser.equals(this.commandParser));
    String[] args1 = new String[7];
    String[] args = new String[7];
    args1[0] = "--email";
    args1[1] = "--email-template";
    args1[2] = "emailtemplate.txt";
    args1[3] = "--output-dir";
    args1[4] = "emails";
    args1[5] = "--csv-file";
    args1[6] = "insurance_company_members.csv";
    this.commandParser1 = new CommandParser(args1);
    Assert.assertEquals(true, this.commandParser.equals(this.commandParser1));
  }

  @Test
  public void hashCode1() {
    Assert.assertEquals(false, this.commandParser == this.commandParser1);
    Assert.assertEquals(true, this.commandParser == this.commandParser);
    String[] args1 = new String[7];
    String[] args = new String[7];
    args1[0] = "--email";
    args1[1] = "--email-template";
    args1[2] = "emailtemplate.txt";
    args1[3] = "--output-dir";
    args1[4] = "emails";
    args1[5] = "--csv-file";
    args1[6] = "insurance_company_members.csv";
    this.commandParser1 = new CommandParser(args1);
    Assert.assertEquals(this.commandParser.hashCode(), this.commandParser1.hashCode());
  }

  @Test
  public void toString1() {
    Assert.assertEquals(false, this.commandParser.toString().equals(this.commandParser1.toString()));
    Assert.assertEquals(this.commandParser.toString(), this.commandParser.toString());
    String[] args1 = new String[7];
    String[] args = new String[7];
    args1[0] = "--email";
    args1[1] = "--email-template";
    args1[2] = "emailtemplate.txt";
    args1[3] = "--output-dir";
    args1[4] = "emails";
    args1[5] = "--csv-file";
    args1[6] = "insurance_company_members.csv";
    this.commandParser1 = new CommandParser(args1);
    Assert.assertEquals(this.commandParser.toString(), this.commandParser1.toString());
  }
}