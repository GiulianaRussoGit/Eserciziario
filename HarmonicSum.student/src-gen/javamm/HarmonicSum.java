package javamm;

@SuppressWarnings("all")
public class HarmonicSum {
  public static int harmonicSum(int x) {
    int k = 2;
    double sum = 1.0;
    double flag = 1.0;
    while ((sum <= x)) {
      {
        double armonica = (flag + (1.0 / k));
        flag = armonica;
        double _sum = sum;
        sum = (_sum + armonica);
        k++;
      }
    }
    return (k - 1);
  }
  
  public static void main(String[] args) {
  }
}
