package edu.neu.ccs.cs5004.assignment4.problem2;

public class FootballLeague extends Leagues {

  public FootballLeague(String name, Integer startMonth, Integer endMonth, int gameNumber,
                        Games nextGame) throws IllegalArgumentException {
    super(name, startMonth, endMonth, gameNumber, nextGame);
  }

  /**
   * update the game result after playing.
   *
   * @param game          the football game
   * @param homeTeamScore the score of the home team
   * @param awayTeamScore the score of the away team
   * @throws FutureGameException FutureGameException
   * @throws TiedGameException   TiedGameException
   */
  public void playGame(FootballGame game, int homeTeamScore, int awayTeamScore)
      throws FutureGameException, TiedGameException {
    // update the game scores
    game.updateRes(homeTeamScore, awayTeamScore);
    //update team related game fields
    game.updateRes(homeTeamScore, awayTeamScore);
    //when the home team wins
    if (game.getOutcome().equals(Outcome.NOTTIE) && game.getHomeTeam()
        .equals(game.getWinner())) {
      ((FootballTeam) game.getHomeTeam()).setRecordPoints(
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumWin() + ONENUM,
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumLoss(),
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumTies());
      ((FootballTeam) game.getAwayTeam()).setRecordPoints(
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumWin(),
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumLoss() + ONENUM,
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumTies());
    } else if (game.getOutcome().equals(Outcome.TIE)) {
      ((FootballTeam) game.getHomeTeam()).setRecordPoints(
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumWin(),
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumLoss(),
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumTies() + ONENUM);
      ((FootballTeam) game.getAwayTeam()).setRecordPoints(
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumWin(),
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumLoss(),
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumTies() + ONENUM);

    } else {
      ((FootballTeam) game.getHomeTeam()).setRecordPoints(
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumWin(),
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumLoss() + ONENUM,
          ((FootballTeam) game.getHomeTeam()).getRecord().getNumTies());
      ((FootballTeam) game.getAwayTeam()).setRecordPoints(
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumWin() + ONENUM,
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumLoss(),
          ((FootballTeam) game.getAwayTeam()).getRecord().getNumTies());
    }
  }
}

