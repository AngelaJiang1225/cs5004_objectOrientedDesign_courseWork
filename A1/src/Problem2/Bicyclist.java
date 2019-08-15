/**
 * Class Bicyclist, containing information about a bicyclist. This class is used as a part of
 * Problem 2.
 */
package Problem2;

/**
 * Represents an bicyclist with their details--name,team name, start time and end time
 *
 * @bicyclist
 */
public class Bicyclist {

  private String name;
  private String team;
  private Time startTime;
  private Time endTime;

  /**
   * Constructor that creates a new bicyclist object with the specified name, team name, start time
   * and end time
   *
   * @param name --name of the new bicyclist object
   * @param team --team name of the new bicyclist
   * @param startTime --start time of the new bicyclist
   * @param endTime --end time of the new bicyclist
   */
  public Bicyclist(String name, String team, Time startTime, Time endTime) {
    this.name = name;
    this.team = team;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  /**
   * return the name of the bicyclist
   *
   * @return the name of the bicyclist
   */
  public String getName() {
    return this.name;
  }

  /**
   * sets the name of the bicyclist
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * return the team name of the bicyclist
   *
   * @return the team name of the bicyclist
   */
  public String getTeam() {
    return this.team;
  }

  /**
   * sets the team name of the bicyclist
   */
  public void setTeam(String team) {
    this.team = team;
  }

  /**
   * return the start time of the bicyclist
   *
   * @return the start time of the bicyclist
   */
  public Time getStartTime() {
    return this.startTime;
  }

  /**
   * sets the start time of the bicyclist
   */
  public void setStartTime(Time startTime) {
    this.startTime = startTime;
  }

  /**
   * return the end time of the bicyclist
   *
   * @return the end time of the bicyclist
   */
  public Time getEndTime() {
    return this.endTime;
  }

  /**
   * sets the end time of the bicyclist
   */
  public void setEndTime(Time endTime) {
    this.endTime = endTime;
  }

  /**
   * return the duration time of the bicyclist
   *
   * @return the duration time of the bicyclist
   */
  public Time getDuration() throws Exception {
    Integer starTimeSeconds =
        this.startTime.getHours() * 3600 + this.startTime.getMinutes() * 60 + this.startTime
            .getSeconds();
    Integer endTimeSeconds =
        this.endTime.getHours() * 3600 + this.endTime.getMinutes() * 60 + this.endTime
            .getSeconds();
    Integer duration = endTimeSeconds - starTimeSeconds;
    Integer durationHr = duration / 3600;
    Integer durationMin = (duration - durationHr * 3600) / 60;
    Integer durationSec = duration - durationHr * 3600 - durationMin * 60;
    return new Time(durationHr, durationMin, durationSec);
  }
}
