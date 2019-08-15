package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represent the baseball team.
 */
public class BaseballTeam extends Team {
  private BaseballLeague league;
  private static final int WINSCORE = 1;
  private static final int DEFAULTSCORE = 0;
  private BaseballRecord record = new BaseballRecord(DEFAULTSCORE, DEFAULTSCORE);

  /**
   * Create the baseball team with details.
   *
   * @param name   the name of the team
   * @param league the league  of the team
   * @throws IllegalArgumentException IllegalArgumentException
   */
  public BaseballTeam(String name, BaseballLeague league) throws IllegalArgumentException {
    super(name);
    this.league = league;
  }

  /**
   * true if the number of games is equal to the number of played games plus the number of.
   * remained games.
   *
   * @return true if the number of games is correct
   */
  private boolean checkGameNumber(int gamePlayed, int gameRemained)
      throws IllegalArgumentException {
    if (gamePlayed < MINNUM || gameRemained < MINNUM) {
      throw new IllegalArgumentException("The number of played games and game remained should "
          + "be bigger or equal to 0!");
    }
    if (gamePlayed + gameRemained != this.league.getGameNumber()) {
      throw new IllegalArgumentException(
          "The number of played games plus games remaining should equals to the "
              + "number of game number in league!");
    }
    return true;
  }

  /**
   * return the record of the team.
   *
   * @return the record of the team
   */
  public BaseballRecord getRecord() {
    return this.record;
  }

  /**
   * return the league.
   *
   * @return the league
   */
  public BaseballLeague getLeague() {
    return this.league;
  }

  /**
   * set the points for baseball.
   *
   * @param numWins the number of wins
   * @param numLoss the number of losses
   */
  public void setRecordPoints(int numWins, int numLoss) {
    this.getRecord().setNumWin(numWins);
    this.getRecord().setNumLoss(numLoss);
    this.points = WINSCORE * numWins;
  }

  /**
   * set the number of game played.
   *
   * @param gamePlayed the game played
   */

  public void setGamePlayed(int gamePlayed) {
    this.gamePlayed = gamePlayed;
    this.gameRemained = this.league.getGameNumber() - this.gamePlayed;
  }
}