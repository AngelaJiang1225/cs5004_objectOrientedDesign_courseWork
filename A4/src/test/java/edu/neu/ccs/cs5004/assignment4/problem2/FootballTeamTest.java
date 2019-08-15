package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class FootballTeamTest {
  FootballTeam footballTeamTest;
  FootballLeague footballLeague;

  @Before
  public void setUp() throws Exception {
    this.footballLeague = new FootballLeague("Football", 1, 3, 16,
        null);
    this.footballTeamTest = new FootballTeam("Light", footballLeague);
  }

  @Test
  public void setRecordPoints() {
    this.footballTeamTest.setRecordPoints(3, 3, 5);
    assertTrue(this.footballTeamTest.getRecord().getNumWin() == 3
        && this.footballTeamTest.getRecord().getNumLoss() == 3
        && this.footballTeamTest.getRecord().getNumTies() == 5
        && this.footballTeamTest.getPoints() == 3);
  }

  @Test
  public void getLeague() {
    assertEquals(this.footballLeague, this.footballTeamTest.getLeague());
  }

  @Test
  public void setLastGame() throws InvalidGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -1);
    FootballGame lastGame = new FootballGame(this.footballTeamTest,
        new FootballTeam("HI", this.footballLeague), date,
        3, 20);
    this.footballTeamTest.setLastGame(lastGame);
    assertEquals(lastGame, this.footballTeamTest.getLastGame());

  }
}