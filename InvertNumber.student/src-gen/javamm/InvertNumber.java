package javamm;

@SuppressWarnings("all")
public class InvertNumber {
  public static int invertNumber(int n) {
    int value = 0;
    while ((n > 0)) {
      {
        int a = (n % 10);
        int _n = n;
        n = (_n / 10);
        value = ((value * 10) + a);
      }
    }
    return value;
  }
  
  public static void main(String[] args) {
  }
}
