package javamm;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class OverAverage {
  public static int[] overAverage(int[] a) {
    double avg = OverAverage.media(a);
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; (i < a.length); i++) {
      boolean _greaterThan = (a[i] > avg);
      if (_greaterThan) {
        list.add(Integer.valueOf(a[i]));
      }
    }
    int[] b = new int[list.size()];
    for (int i = 0; (i < b.length); i++) {
      b[i] = (list.get(i)).intValue();
    }
    return b;
  }
  
  public static double media(int[] a) {
    double avg = 0;
    for (int i = 0; (i < a.length); i++) {
      double _avg = avg;
      avg = (_avg + a[i]);
    }
    int _length = a.length;
    double _divide = (avg / _length);
    avg = _divide;
    return avg;
  }
  
  public static void main(String[] args) {
  }
}
