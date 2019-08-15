package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class TemplateLineTest {
 private TemplateLine templateLine;
  @Before
  public void setUp() throws Exception {
    templateLine = new TemplateLine();
  }

  @Test
  public void getLineList() {
    assertEquals(new ArrayList<String>(), this.templateLine.getLineList());
  }

  @Test
public void equals(){
    assertTrue(this.templateLine.equals(this.templateLine));
  }
  @Test
  public void equals2(){
    TemplateLine templateLine = this.templateLine;
    assertTrue(this.templateLine.equals(templateLine));
  }
  @Test
  public void equals3(){
    Integer test = 1;
    assertFalse(this.templateLine.equals(test));
  }
  @Test
  public void testHashCode(){
    TemplateLine templateLine2 = new TemplateLine();
    assertEquals(templateLine2.hashCode(), this.templateLine.hashCode());
  }
  @Test
  public void testToString() {
    assertEquals(new ArrayList<String>().toString(), this.templateLine.toString());
  }
}