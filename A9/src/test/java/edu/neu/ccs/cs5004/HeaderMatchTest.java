package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HeaderMatchTest {
  HeaderMatch headerMatch;
  @Before
  public void setUp() throws Exception {
    this.headerMatch = new HeaderMatch(new HashMap<String, String>() {{
      put("first_name", "Angela");
      put("last_name", "Alley");
    }});
  }

  @Test
  public void equals() {
    HeaderMatch headerValues2 = new HeaderMatch(new HashMap<String, String>() {{
      put("first_name", "Angela");
      put("last_name", "Alley");
    }});
    assertTrue(this.headerMatch.equals(headerValues2));
  }
  @Test
  public void equals2() {
    HeaderMatch headerValues3 = new HeaderMatch(new HashMap<String, String>() {{
      put("median_name", "Angela");
      put("last_name", "Alley");
    }});
    assertFalse(this.headerMatch.equals(headerValues3));
  }
  @Test
  public void equals3() {
    assertTrue(this.headerMatch.equals(this.headerMatch));
  }
  @Test
  public void equals4() {
    Integer test = 1;
    assertFalse(this.headerMatch.equals(test));
  }
  @Test
  public void getReceivers() {
    Map<String, String> map = new HashMap<String, String>() {{
      put("last_name", "Alley");
      put("first_name", "Angela");
    }};
    assertEquals(map, this.headerMatch.getReceivers());
  }

  @Test
  public void testHashCode() {// how to know the hashcode???
    HeaderMatch headerMatch2 = this.headerMatch;
    assertEquals(headerMatch2.hashCode(), this.headerMatch.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("HeaderValues{userValues={last_name=Alley, first_name=Angela}}",
        this.headerMatch.toString());
  }
}