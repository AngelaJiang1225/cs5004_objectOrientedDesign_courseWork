/**
 * Class Time, containing information about time. This class is used as a part of Problem 2.
 */
package Problem2;

/**
 * Represents a time with their details--hour, minute and second
 *
 * @time
 */

public class Time {

  private Integer hours;
  private Integer minutes;
  private Integer seconds;

  /**
   * Constructor that creates a new time object with the specified hours, minutes and seconds
   *
   * @param hours hours that should be between 0 and 23,included
   * @param minutes minutes that should be between 0 and 59,included
   * @param seconds seconds that should be between 0 and 59,included
   */
  public Time(Integer hours, Integer minutes, Integer seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  /**
   * return String message for whether the time is legal
   *
   * @return "The time is illegal!" for illegal time return "Legal time." for legal time
   */
  public String checkTime() {
    if ((this.hours < 0 || this.hours > 23) || (this.minutes < 0 || this.minutes > 59) || (
        this.seconds < 0
            || this.seconds > 59)) {
      return ("The time is illegal!");
    } else {
      return ("Legal time.");
    }
  }

  /**
   * return the hour the time object
   *
   * @return the hour the time object
   */
  public Integer getHours() {
    return this.hours;
  }

  /**
   * sets the hours of the time object
   *
   * @param hours the hours of the time object
   */
  public void setHours(Integer hours) {
    this.hours = hours;
  }

  /**
   * return minutes of the time object
   *
   * @return minutes of the time object
   */
  public Integer getMinutes() {
    return this.minutes;
  }

  /**
   * sets the minutes of the time object
   *
   * @param minutes the minutes of the time object
   */
  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }

  /**
   * return the seconds of the time
   *
   * @return the seconds of the time
   */
  public Integer getSeconds() {
    return this.seconds;
  }

  /**
   * sets the seconds of the time object
   *
   * @param seconds of the time object
   */
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }
}
