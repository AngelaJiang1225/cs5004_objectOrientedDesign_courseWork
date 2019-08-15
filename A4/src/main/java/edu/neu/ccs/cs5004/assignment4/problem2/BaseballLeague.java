package edu.neu.ccs.cs5004.assignment4.problem2;

public class BaseballLeague extends Leagues {

  /**
   * Create a baseball League.
   *
   * @param name       the name of the league
   * @param startMonth start month
   * @param endMonth   end Month
   * @param gameNumber game Number
   * @param nextGame   next Game
   * @throws IllegalArgumentException IllegalArgumentException
   */

  public BaseballLeague(String name, int startMonth, int endMonth, int gameNumber,
                        Games nextGame) throws IllegalArgumentException {
    super(name, startMonth, endMonth, gameNumber, nextGame);
  }

  /**
   * update the game.
   *
   * @param game          the baseball game
   * @param homeTeamScore the score of home team
   * @param awayTeamScore the score of away team
   */

  public void playGame(BaseballGame game, int homeTeamScore, int awayTeamScore) {
    // update the game scores
    game.updateRes(homeTeamScore, awayTeamScore);
    //update team related game fields
    game.homeTeam.setLastGame(game);
    //when the home team wins
    if (game.getWin().equals(Win.HOMETEAMWIN)) {
      ((BaseballTeam) game.getHomeTeam())
          .setRecordPoints(((BaseballTeam) game.getHomeTeam()).getRecord().getNumWin() + ONENUM,
              ((BaseballTeam) game.getHomeTeam()).getRecord().getNumLoss());
      ((BaseballTeam) game.getAwayTeam())
          .setRecordPoints(((BaseballTeam) game.getAwayTeam()).getRecord().getNumWin(),
              ((BaseballTeam) game.getAwayTeam()).getRecord().getNumLoss() + ONENUM);
    }
    //if the away team wins
    else if (game.getWin().equals(Win.AWAYTEAMWIN)) {
      ((BaseballTeam) game.getHomeTeam())
          .setRecordPoints(((BaseballTeam) game.getHomeTeam()).getRecord().getNumWin(),
              ((BaseballTeam) game.getHomeTeam()).getRecord().getNumLoss() + ONENUM);
      ((BaseballTeam) game.getAwayTeam())
          .setRecordPoints(((BaseballTeam) game.getAwayTeam()).getRecord().getNumWin() + ONENUM,
              ((BaseballTeam) game.getAwayTeam()).getRecord().getNumLoss());
    }
  }
}
