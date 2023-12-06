package javamm;

@SuppressWarnings("all")
public class Amicable {
  public static boolean amicable(int a, int b) {
    if ((((a == b) || (a == 0)) || (b == 0))) {
      return false;
    } else {
      int a1 = Amicable.somma(a);
      int b1 = Amicable.somma(b);
      if (((a1 == b) && (b1 == a))) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  public static int somma(int a) {
    int sum = 1;
    for (int i = 2; (i <= (a / 2)); i++) {
      if (((a % i) == 0)) {
        int _sum = sum;
        sum = (_sum + i);
      }
    }
    return sum;
  }
  
  public static void main(String[] args) {
  }
}
