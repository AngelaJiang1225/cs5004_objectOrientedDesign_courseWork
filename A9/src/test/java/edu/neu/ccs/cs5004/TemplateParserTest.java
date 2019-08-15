package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TemplateParserTest {
  private TemplateParser templateParser;
  String line = "Dear [[first_name]] [[last_name]],";
  String line2 = "[[first_name]] [[last_name]]";
  @Before
  public void setUp() throws Exception {
    this.templateParser = new TemplateParser();
  }

  @Test
  public void parseByLine() {
    this.templateParser.parse(this.line);
    ArrayList<String> compare = new ArrayList<String>() {
      {
        add("Dear ");
        add("first_name");
        add(" ");
        add("last_name");
        add(",");
      }
    };
    assertEquals(compare, this.templateParser.getResTemplate().getTemplateLines().get(0).getLineList());
  }

  @Test
  public void parseByLineStartByBrace() {
    this.templateParser.parse(this.line2);
    ArrayList<String> compare = new ArrayList<String>() {
      {
        add("");
        add("first_name");
        add(" ");
        add("last_name");
      }
    };
    assertEquals(compare, this.templateParser.getResTemplate().getTemplateLines().get(0).getLineList());
  }

  @Test
  public void getResTemplate() {
    assertEquals(new Template(), this.templateParser.getResTemplate());
  }

  @Test
  public void equals() {
    assertTrue(this.templateParser.equals(this.templateParser));
  }

  @Test
  public void equals2() {
    TemplateParser templateParser2 = this.templateParser;
    assertTrue(this.templateParser.equals(templateParser2));
  }
  @Test
  public void equals3() {
    TemplateParser templateParser3 = new TemplateParser();
    templateParser3.parse(this.line2);
    assertFalse(this.templateParser.equals(templateParser3));
  }
  @Test
  public void equals4() {
    Integer test = 1;
    assertFalse(this.templateParser.equals(test));
  }

  @Test
  public void testHashCode() {
    TemplateParser templateParser4 = this.templateParser;
    assertEquals(templateParser4.hashCode(), this.templateParser.hashCode());
  }
  @Test
  public void testToString() {
    assertEquals("TemplateParser{resTemplate = Template{templatesLines=[]}}", this.templateParser.toString());
  }
}