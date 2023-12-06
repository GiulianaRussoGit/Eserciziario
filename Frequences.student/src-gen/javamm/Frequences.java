package javamm;

import java.util.TreeMap;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class Frequences {
  public static int[] frequences(int[] a) {
    TreeMap<Integer, Integer> map = Frequences.mappa(a);
    int[] array = ((int[])Conversions.unwrapArray(map.values(), int.class));
    return array;
  }
  
  public static TreeMap<Integer, Integer> mappa(int[] a) {
    TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
    for (int i = 0; (i < a.length); i++) {
      boolean _containsKey = map.containsKey(Integer.valueOf(a[i]));
      if (_containsKey) {
        Integer _get = map.get(Integer.valueOf(a[i]));
        int _plus = ((_get).intValue() + 1);
        map.replace(Integer.valueOf(a[i]), Integer.valueOf(_plus));
      } else {
        map.put(Integer.valueOf(a[i]), Integer.valueOf(1));
      }
    }
    return map;
  }
  
  public static void main(String[] args) {
  }
}
