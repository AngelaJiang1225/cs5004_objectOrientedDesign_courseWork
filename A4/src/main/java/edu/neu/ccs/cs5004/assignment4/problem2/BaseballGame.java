package edu.neu.ccs.cs5004.assignment4.problem2;

import java.util.Calendar;

public class BaseballGame extends Games {
  private Win win;

  /**
   * Create baseball game.
   *
   * @param homeTeam      the home team
   * @param awayTeam      the away team
   * @param date          the date
   * @param homeTeamScore the home team's score
   * @param awayTeamScore the away team's score
   */
  public BaseballGame(Team homeTeam, Team awayTeam, Calendar date, int homeTeamScore,
                      int awayTeamScore) {
    super(homeTeam, awayTeam, date, homeTeamScore, awayTeamScore);
    if (this.homeTeamScore > this.awayTeamScore) {
      this.win = Win.HOMETEAMWIN;
    } else if (this.awayTeamScore > this.homeTeamScore) {
      this.win = Win.AWAYTEAMWIN;
    }
  }

  public Win getWin() {
    return this.win;
  }

  /**
   * return the winner team.
   *
   * @return the winner team
   */
  public Team getWinner() {
    if (this.win.equals(Win.HOMETEAMWIN)) {
      return this.homeTeam;
    } else {
      return this.awayTeam;
    }
  }

  /**
   * update the result.
   *
   * @param homeTeamScore the score of the home team
   * @param awayTeamScore the score of the away team
   */
  @Override
  public void updateRes(int homeTeamScore, int awayTeamScore) {
    if (!Calendar.getInstance().before(this.date)) {
      this.setHomeTeamScore(homeTeamScore);
      this.setAwayTeamScore(awayTeamScore);
      if (homeTeamScore > awayTeamScore) {
        this.win = Win.HOMETEAMWIN;
      } else if (homeTeamScore < awayTeamScore) {
        this.win = Win.AWAYTEAMWIN;
      }
    }
  }
}
