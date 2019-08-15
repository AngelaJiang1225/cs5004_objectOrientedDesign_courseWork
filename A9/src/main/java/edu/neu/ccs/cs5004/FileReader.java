package edu.neu.ccs.cs5004;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Read files of Template or ContactFile,and parse each line inside the file.
 */
public class FileReader {
  /**
   * Read files.
   * @param path the path for the input file
   * @param parseFile parse interface
   * @throws IOException throw io exception when there is errors
   */
  public static void readFile(String path, IParser parseFile) throws IOException {
    try (Stream<String> stream = Files.lines(Paths.get(path))) {
      stream.forEach(parseFile::parse);
    } catch (IOException e) {
      throw new IOException("There is no such file or there is problems on input of the file!");
    }
  }
}

