package edu.neu.ccs.cs5004.assignment4.problem2;

import java.util.Calendar;

/**
 * represents the league with details.
 */
public abstract class Leagues {

  protected String name;
  protected Integer startMonth;//the start month of season
  protected Integer endMonth; // the end month of season
  protected int gameNumber; //the number of games played by each team in the league.
  protected Games nextGame;
  protected static final int MINMONTH = 1;
  protected static final int MAXMONTH = 12;
  protected static final int DEFAULTSCORE = 0;
  protected static final int ONENUM = 1;

  /**
   * Create a league with parameters.
   *
   * @param name       the name of league
   * @param startMonth the start month of league
   * @param endMonth   the end month of league
   * @param gameNumber the numbers of game the league has
   * @param nextGame   the next game
   */
  public Leagues(String name, int startMonth, int endMonth, int gameNumber,
                 Games nextGame) throws IllegalArgumentException {
    this.name = name;
    if (this.checkSeason(startMonth, endMonth)) {
      this.startMonth = startMonth;
      this.endMonth = endMonth;
    }
    this.gameNumber = gameNumber;
    this.nextGame = nextGame;
  }

  /**
   * check if the season is legal.
   *
   * @return true if the season months is legal,else return false
   */
  private boolean checkSeason(int startMonth, int endMonth) throws IllegalArgumentException {
    if (startMonth >= MINMONTH && endMonth <= MAXMONTH) {
      return true;
    } else {
      throw new IllegalArgumentException("The season months are not legal!");
    }
  }

  /**
   * return name.
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * return start month.
   *
   * @return start month
   */
  public Integer getStartMonth() {
    return this.startMonth;
  }

  /**
   * return end month.
   *
   * @return end month
   */
  public Integer getEndMonth() {
    return endMonth;
  }

  /**
   * return number of games.
   *
   * @return number of games
   */
  public int getGameNumber() {
    return gameNumber;
  }

  /**
   * return the next game.
   *
   * @return the next game
   */
  public Games getNextGame() {
    return nextGame;
  }

  /**
   * compare the two teams of their points.
   *
   * @param team1 the first team to be compared
   * @param team2 the second team to be compared
   * @return the team of winner
   */
  public Team compareTeam(Team team1, Team team2)
      throws TiedTeamsException, IllegalArgumentException {
    if ((team1 instanceof BaseballTeam && team2 instanceof BaseballTeam
        && ((BaseballTeam) team1).getLeague().equals(((BaseballTeam) team2).getLeague()))
        || (team1 instanceof FootballTeam && team2 instanceof FootballTeam
        && ((FootballTeam) team1).getLeague().equals(((FootballTeam) team2).getLeague()))
        || (team1 instanceof SoccerTeam && team2 instanceof SoccerTeam
        && ((SoccerTeam) team1).getLeague().equals(((SoccerTeam) team2).getLeague()))) {

      if (team1.getPoints() > team2.getPoints()) {
        return team1;
      } else if (team1.getPoints() < team1.getPoints()) {
        return team2;
      } else {
        throw new TiedTeamsException("Team1 and team2 is tied,cannot be compared!");
      }
    } else {
      throw new IllegalArgumentException("The two teams are not in the same league!");
    }
  }


  /**
   * set the next game.
   *
   * @param nextGame the next game of the league
   */
  public void setNextGame(Games nextGame) {
    this.nextGame = nextGame;
  }

  /**
   * Create a game between two teams on a given date.
   *
   * @param homeTeam the home team of the league
   * @param awayTeam the away team of the ;eague
   * @param date     the date of the league
   * @return the next gamex
   */
  public Games scheduleGame(Team homeTeam, Team awayTeam, Calendar date) {
    if (date.get(Calendar.MONTH) >= this.startMonth && date.get(Calendar.MONTH) <= this.endMonth) {
      homeTeam.setOffSeason(false);
      awayTeam.setOffSeason(false);
    } else {
      homeTeam.setOffSeason(true);
      awayTeam.setOffSeason(true);
    }
    if (homeTeam instanceof FootballTeam) {

      FootballGame newGame = new FootballGame(homeTeam, awayTeam, date, DEFAULTSCORE, DEFAULTSCORE);
      this.setNextGame(newGame);

    } else if (homeTeam instanceof FootballTeam) {
      SoccerGame newGame = new SoccerGame(homeTeam, awayTeam, date, DEFAULTSCORE, DEFAULTSCORE);
      this.setNextGame(newGame);
    } else {
      BaseballGame newGame = new BaseballGame(homeTeam, awayTeam, date, DEFAULTSCORE, DEFAULTSCORE);
      this.setNextGame(newGame);
    }
    return this.getNextGame();
  }


}


