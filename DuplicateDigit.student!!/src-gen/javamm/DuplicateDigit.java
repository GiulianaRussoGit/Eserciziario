package javamm;

@SuppressWarnings("all")
public class DuplicateDigit {
  public static long duplicateDigit(int n) {
    long result = 0;
    long next = 1;
    while ((n > 0)) {
      {
        int digit = (n % 10);
        result = ((result + ((digit * next) * 10)) + digit);
        n = (n / 10);
        long _next = next;
        next = (_next * 100);
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
  }
}
