package javamm;

@SuppressWarnings("all")
public class LastDigit {
  public static boolean lastDigit(int a, int b, int c) {
    int lastDigitA = (a % 10);
    int lastDigitB = (b % 10);
    int lastDigitC = (c % 10);
    if ((((lastDigitA == lastDigitB) || (lastDigitA == lastDigitC)) || (lastDigitB == lastDigitC))) {
      return true;
    } else {
      return false;
    }
  }
  
  public static void main(String[] args) {
  }
}
