package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class FootballLeagueTest {
  FootballLeague footballLeagueTest;

  @Before
  public void setUp() throws Exception {
    this.footballLeagueTest = new FootballLeague("Football", 1, 3, 16, null);
  }

  @Test
  public void getName() {
    assertEquals("Football", this.footballLeagueTest.getName());
  }

  @Test
  public void getStartMonth() {
    assertTrue(this.footballLeagueTest.getStartMonth() == 1);
  }

  @Test
  public void getEndMonth() {
    assertTrue(this.footballLeagueTest.getEndMonth() == 3);
  }

  @Test
  public void getGameNumber() {
    assertTrue(this.footballLeagueTest.getGameNumber() == 16);
  }

  @Test
  public void getNextGame() {
    assertTrue(this.footballLeagueTest.getNextGame() == null);
  }

  @Test
  public void compareTeam() throws TiedTeamsException, IllegalArgumentException {
    FootballTeam footballTeam1 = new FootballTeam("HELLO", this.footballLeagueTest);
    footballTeam1.setRecordPoints(3, 2, 5);
    FootballTeam footballTeam2 = new FootballTeam("HI", this.footballLeagueTest);
    footballTeam2.setRecordPoints(2, 3, 5);
    Team winTeam = this.footballLeagueTest.compareTeam(footballTeam1, footballTeam2);
    assertEquals(footballTeam1, winTeam);

  }

  @Test(expected = TiedTeamsException.class)
  public void compareTiedTeam() throws TiedTeamsException, IllegalArgumentException {
    FootballTeam footballTeam1 = new FootballTeam("HELLO", this.footballLeagueTest);
    footballTeam1.setRecordPoints(3, 2, 5);
    FootballTeam footballTeam2 = new FootballTeam("HI", this.footballLeagueTest);
    footballTeam2.setRecordPoints(3, 2, 5);
    this.footballLeagueTest.compareTeam(footballTeam1, footballTeam2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void compareIllegalTeam() throws TiedTeamsException, IllegalArgumentException {
    FootballTeam footballTeam1 = new FootballTeam("HELLO", this.footballLeagueTest);
    footballTeam1.setRecordPoints(3, 2, 5);
    FootballTeam footballTeam2 = new FootballTeam("HI", new FootballLeague("SEA", 2, 3, 16, null));
    footballTeam2.setRecordPoints(5, 2, 5);
    this.footballLeagueTest.compareTeam(footballTeam1, footballTeam2);
  }

  @Test
  public void setNextGame() {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, 3);
    FootballGame footballGame = new FootballGame(new FootballTeam("LIGHT", this.footballLeagueTest), new FootballTeam(
        "Dark", this.footballLeagueTest), date,
        3, 3);
    this.footballLeagueTest.setNextGame(footballGame);
    assertEquals(footballGame, this.footballLeagueTest.getNextGame());
  }

  @Test
  public void scheduleGame() {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, 3);
    FootballGame newGame = new FootballGame(new FootballTeam("LIGHT", this.footballLeagueTest), new FootballTeam(
        "Dark", this.footballLeagueTest), date,
        3, 3);
    this.footballLeagueTest.setNextGame(newGame);
    assertEquals(newGame, this.footballLeagueTest.getNextGame());

  }

  @Test
  public void playTieGame() throws FutureGameException, TiedGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -3);
    FootballTeam homeTeam = new FootballTeam("HELLO", this.footballLeagueTest);
    FootballTeam awayTeam = new FootballTeam("HI", this.footballLeagueTest);
    FootballGame newGame = new FootballGame(homeTeam, awayTeam, date, 0, 0);
    this.footballLeagueTest.playGame(newGame, 3, 3);
    assertTrue(homeTeam.getRecord().getNumTies() == 1 && awayTeam.getRecord().getNumTies() == 1
        && homeTeam.getPoints() == 0 && awayTeam.getPoints() == 0);
  }

  @Test
  public void playHomeWinGame() throws FutureGameException, TiedGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -3);
    FootballTeam homeTeam = new FootballTeam("HELLO", this.footballLeagueTest);
    FootballTeam awayTeam = new FootballTeam("HI", this.footballLeagueTest);
    FootballGame newGame = new FootballGame(homeTeam, awayTeam, date, 0, 0);
    this.footballLeagueTest.playGame(newGame, 4, 3);
    assertTrue(homeTeam.getRecord().getNumWin() == 1 && awayTeam.getRecord().getNumWin() == 0
        && homeTeam.getPoints() == 1 && awayTeam.getPoints() == 0);
  }

  @Test
  public void playAwayWinGame() throws FutureGameException, TiedGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -3);
    FootballTeam homeTeam = new FootballTeam("HELLO", this.footballLeagueTest);
    FootballTeam awayTeam = new FootballTeam("HI", this.footballLeagueTest);
    FootballGame newGame = new FootballGame(homeTeam, awayTeam, date, 0, 0);
    this.footballLeagueTest.playGame(newGame, 3, 4);
    assertTrue(homeTeam.getRecord().getNumWin() == 0 && awayTeam.getRecord().getNumWin() == 1
        && homeTeam.getPoints() == 0 && awayTeam.getPoints() == 1);
  }

}