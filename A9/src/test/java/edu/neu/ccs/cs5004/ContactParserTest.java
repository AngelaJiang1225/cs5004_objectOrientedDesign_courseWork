package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static org.junit.Assert.*;

public class ContactParserTest {
  private ContactParser contactParser;
  private String str;
  private BufferedReader br;

  @Before
  public void setUp() throws Exception {
    this.contactParser = new ContactParser();
    FileInputStream inputStream = new FileInputStream("./insurance_company_members.csv");
    this.br = new BufferedReader(new InputStreamReader(inputStream));
    this.str = this.br.readLine();
    inputStream.close();
  }

  @Test
  public void getContactFile() {
    assertEquals(new ContactFile(), this.contactParser.getContactFile());
  }

  @Test
  public void getHeader() {
    assertEquals(new ArrayList<String>(), this.contactParser.getHeader());
  }

  @Test
  public void parseHeader() throws Exception{
    this.br.close();
    this.contactParser.parse(this.str);
    assertEquals(Arrays.asList("first_name", "last_name","company_name","address","city","county","state","zip","phone1","phone2","email","web"),
        this.contactParser.getHeader());
  }

  @Test
  public void parseContactFile() throws Exception{
    this.contactParser.parse(this.str);
    this.contactParser.parse(this.br.readLine());
    System.out.println(this.contactParser.getContactFile().getContactMap().get(0));
    Map<String, String> map = new HashMap<String, String>(){{
      put("zip", "70116");
      put("address", "6649 N Blue Gum St");
      put("city", "New Orleans");
      put("web", "http://www.bentonjohnbjr.com");
      put("company_name", "Benton, John B Jr");
      put("county", "Orleans");
      put("phone2", "504-845-1427");
      put("last_name", "Butt");
      put("state", "LA");
      put("first_name", "James");
      put("email", "jbutt@gmail.com");
      put("phone1", "504-621-8927");
    }};
    System.out.println(map);
    assertEquals(map, this.contactParser.getContactFile().getContactMap().get(0).getReceivers());
  }

  @Test
  public void equals() {
    assertTrue(this.contactParser.equals(this.contactParser));
  }

  @Test
  public void equals2() {
    ContactParser contactParser1 = new ContactParser();
    assertTrue(this.contactParser.equals(contactParser1));
  }
@Test
public void equals3() {
  Integer test = 1;
  assertFalse(this.contactParser.equals(test));
}
@Test
public void equals4(){
  this.contactParser.parse(this.str);
  ContactParser contactParser2 = new ContactParser();
  assertFalse(this.contactParser.equals(contactParser2));
}
  @Test
  public void testHashCode() {
    ContactParser contactParser2 = this.contactParser;
    assertEquals(this.contactParser.hashCode(), contactParser2.hashCode());
  }

  @Test
  public void testToString() {
    System.out.println(this.contactParser.toString());
  }
}