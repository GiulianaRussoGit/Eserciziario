package javamm;

@SuppressWarnings("all")
public class ScalarProduct {
  public static int scalarProduct(int[] a, int[] b) {
    int scalar = 0;
    int lunghezza = a.length;
    for (int i = 0; (i < lunghezza); i++) {
      int _scalar = scalar;
      int _multiply = (a[i] * b[i]);
      scalar = (_scalar + _multiply);
    }
    return scalar;
  }
  
  public static void main(String[] args) {
  }
}
