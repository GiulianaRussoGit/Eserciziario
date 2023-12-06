package javamm;

@SuppressWarnings("all")
public class Order {
  public static boolean order(int a, int b, int c, boolean noA) {
    if ((Boolean.valueOf(noA) == Boolean.valueOf(true))) {
      if ((b < c)) {
        return true;
      } else {
        return false;
      }
    } else {
      if (((a < b) && (b < c))) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  public static void main(String[] args) {
  }
}
