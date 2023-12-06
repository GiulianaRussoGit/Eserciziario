package javamm;

@SuppressWarnings("all")
public class NoTeenSum {
  public static int noTeenSum(int a, int b, int c) {
    int sum = 0;
    int _fixTeen = NoTeenSum.fixTeen(a);
    boolean _tripleNotEquals = (_fixTeen != 0);
    if (_tripleNotEquals) {
      sum = NoTeenSum.fixTeen(a);
    }
    int _fixTeen_1 = NoTeenSum.fixTeen(a);
    boolean _tripleNotEquals_1 = (_fixTeen_1 != 0);
    if (_tripleNotEquals_1) {
      sum = NoTeenSum.fixTeen(a);
    }
    int _fixTeen_2 = NoTeenSum.fixTeen(b);
    boolean _tripleNotEquals_2 = (_fixTeen_2 != 0);
    if (_tripleNotEquals_2) {
      int _sum = sum;
      int _fixTeen_3 = NoTeenSum.fixTeen(b);
      sum = (_sum + _fixTeen_3);
    }
    int _fixTeen_4 = NoTeenSum.fixTeen(c);
    boolean _tripleNotEquals_3 = (_fixTeen_4 != 0);
    if (_tripleNotEquals_3) {
      int _sum_1 = sum;
      int _fixTeen_5 = NoTeenSum.fixTeen(c);
      sum = (_sum_1 + _fixTeen_5);
    }
    return sum;
  }
  
  public static int fixTeen(int d) {
    if (((((d >= 13) && (d <= 19)) && (d != 15)) && (d != 16))) {
      return 0;
    } else {
      return d;
    }
  }
  
  public static void main(String[] args) {
  }
}
