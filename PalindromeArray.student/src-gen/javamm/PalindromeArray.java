package javamm;

@SuppressWarnings("all")
public class PalindromeArray {
  public static boolean palindrome(int[] a) {
    int _length = a.length;
    int l = (_length - 1);
    boolean ispalindrome = true;
    int _length_1 = a.length;
    boolean _tripleEquals = (_length_1 == 1);
    if (_tripleEquals) {
      return true;
    } else {
      for (int i = 0; (i < (a.length / 2)); i++) {
        {
          boolean _tripleNotEquals = (a[i] != a[l]);
          if (_tripleNotEquals) {
            ispalindrome = false;
            i = a.length;
          } else {
            ispalindrome = true;
          }
          l--;
        }
      }
      return ispalindrome;
    }
  }
  
  public static void main(String[] args) {
  }
}
