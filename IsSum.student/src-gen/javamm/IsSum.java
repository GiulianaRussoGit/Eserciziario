package javamm;

@SuppressWarnings("all")
public class IsSum {
  public static boolean isSum(int a, int b, int c) {
    if (((((a + b) == c) || ((a + c) == b)) || ((c + b) == a))) {
      return true;
    } else {
      return false;
    }
  }
  
  public static void main(String[] args) {
  }
}
