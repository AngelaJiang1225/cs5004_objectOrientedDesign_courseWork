package edu.neu.ccs.cs5004;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class SystemControllerTest {
  String[] args;
//  private SystemController systemController;
  @Before
  public void setUp() throws Exception {
    this.args = new String[7];
    args[0] = "--letter";
    args[1] = "--letter-template";
    args[2] = "testControl.txt";
    args[3] = "--output-dir";
    args[4] = ".";
    args[5] = "--csv-file";
    args[6] = "testControl.csv";
  }

  @Test
  public void main() throws IOException {
      SystemController.main(this.args);
      String encoding = "UTF-8";
      File file1 = new File(".//letter1.txt");
      Long filelength = file1.length();
      byte[] filecontent1 = new byte[filelength.intValue()];
      try {
        FileInputStream in = new FileInputStream(file1);
        in.read(filecontent1);
        in.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
      assertEquals("James Butt", new String(filecontent1, encoding));

      File file2 = new File(".//letter2.txt");
      filelength = file2.length();
      byte[] filecontent2 = new byte[filelength.intValue()];
      try {
        FileInputStream in = new FileInputStream(file2);
        in.read(filecontent2);
        in.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
      assertEquals("Josephine Darakjy", new String(filecontent2, encoding));
  }
  }
