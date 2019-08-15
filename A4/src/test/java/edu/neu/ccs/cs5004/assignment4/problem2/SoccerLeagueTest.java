package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class SoccerLeagueTest {
  SoccerLeague soccerLeagueTest;

  @Before
  public void setUp() throws Exception {
    this.soccerLeagueTest = new SoccerLeague("Soccer", 1, 3, 16, null);
  }

  @Test
  public void playTieGame() throws FutureGameException, TiedGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -3);
    SoccerTeam homeTeam = new SoccerTeam("HELLO", this.soccerLeagueTest);
    SoccerTeam awayTeam = new SoccerTeam("HI", this.soccerLeagueTest);
    SoccerGame newGame = new SoccerGame(homeTeam, awayTeam, date, 0, 0);
    this.soccerLeagueTest.playGame(newGame, 3, 3);
    assertTrue(homeTeam.getRecord().getNumTies() == 1 && awayTeam.getRecord().getNumTies() == 1
        && homeTeam.getPoints() == 1 && awayTeam.getPoints() == 1);
  }

  @Test
  public void playHomeWinGame() throws FutureGameException, TiedGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -3);
    SoccerTeam homeTeam = new SoccerTeam("HELLO", this.soccerLeagueTest);
    SoccerTeam awayTeam = new SoccerTeam("HI", this.soccerLeagueTest);
    SoccerGame newGame = new SoccerGame(homeTeam, awayTeam, date, 0, 0);
    this.soccerLeagueTest.playGame(newGame, 4, 3);
    assertTrue(homeTeam.getRecord().getNumWin() == 1 && awayTeam.getRecord().getNumWin() == 0
        && homeTeam.getPoints() == 3 && awayTeam.getPoints() == 0);
  }

  @Test
  public void playAwayWinGame() throws FutureGameException, TiedGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -3);
    SoccerTeam homeTeam = new SoccerTeam("HELLO", this.soccerLeagueTest);
    SoccerTeam awayTeam = new SoccerTeam("HI", this.soccerLeagueTest);
    SoccerGame newGame = new SoccerGame(homeTeam, awayTeam, date, 0, 0);
    this.soccerLeagueTest.playGame(newGame, 3, 4);
    assertTrue(homeTeam.getRecord().getNumWin() == 0 && awayTeam.getRecord().getNumWin() == 1
        && homeTeam.getPoints() == 0 && awayTeam.getPoints() == 3);
  }

}