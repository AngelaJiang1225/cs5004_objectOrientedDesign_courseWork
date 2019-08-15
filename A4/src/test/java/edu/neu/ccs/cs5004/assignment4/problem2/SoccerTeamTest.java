package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class SoccerTeamTest {
  SoccerTeam soccerTeamTest;
  SoccerLeague soccerLeague;

  @Before
  public void setUp() throws Exception {
    this.soccerLeague = new SoccerLeague("Soccer", 1, 3, 16,
        null);
    this.soccerTeamTest = new SoccerTeam("Light", soccerLeague);
  }

  @Test
  public void getRecord() {
  }

  @Test
  public void setRecordPoints() {
    this.soccerTeamTest.setRecordPoints(3, 3, 5);
    assertTrue(this.soccerTeamTest.getRecord().getNumWin() == 3
        && this.soccerTeamTest.getRecord().getNumLoss() == 3
        && this.soccerTeamTest.getRecord().getNumTies() == 5
        && this.soccerTeamTest.getPoints() == 14);
  }

  @Test
  public void getLeague() {
    assertEquals(this.soccerLeague, this.soccerTeamTest.getLeague());
  }

  @Test
  public void setLastGame() throws InvalidGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -1);
    SoccerGame lastGame = new SoccerGame(this.soccerTeamTest,
        new SoccerTeam("HI", this.soccerLeague), date,
        3, 20);
    this.soccerTeamTest.setLastGame(lastGame);
    assertEquals(lastGame, this.soccerTeamTest.getLastGame());
  }
}