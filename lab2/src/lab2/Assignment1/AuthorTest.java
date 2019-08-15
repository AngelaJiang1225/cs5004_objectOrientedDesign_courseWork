package lab2.Assignment1;

import static org.junit.Assert.assertEquals;

public class AuthorTest {
  private Author authot_test;
  @org.junit.Before
  public void setUp() throws Exception {
    authot_test = new Author("Aiqi", "Jiang", "angela@126.com", "528 Pintius Ave N");
  }
  @org.junit.Test
  public void getName() throws Exception {
    assertEquals(this.authot_test.getName(), "Aiqi Jiang");
  }
  @org.junit.Test
  public void getEmail() throws Exception {
    assertEquals(this.authot_test.getEmail(), "angela@126.com");
  }
  @org.junit.Test
  public void getAddress() throws Exception {
    assertEquals(this.authot_test.getAddress(), "528 Pintius Ave N");
  }
}