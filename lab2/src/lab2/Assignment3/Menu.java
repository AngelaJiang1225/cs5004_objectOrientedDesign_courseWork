package lab2.Assignment3;

public class Menu {
  private String meals;
  private String desserts;
  private String beverages;
  private String drinks;

  /**
   *
   * @param meals
   * @param desserts
   * @param beverages
   * @param drinks
   */
  public Menu(String meals, String desserts, String beverages, String drinks) {
    this.meals = meals;
    this.desserts = desserts;
    this.beverages = beverages;
    this.drinks = drinks;
  }

  /**
   *
   * @return meals
   */
  public String getMeals() {
    return meals;
  }

  /**
   *
   * @param meals
   */
  public void setMeals(String meals) {
    this.meals = meals;
  }

  /**
   *
   * @return desserts
   */
  public String getDesserts() {
    return desserts;
  }

  /**
   *
   * @param desserts
   */
  public void setDesserts(String desserts) {
    this.desserts = desserts;
  }

  /**
   *
   * @return beverages
   */
  public String getBeverages() {
    return beverages;
  }

  /**
   *
   * @param beverages
   */
  public void setBeverages(String beverages) {
    this.beverages = beverages;
  }

  /**
   *
   * @return drinks
   */
  public String getDrinks() {
    return drinks;
  }

  /**
   *
   * @param drinks
   */
  public void setDrinks(String drinks) {
    this.drinks = drinks;
  }
}
