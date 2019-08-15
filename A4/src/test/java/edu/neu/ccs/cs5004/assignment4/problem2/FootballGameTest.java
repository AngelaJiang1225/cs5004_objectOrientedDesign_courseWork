package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import javax.rmi.CORBA.Tie;
import java.util.Calendar;

import static org.junit.Assert.*;

public class FootballGameTest {

  FootballGame footballGameTest;

  @Before
  public void setUp() throws Exception {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -3);
    FootballLeague footballLeague = new FootballLeague("WA", 1, 3, 16, null);
    FootballTeam homeTeam = new FootballTeam("WISH", footballLeague);
    FootballTeam awayTeam = new FootballTeam("HOPE", footballLeague);
    this.footballGameTest = new FootballGame(homeTeam, awayTeam, date, 3, 22);

  }

  @Test
  public void setOutcome() throws FutureGameException {
    this.footballGameTest.setOutcome(22, 22);
    assertEquals(Outcome.TIE, this.footballGameTest.getOutcome());
  }

  @Test
  public void getOutcome() throws FutureGameException {
    assertEquals(Outcome.NOTTIE, this.footballGameTest.getOutcome());
  }

  @Test(expected = FutureGameException.class)
  public void getFutureOutcome() throws FutureGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, 2);
    FootballLeague footballLeague = new FootballLeague("WA", 1, 3, 16, null);
    FootballTeam homeTeam = new FootballTeam("WISH", footballLeague);
    FootballTeam awayTeam = new FootballTeam("HOPE", footballLeague);
    FootballGame footballGameTest2 = new FootballGame(homeTeam, awayTeam, date, 3, 22);
    footballGameTest2.getOutcome();
  }

  @Test
  public void getWinner() throws TiedGameException {
    assertEquals(this.footballGameTest.getAwayTeam(), this.footballGameTest.getWinner());
  }

  @Test(expected = TiedGameException.class)
  public void getTiedWinner() throws TiedGameException {
    this.footballGameTest.setOutcome(22, 22);
    this.footballGameTest.getWinner();
  }

  @Test
  public void updateRes() throws FutureGameException {
    this.footballGameTest.updateRes(22, 22);
    assertTrue(this.footballGameTest.getAwayTeamScore() == 22
        && this.footballGameTest.getHomeTeamScore() == 22
        && this.footballGameTest.getOutcome().equals(Outcome.TIE));
  }
}