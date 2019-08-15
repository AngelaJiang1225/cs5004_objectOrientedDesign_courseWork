package edu.neu.ccs.cs5004.assignment4.problem2;
// In the off
//season, all numbers should be set to 0

/**
 * represents a team with details.
 */
public abstract class Team {

  protected String name;
  protected int gamePlayed; //the number of games played in the current season, a number greater
  //than or equal to zero. If the team is off season, this should be set to 0.
  protected int gameRemained;
  protected int points;
  protected Games lastGame;
  protected boolean offSeason;
  protected static final int MINNUM = 0;
  protected static final int ONEGAME = 1;

  /**
   * Create a team with details.
   *
   * @param name the name of the team
   */
  public Team(String name)
      throws IllegalArgumentException {
    //When a team is first created, it is in the off season and the last game field is null
    this.name = name;
    this.lastGame = null;
    this.gamePlayed = MINNUM;
    this.gameRemained = MINNUM;
    this.points = MINNUM;
    this.lastGame = null;
    this.offSeason = true;
  }


  /**
   * return name.
   *
   * @return name
   */
  public String getName() {
    return this.name;
  }


  /**
   * return the number of played games.
   *
   * @return the number of played games
   */
  public int getGamePlayed() {
    return this.gamePlayed;
  }

  /**
   * return the number of remained games.
   *
   * @return the number of remained games
   */
  public int getGameRemained() {
    return this.gameRemained;
  }

  /**
   * return the points of the team.
   *
   * @return the points of the team
   */
  public int getPoints() {
    return this.points;
  }

  /**
   * update records for football and soccer.
   *
   * @return the last game of the team
   */
  public Games getLastGame() throws InvalidGameException {
    if (this.lastGame == null) {
      throw new InvalidGameException("There is no last game!");
    } else {
      return this.lastGame;
    }
  }

  /**
   * return the value of offseason.
   *
   * @return the value of offseason
   */
  public boolean isOffSeason() {
    return this.offSeason;
  }


  /**
   * set the value of offseason.
   *
   * @param offSeason whether off season is true or not
   */
  public void setOffSeason(boolean offSeason) {
    this.offSeason = offSeason;
  }

  /**
   * Update the most recently played game.
   *
   * @param game the game that is recently played
   */
  public void setLastGame(Games game) {
    this.gamePlayed = this.getGamePlayed() + ONEGAME;
    if (game instanceof BaseballGame) {
      this.gameRemained = ((BaseballTeam) this).getLeague().getGameNumber() - this.gamePlayed;
    } else if (game instanceof FootballGame) {
      this.gameRemained = ((FootballTeam) this).getLeague().getGameNumber() - this.gamePlayed;
    } else {
      this.gameRemained = ((SoccerTeam) this).getLeague().getGameNumber() - this.gamePlayed;
    }
    this.lastGame = game;
  }
}



