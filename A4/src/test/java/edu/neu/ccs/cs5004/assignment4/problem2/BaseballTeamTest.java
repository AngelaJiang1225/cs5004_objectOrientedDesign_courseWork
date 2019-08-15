package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class BaseballTeamTest {
  BaseballTeam baseballTeamTest;


  @Before
  public void setUp() throws Exception {
    this.baseballTeamTest = new BaseballTeam("Pork", new BaseballLeague("Pork family", 1, 3,
        16, null));
  }

  @Test
  public void getName() {
    assertEquals("Pork", this.baseballTeamTest.getName());
  }

  @Test
  public void getLeague() {
    assertTrue(this.baseballTeamTest.getLeague().getName().equals("Pork family")
        && this.baseballTeamTest.getLeague().getGameNumber() == 16
        && this.baseballTeamTest.getLeague().getStartMonth() == 1
        && this.baseballTeamTest.getLeague().getEndMonth() == 3
        && this.baseballTeamTest.getLeague().getNextGame() == null);
  }

  @Test
  public void getGamePlayed() {
    assertEquals(0, this.baseballTeamTest.getGamePlayed());
  }

  @Test
  public void getGameRemained() {
    assertEquals(0, this.baseballTeamTest.getGameRemained());
  }

  @Test
  public void getPoints() {
    assertEquals(0, this.baseballTeamTest.getPoints());
  }

  @Test(expected = InvalidGameException.class)
  public void getLastGame() throws InvalidGameException {
    this.baseballTeamTest.getLastGame();
  }

  @Test
  public void isOffSeason() {
    assertEquals(true, this.baseballTeamTest.isOffSeason());
  }

  @Test
  public void setGamePlayed() {
    this.baseballTeamTest.setGamePlayed(2);
    assertTrue(this.baseballTeamTest.getGamePlayed() == 2 &&
        this.baseballTeamTest.getGameRemained() == this.baseballTeamTest.getLeague().getGameNumber() - 2);
  }

  @Test
  public void setLastGame() throws InvalidGameException {
    BaseballTeam homeTeam = new BaseballTeam("Pork", new BaseballLeague("Pork family", 1, 3,
        16, null));
    BaseballTeam awayTeam = new BaseballTeam("Fish", homeTeam.getLeague());
    BaseballGame lastGame = new BaseballGame(homeTeam, awayTeam, Calendar.getInstance(), 23, 16);
    this.baseballTeamTest.setLastGame(lastGame);
    assertTrue(this.baseballTeamTest.getGamePlayed() == 1
        && this.baseballTeamTest.getGameRemained() == 15);
    //this.baseballTeamTest.getLastGame().equals(lastGame) &&
  }

  @Test
  public void setOffSeason() {
    this.baseballTeamTest.setOffSeason(false);
    assertEquals(false, this.baseballTeamTest.isOffSeason());

  }

  @Test
  public void getRecord() {
    assertTrue(this.baseballTeamTest.getRecord().getNumWin() == 0 && this.baseballTeamTest.getRecord().getNumLoss() == 0);
  }

  @Test
  public void setRecordPoints() {
    this.baseballTeamTest.setRecordPoints(1, 3);
    assertTrue(this.baseballTeamTest.getRecord().getNumWin() == 1
        && this.baseballTeamTest.getRecord().getNumLoss() == 3
        && this.baseballTeamTest.getPoints() == 1);
  }
}