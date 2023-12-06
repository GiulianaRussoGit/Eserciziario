package javamm;

@SuppressWarnings("all")
public class LexCompare {
  public static boolean lexCompare(int a, int b) {
    if ((a == b)) {
      return false;
    } else {
      String s1 = Integer.toString(a);
      String s2 = Integer.toString(b);
      int min = Math.min(s1.length(), s2.length());
      int k = LexCompare.check(s1, s2, min);
      if (((k < min) && (s1.charAt(k) < s2.charAt(k)))) {
        return true;
      } else {
        if (((k == min) && (s1.length() == min))) {
          return true;
        } else {
          return false;
        }
      }
    }
  }
  
  public static int check(String a, String b, int min) {
    int k = 0;
    for (int i = 0; (i < min); i++) {
      char _charAt = a.charAt(i);
      char _charAt_1 = b.charAt(i);
      boolean _tripleEquals = (_charAt == _charAt_1);
      if (_tripleEquals) {
        k++;
      } else {
        break;
      }
    }
    return k;
  }
  
  public static void main(String[] args) {
  }
}
