package javamm;

@SuppressWarnings("all")
public class Party {
  public static boolean party(int c, boolean s) {
    if ((s && (c <= 100))) {
      return true;
    } else {
      if (((Boolean.valueOf(s) == Boolean.valueOf(false)) && (c <= 40))) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  public static void main(String[] args) {
  }
}
