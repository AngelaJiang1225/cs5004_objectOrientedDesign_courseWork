package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import javax.rmi.CORBA.Tie;
import java.util.Calendar;

import static org.junit.Assert.*;

public class SoccerGameTest {
  SoccerGame soccerGameTest;
  SoccerTeam homeTeam = new SoccerTeam("APPLE", new SoccerLeague("SOCCER",
      1, 3, 16, null));
  SoccerTeam awayTeam = new SoccerTeam("PEAR", homeTeam.getLeague());

  @Before
  public void setUp() throws Exception {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -1);
    this.soccerGameTest = new SoccerGame(this.homeTeam, this.awayTeam, date, 6, 0);
  }

  @Test
  public void getOutcome() throws FutureGameException {
    assertEquals(Outcome.NOTTIE, this.soccerGameTest.getOutcome());
  }

  @Test
  public void setOutcome() throws FutureGameException {
    this.soccerGameTest.setOutcome(6, 6);
    assertEquals(Outcome.TIE, this.soccerGameTest.getOutcome());
  }

  @Test
  public void getWinner() throws TiedGameException {
    assertEquals(this.homeTeam, this.soccerGameTest.getWinner());
  }

  @Test(expected = TiedGameException.class)
  public void getTiedWinner() throws TiedGameException {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, -1);
    SoccerGame soccerGameTest2 = new SoccerGame(this.homeTeam, this.awayTeam, date, 6, 6);
    soccerGameTest2.getWinner();
  }

  @Test
  public void updateRes() throws FutureGameException {
    this.soccerGameTest.updateRes(10, 12);
    assertTrue(this.soccerGameTest.getHomeTeamScore() == 10
        && this.soccerGameTest.getAwayTeamScore() == 12
        && this.soccerGameTest.getOutcome().equals(Outcome.NOTTIE));

  }

}