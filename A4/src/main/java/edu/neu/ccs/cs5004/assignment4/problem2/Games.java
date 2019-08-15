
package edu.neu.ccs.cs5004.assignment4.problem2;
// For sports that do not allow ties (baseball, basketball), you should ensure that, when a
//game has been played, it did not result in a tie

import java.util.Calendar;

public abstract class Games implements RetrieveWinner {

  protected Team homeTeam;
  protected Team awayTeam;
  protected Calendar date;
  protected int homeTeamScore; // This will be 0 if the game is in the future.
  protected int awayTeamScore; //This will be 0 if the game is in the future
  protected static final int DEFAULTSCORE = 0;

  /**
   * Create a team with details.
   *
   * @param homeTeam      the home team
   * @param awayTeam      the away team
   * @param date          the date
   * @param homeTeamScore the score of home team
   * @param awayTeamScore the score of away team
   */
  public Games(Team homeTeam, Team awayTeam, Calendar date, int homeTeamScore, int awayTeamScore) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.date = date;
    if (checkFutureDate(date)) {
      this.homeTeamScore = DEFAULTSCORE;
      this.awayTeamScore = DEFAULTSCORE;
    } else {
      this.homeTeamScore = homeTeamScore;
      this.awayTeamScore = awayTeamScore;
    }
  }

  /**
   * Decide whether the date is in the future.
   *
   * @param date date
   * @return true if the date is in the future
   */
  protected boolean checkFutureDate(Calendar date) {
    if (Calendar.getInstance().before(date)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * return the home team.
   *
   * @return the home team
   */
  public Team getHomeTeam() {
    return this.homeTeam;
  }

  /**
   * return awayTeam.
   *
   * @return awayTeam
   */
  public Team getAwayTeam() {
    return awayTeam;
  }

  /**
   * return Date.
   *
   * @return Date
   */
  public Calendar getDate() {
    return this.date;
  }

  /**
   * return hometeam's score.
   *
   * @return hometeam's score
   */
  public int getHomeTeamScore() {

    return this.homeTeamScore;
  }

  /**
   * return awayteam's score.
   *
   * @return awayteam's score
   */
  public int getAwayTeamScore() {
    return this.awayTeamScore;
  }

  /**
   * setHomeTeamScor.
   *
   * @param homeTeamScore the score of home team
   */
  public void setHomeTeamScore(int homeTeamScore) {
    if (!Calendar.getInstance().before(this.date)) {
      this.homeTeamScore = homeTeamScore;
    }
  }

  /**
   * setAwayTeamScore.
   *
   * @param awayTeamScore the scre of away team
   */
  public void setAwayTeamScore(int awayTeamScore) {
    if (!Calendar.getInstance().before(this.date)) {
      this.awayTeamScore = awayTeamScore;
    }
  }

  /**
   * updateResult.
   *
   * @param homeTeamScore homeTeamScore
   * @param awayTeamScore awayTeamScore
   */
  public void updateRes(int homeTeamScore, int awayTeamScore) {
    if (!Calendar.getInstance().before(this.date)) {
      this.setHomeTeamScore(homeTeamScore);
      this.setAwayTeamScore(awayTeamScore);
    }
  }
}
