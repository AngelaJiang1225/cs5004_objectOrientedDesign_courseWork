package edu.neu.ccs.cs5004;

/**
 * Parser for files of Template or ContactFile type.
 */

public interface IParser {

  /**
   * Reads a line and update its structure.
   *
   * @param line the line being read.
   */
  void parse(String line);

}
