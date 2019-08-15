package edu.neu.ccs.cs5004.assignment4.problem2;

public class SoccerLeague extends Leagues {
  /**
   * Create SoccerLeague.
   *
   * @param name       name
   * @param startMonth startMonth
   * @param endMonth   endMonth
   * @param gameNumber gameNumber
   * @param nextGame   nextGame
   * @throws IllegalArgumentException IllegalArgumentException
   */
  public SoccerLeague(String name, Integer startMonth, Integer endMonth, int gameNumber,
                      Games nextGame) throws IllegalArgumentException {
    super(name, startMonth, endMonth, gameNumber, nextGame);
  }

  /**
   * Create game played.
   *
   * @param game          game
   * @param homeTeamScore homeTeamScore
   * @param awayTeamScore awayTeamScore
   * @throws FutureGameException FutureGameException
   * @throws TiedGameException   TiedGameException
   */
  public void playGame(SoccerGame game, int homeTeamScore, int awayTeamScore)
      throws FutureGameException, TiedGameException {
    // update the game scores
    game.updateRes(homeTeamScore, awayTeamScore);
    //update team related game fields
    game.updateRes(homeTeamScore, awayTeamScore);
    //when the home team wins
    if (game.getOutcome().equals(Outcome.NOTTIE) && game.getHomeTeam()
        .equals(game.getWinner())) {
      ((SoccerTeam) game.getHomeTeam()).setRecordPoints(
          ((SoccerTeam) game.getHomeTeam()).getRecord().getNumWin() + ONENUM,
          ((SoccerTeam) game.getHomeTeam()).getRecord().getNumLoss(),
          ((SoccerTeam) game.getHomeTeam()).getRecord().getNumTies());
      ((SoccerTeam) game.getAwayTeam()).setRecordPoints
          (((SoccerTeam) game.getAwayTeam()).getRecord().getNumWin(),
              ((SoccerTeam) game.getAwayTeam()).getRecord().getNumLoss() + ONENUM,
              ((SoccerTeam) game.getAwayTeam()).getRecord().getNumTies());
    } else if (game.getOutcome().equals(Outcome.TIE)) {
      ((SoccerTeam) game.getHomeTeam()).setRecordPoints(
          ((SoccerTeam) game.getHomeTeam()).getRecord().getNumWin(),
          ((SoccerTeam) game.getHomeTeam()).getRecord().getNumLoss(),
          ((SoccerTeam) game.getHomeTeam()).getRecord().getNumTies() + ONENUM);
      ((SoccerTeam) game.getAwayTeam()).setRecordPoints(
          ((SoccerTeam) game.getAwayTeam()).getRecord().getNumWin(),
          ((SoccerTeam) game.getAwayTeam()).getRecord().getNumLoss(),
          ((SoccerTeam) game.getAwayTeam()).getRecord().getNumTies() + ONENUM);
    } else {
      ((SoccerTeam) game.getHomeTeam()).setRecordPoints
          (((SoccerTeam) game.getHomeTeam()).getRecord().getNumWin(),
              ((SoccerTeam) game.getHomeTeam()).getRecord().getNumLoss() + ONENUM,
              ((SoccerTeam) game.getHomeTeam()).getRecord().getNumTies());
      ((SoccerTeam) game.getAwayTeam()).setRecordPoints(
          ((SoccerTeam) game.getAwayTeam()).getRecord().getNumWin() + ONENUM,
          ((SoccerTeam) game.getAwayTeam()).getRecord().getNumLoss(),
          ((SoccerTeam) game.getAwayTeam()).getRecord().getNumTies());
    }
  }
}

