package javamm;

@SuppressWarnings("all")
public class LoneSum {
  public static int loneSum(int a, int b, int c) {
    int sum = 0;
    if ((((a != b) && (b != c)) && (a != c))) {
      sum = ((a + b) + c);
    } else {
      if (((a != b) && (a == c))) {
        sum = b;
      } else {
        if (((a != b) && (b == c))) {
          sum = a;
        } else {
          if (((a == b) && (c != a))) {
            sum = c;
          }
        }
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
  }
}
