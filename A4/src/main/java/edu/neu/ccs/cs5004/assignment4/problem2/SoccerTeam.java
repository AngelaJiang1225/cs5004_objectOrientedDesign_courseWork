package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents the soccer team.
 */

public class SoccerTeam extends Team {
  private SoccerLeague league;
  private static final int WINSCORE = 3;
  private static final int TIESCORE = 1;
  private static final int LOSSSCORE = 0;
  private static final int DEFAULTSCORE = 0;
  private SoccerRecord record = new SoccerRecord(DEFAULTSCORE, DEFAULTSCORE, DEFAULTSCORE);

  /**
   * Create a soccer team with details.
   *
   * @param name   the name of the team
   * @param league the league of the team
   * @throws IllegalArgumentException IllegalArgumentException
   */

  public SoccerTeam(String name, SoccerLeague league) throws IllegalArgumentException {
    super(name);
    this.league = league;
  }

  /**
   * return the record of the team.
   *
   * @return the record of the team
   */
  public SoccerRecord getRecord() {
    return this.record;
  }

  /**
   * set the points for baseball.
   *
   * @param numWins the number of wins
   * @param numLoss the number of losses
   */
  public void setRecordPoints(int numWins, int numLoss, int numTies) {
    this.getRecord().setNumWin(numWins);
    this.getRecord().setNumLoss(numLoss);
    this.getRecord().setNumTies(numTies);
    this.points = WINSCORE * numWins + TIESCORE * numTies + LOSSSCORE * numLoss;
  }

  /**
   * return the league.
   *
   * @return the league
   */
  public SoccerLeague getLeague() {
    return league;
  }

  /**
   * set the last game.
   *
   * @param lastGame the last game
   */
  public void setLastGame(SoccerGame lastGame) {
    this.lastGame = lastGame;
  }
}
