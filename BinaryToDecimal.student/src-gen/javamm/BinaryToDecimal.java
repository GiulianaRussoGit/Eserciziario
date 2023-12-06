package javamm;

@SuppressWarnings("all")
public class BinaryToDecimal {
  public static long decimal(int[] a) {
    long sum = 0;
    int _length = a.length;
    int n = (_length - 1);
    for (int i = 0; (i < a.length); i++) {
      {
        long _sum = sum;
        double _pow = Math.pow(2, n);
        double _multiply = (a[i] * _pow);
        sum = (_sum + ((long) _multiply));
        n = (n - 1);
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
  }
}
