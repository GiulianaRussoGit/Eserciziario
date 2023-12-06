package javamm;

@SuppressWarnings("all")
public class Range {
  public static boolean range(int n, int l, int r, boolean o) {
    if ((Boolean.valueOf(o) == Boolean.valueOf(true))) {
      if (((n < l) || (n > r))) {
        return true;
      } else {
        return false;
      }
    } else {
      if (((n >= l) && (n <= r))) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  public static void main(String[] args) {
  }
}
