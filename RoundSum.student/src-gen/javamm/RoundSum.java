package javamm;

@SuppressWarnings("all")
public class RoundSum {
  public static int roundSum(int a, int b, int c) {
    a = RoundSum.round(a);
    b = RoundSum.round(b);
    c = RoundSum.round(c);
    return ((a + b) + c);
  }
  
  public static int round(int a) {
    int check = (a % 10);
    if ((check >= 5)) {
      int _a = a;
      return a = (_a + (10 - check));
    } else {
      int _a_1 = a;
      return a = (_a_1 - check);
    }
  }
  
  public static void main(String[] args) {
  }
}
