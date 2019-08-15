public class Main1 {
  public static void main(String[] args) {
    B b = new B(123, "Delta", "SEA", "BOS");
    C c1 = new C(234, "United", "0530am", "1145pm");
    C c2 = new C(345, "Lufthansa", "BOS","SXF", "1030am", "1150pm");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(b);
  }
}
