package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ContactFileTest {
  HeaderMatch headerMatch;
  Map<Integer, HeaderMatch> contactMap;
  ContactFile contactFile;
  @Before
  public void setUp() throws Exception {
    this.headerMatch = new HeaderMatch(new HashMap<String, String>() {{
      put("first_name", "Angela");
      put("last_name", "Alley");
    }});
    this.contactMap = new HashMap<Integer, HeaderMatch>(){{
      put(1, headerMatch);
    }};
    this.contactFile = new ContactFile(contactMap);
  }

  @Test
  public void equals() {
    assertTrue(this.contactFile.equals(this.contactFile));
  }
  @Test
  public void equals2() {
    ContactFile contactFile2 = new ContactFile(this.contactMap);
    assertTrue(this.contactFile.equals(contactFile2));
  }
  @Test
  public void equals3() {
    ContactFile contactFile3 = new ContactFile();
    assertFalse(this.contactFile.equals(contactFile3));
  }
  @Test
  public void equals4(){
    Integer test = 1;
    assertFalse(this.contactFile.equals(test));
  }
  @Test
  public void getContactFile() {
    assertEquals(this.contactMap, this.contactFile.getContactMap());
  }

  @Test
  public void testToString() {
    assertEquals("ContactFile{contacts={1=HeaderValues{userValues={last_name=Alley, first_name=Angela}}}}",
        this.contactFile.toString());
  }

  @Test
  public void testHashCode() {
    ContactFile contactFile2 = new ContactFile(this.contactMap);
    assertEquals(contactFile2.hashCode(), this.contactFile.hashCode());
  }
}