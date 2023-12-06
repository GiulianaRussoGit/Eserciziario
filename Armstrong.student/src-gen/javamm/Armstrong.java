package javamm;

@SuppressWarnings("all")
public class Armstrong {
  public static boolean armstrong(int n) {
    int num = n;
    int cifre = 0;
    int sum = 0;
    if ((n < 10)) {
      return true;
    } else {
      while ((n > 0)) {
        {
          cifre++;
          int _n = n;
          n = (_n / 10);
        }
      }
      n = num;
      while ((n > 0)) {
        {
          double _pow = Math.pow((n % 10), cifre);
          int _plus = (sum + ((int) _pow));
          sum = _plus;
          int _n = n;
          n = (_n / 10);
        }
      }
      if ((sum == num)) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  public static void main(String[] args) {
  }
}
