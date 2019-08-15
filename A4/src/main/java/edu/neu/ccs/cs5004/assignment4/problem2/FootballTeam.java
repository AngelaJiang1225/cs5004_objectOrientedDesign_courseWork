package edu.neu.ccs.cs5004.assignment4.problem2;

/**
 * Represents the football team.
 */
public class FootballTeam extends Team {
  private FootballLeague league;
  private static final int WINSCORE = 1;
  private static final int DEFAULTSCORE = 0;
  private FootballRecord record = new FootballRecord(DEFAULTSCORE, DEFAULTSCORE, DEFAULTSCORE);

  /**
   * Create a football team with details.
   *
   * @param name   the team name
   * @param league the football league
   * @throws IllegalArgumentException IllegalArgumentException
   */
  public FootballTeam(String name, FootballLeague league) throws IllegalArgumentException {
    super(name);
    this.league = league;
  }

  /**
   * return the record of the team.
   *
   * @return the record of the team
   */
  public FootballRecord getRecord() {
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
    this.points = WINSCORE * numWins;
  }

  /**
   * return the league.
   *
   * @return the league
   */
  public FootballLeague getLeague() {
    return this.league;
  }

  /**
   * set the last game.
   *
   * @param lastGame the last game
   */
  public void setLastGame(FootballGame lastGame) {
    this.lastGame = lastGame;
  }
}
