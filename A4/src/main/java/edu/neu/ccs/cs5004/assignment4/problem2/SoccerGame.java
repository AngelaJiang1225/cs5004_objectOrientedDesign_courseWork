package edu.neu.ccs.cs5004.assignment4.problem2;

import java.util.Calendar;

public class SoccerGame extends Games {

  private Outcome outcome;

  /**
   * Create a soccer game with parameters.
   *
   * @param homeTeamScore the score of the home team
   * @param awayTeamScore the score of the away team
   */
  public SoccerGame(Team homeTeam, Team awayTeam, Calendar date, int homeTeamScore,
                    int awayTeamScore) {
    super(homeTeam, awayTeam, date, homeTeamScore, awayTeamScore);
    setOutcome(this.homeTeamScore, this.awayTeamScore);
  }

  /**
   * get the game outcome of the game.
   *
   * @return outcome
   */
  public Outcome getOutcome() throws FutureGameException {
    if (this.checkFutureDate(this.date)) {
      throw new FutureGameException(
          "The game have not been played yet,you can not query the outcome of it!");
    }
    return this.outcome;
  }

  /**
   * Set the outcome of the team.
   *
   * @param homeTeamScore the score of home team
   * @param awayTeamScore the score of away team
   */
  public void setOutcome(int homeTeamScore, int awayTeamScore) {
    if (homeTeamScore != awayTeamScore) {
      this.outcome = Outcome.NOTTIE;
    } else {
      this.outcome = Outcome.TIE;
    }
  }

  /**
   * if the game is tie,throws TiedGameException,else return the winner team.
   *
   * @return the winner team
   * @throws TiedGameException when the game is tie
   */
  public Team getWinner() throws TiedGameException {
    if (this.outcome.equals(Outcome.TIE)) {
      throw new TiedGameException("The game is tie,you can't ask for winner!");
    } else if (this.homeTeamScore > this.awayTeamScore) {
      return this.homeTeam;
    } else {
      return this.awayTeam;
    }
  }


  /**
   * Update the scores of home and away team.
   *
   * @param homeTeamScore homeTeamScore
   * @param awayTeamScore awayTeamScore
   */
  @Override
  public void updateRes(int homeTeamScore, int awayTeamScore) {
    this.setHomeTeamScore(homeTeamScore);
    this.setAwayTeamScore(awayTeamScore);
    this.setOutcome(this.homeTeamScore, this.awayTeamScore);
  }

}
