package javamm;

@SuppressWarnings("all")
public class EvenlySpaced {
  public static boolean evenlySpaced(int a, int b, int c) {
    if ((((a == b) || (a == c)) || (c == b))) {
      return false;
    } else {
      if (((a == b) && (a == c))) {
        return true;
      } else {
        int min = EvenlySpaced.min(a, b, c);
        int max = EvenlySpaced.max(a, b, c);
        int mid = EvenlySpaced.mid(a, b, c);
        if (((mid - min) == (max - mid))) {
          return true;
        } else {
          return false;
        }
      }
    }
  }
  
  public static int min(int a, int b, int c) {
    if (((a < b) && (a < c))) {
      return a;
    } else {
      if (((b < a) && (b < c))) {
        return b;
      } else {
        return c;
      }
    }
  }
  
  public static int max(int a, int b, int c) {
    if (((a > b) && (a > c))) {
      return a;
    } else {
      if (((b > a) && (b > c))) {
        return b;
      } else {
        return c;
      }
    }
  }
  
  public static int mid(int a, int b, int c) {
    if ((((a > b) && (a < c)) || ((a > c) && (a < b)))) {
      return a;
    } else {
      if ((((b > a) && (b < c)) || ((b > c) && (b < a)))) {
        return b;
      } else {
        return c;
      }
    }
  }
  
  public static void main(String[] args) {
  }
}
