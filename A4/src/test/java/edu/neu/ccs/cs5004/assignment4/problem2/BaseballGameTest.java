package edu.neu.ccs.cs5004.assignment4.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class BaseballGameTest {
  BaseballGame baseballGameTest;
  BaseballGame baseballGameTest2;

  @Before
  public void setUp() {
    BaseballLeague league = new BaseballLeague("Seattle", 1, 3,
        16, null);
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, 1); // set the date to be in the future
    this.baseballGameTest = new BaseballGame(new BaseballTeam("Seattle Cup", league),
        new BaseballTeam("Seattle Dish", league),
        date,
        22, 16);

    Calendar pastDate = Calendar.getInstance();
    pastDate.add(Calendar.DAY_OF_YEAR, -1);
    this.baseballGameTest2 = new BaseballGame(new BaseballTeam("Seattle Cup", new BaseballLeague("Seattle", 1, 3,
        16, null)),
        new BaseballTeam("Seattle Dish", new BaseballLeague("Seattle", 1, 3,
            16, null)),
        pastDate,
        22, 16);
  }

  @Test
  public void checkFutureDate() {
    assertTrue(this.baseballGameTest.getHomeTeamScore() == 0 && this.baseballGameTest.getAwayTeamScore() == 0);
  }

  @Test
  public void checkPastDate() {
    assertTrue(this.baseballGameTest2.getHomeTeamScore() == 22 && this.baseballGameTest2.getAwayTeamScore() == 16);

  }

  @Test
  public void getHomeTeam() {
    assertTrue((this.baseballGameTest.getHomeTeam().getName()).equals("Seattle Cup") &&
        ((BaseballTeam) (this.baseballGameTest.getHomeTeam())).getLeague().getGameNumber() == 16
        && ((BaseballTeam) (this.baseballGameTest.getHomeTeam())).getLeague().getEndMonth() == 3 &&
        ((BaseballTeam) (this.baseballGameTest.getHomeTeam())).getLeague().getStartMonth() == 1);
  }

  @Test
  public void getAwayTeam() {
    assertTrue((this.baseballGameTest.getAwayTeam().getName()).equals("Seattle Dish") &&
        ((BaseballTeam) this.baseballGameTest.getAwayTeam()).getLeague().getGameNumber() == 16
        && ((BaseballTeam) this.baseballGameTest.getAwayTeam()).getLeague().getEndMonth() == 3 &&
        ((BaseballTeam) this.baseballGameTest.getAwayTeam()).getLeague().getStartMonth() == 1);
  }

  @Test
  public void getDate() {
    Calendar date = Calendar.getInstance();
    date.add(Calendar.DAY_OF_YEAR, 1);
    assertTrue(this.baseballGameTest.getDate().get(Calendar.YEAR) == date.get(Calendar.YEAR)
        && this.baseballGameTest.getDate().get(Calendar.MONTH) == date.get(Calendar.MONTH)
        && this.baseballGameTest.getDate().get(Calendar.DAY_OF_MONTH) == date.get(Calendar.DAY_OF_MONTH));
  }

  @Test
  public void getHomeTeamScore() {
    assertEquals(0, this.baseballGameTest.getHomeTeamScore());
  }

  @Test
  public void getAwayTeamScore() {
    assertEquals(0, this.baseballGameTest.getAwayTeamScore());
  }

  @Test
  public void setHomeTeamScore() {
    this.baseballGameTest.setHomeTeamScore(11);
    assertEquals(0, this.baseballGameTest.getHomeTeamScore());
  }

  @Test
  public void setAwayTeamScore() {
    Calendar pastDate = Calendar.getInstance();
    pastDate.add(Calendar.DAY_OF_YEAR, -1);
    BaseballGame baseballGameTest3 = new BaseballGame(new BaseballTeam("Seattle Cup", new BaseballLeague("Seattle", 1, 3,
        16, null)),
        new BaseballTeam("Seattle Dish", new BaseballLeague("Seattle", 1, 3,
            16, null)),
        pastDate,
        22, 16);
    baseballGameTest3.setAwayTeamScore(11);
    assertEquals(11, baseballGameTest3.getAwayTeamScore());
  }

  @Test
  public void getWin() {
    assertEquals(Win.HOMETEAMWIN, this.baseballGameTest2.getWin());
  }

  @Test
  public void getWinner() {
    assertTrue(this.baseballGameTest2.getWinner().getName().equals(this.baseballGameTest2.getHomeTeam().getName())
        && ((BaseballTeam) this.baseballGameTest2.getWinner()).getLeague().equals(((BaseballTeam) this.baseballGameTest2.getHomeTeam()).getLeague())
        && ((BaseballTeam) this.baseballGameTest2.getWinner()).getGamePlayed() == this.baseballGameTest2.getHomeTeam().getGamePlayed()
        && ((BaseballTeam) this.baseballGameTest2.getWinner()).getGameRemained() == this.baseballGameTest2.getHomeTeam().getGameRemained());
  }

  @Test
  public void updateRes() {
    Calendar pastDate = Calendar.getInstance();
    pastDate.add(Calendar.DAY_OF_YEAR, -1);
    BaseballGame baseballGameTest4 = new BaseballGame(new BaseballTeam("Seattle Cup", new BaseballLeague("Seattle", 1, 3,
        16, null)),
        new BaseballTeam("Seattle Dish", new BaseballLeague("Seattle", 1, 3,
            16, null)),
        pastDate,
        0, 0);
    baseballGameTest4.updateRes(13, 22);
    assertTrue(baseballGameTest4.getHomeTeamScore() == 13 &&
        baseballGameTest4.getAwayTeamScore() == 22
        && baseballGameTest4.getWin().equals(Win.AWAYTEAMWIN));
  }

}