package javamm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class Anagrams {
  public static boolean anagrams(int[] s, int[] t) {
    Map<Integer, Integer> mappaS = Anagrams.check(s);
    Map<Integer, Integer> mappaT = Anagrams.check(t);
    int _size = mappaS.size();
    int _size_1 = mappaT.size();
    boolean _tripleNotEquals = (_size != _size_1);
    if (_tripleNotEquals) {
      return false;
    } else {
      Set<Integer> _keySet = mappaS.keySet();
      for (int chiave : _keySet) {
        if (((!mappaT.containsKey(Integer.valueOf(chiave))) || (!mappaT.get(Integer.valueOf(chiave)).equals(mappaS.get(Integer.valueOf(chiave)))))) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static Map check(int[] a) {
    Map<Integer, Integer> mappa = new HashMap<Integer, Integer>();
    for (int i = 0; (i < a.length); i++) {
      boolean _containsKey = mappa.containsKey(Integer.valueOf(a[i]));
      if (_containsKey) {
        Integer _get = mappa.get(Integer.valueOf(a[i]));
        int _plus = ((_get).intValue() + 1);
        mappa.put(Integer.valueOf(a[i]), Integer.valueOf(_plus));
      } else {
        mappa.put(Integer.valueOf(a[i]), Integer.valueOf(1));
      }
    }
    return mappa;
  }
  
  public static void main(String[] args) {
  }
}
