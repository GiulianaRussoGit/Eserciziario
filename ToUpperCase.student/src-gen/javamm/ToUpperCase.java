package javamm;

@SuppressWarnings("all")
public class ToUpperCase {
  public static char[] upperCase(char[] a) {
    char[] c = new char[a.length];
    for (int i = 0; (i < a.length); i++) {
      c[i] = Character.toUpperCase(a[i]);
    }
    return c;
  }
  
  public static void main(String[] args) {
  }
}
