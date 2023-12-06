package javamm;

@SuppressWarnings("all")
public class ArraySum {
  public static int[] arraySum(int[] a, int[] b) {
    int[] c = new int[a.length];
    for (int i = 0; (i < a.length); i++) {
      int _plus = (a[i] + b[i]);
      c[i] = _plus;
    }
    return c;
  }
  
  public static void main(String[] args) {
  }
}
