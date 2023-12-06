package javamm;

@SuppressWarnings("all")
public class FirstLastDigitSum {
  public static int firstLastDigitSum(int n) {
    String s = Integer.toString(n);
    char max = s.charAt(0);
    int i = Character.getNumericValue(max);
    int _length = s.length();
    int _minus = (_length - 1);
    char min = s.charAt(_minus);
    int j = Character.getNumericValue(min);
    return (i + j);
  }
  
  public static void main(String[] args) {
  }
}
