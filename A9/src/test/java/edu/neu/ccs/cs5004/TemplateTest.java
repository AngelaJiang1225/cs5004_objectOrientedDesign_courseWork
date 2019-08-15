package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class TemplateTest {
Template template;
  @Before
  public void setUp() throws Exception {
    this.template = new Template();
  }

  @Test
  public void getTemplateLines() {
    assertEquals(new ArrayList<>(), this.template.getTemplateLines());
  }

  @Test
  public void equals() {
    Template template2 = new Template();
    assertTrue(this.template.equals(template2));
  }
  @Test
  public void equals2() {
    assertTrue(this.template.equals(this.template));
  }
  @Test
  public void equals3() {
    Integer test = 1;
    assertFalse(this.template.equals(test));
  }
@Test
public void testHashCode(){
    Template template2 = this.template;
    assertEquals(template2.hashCode(), this.template.hashCode());
}
  @Test
  public void testToString() {
    assertEquals("Template{templatesLines=[]}", this.template.toString());
  }
}