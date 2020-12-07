import java.util.Arrays;
import java.util.Comparator;

class BinarySearch {
  static class DataFormat {
    private String s;
    private int num;

    public DataFormat(String s, int n) {
      this.s = s; this.num = n;
    }
    public String toString() {
      return s + " " + num;
    }
    public static final Comparator<DataFormat> NUM_ORDER = new NumOrderComparator();
    private static class NumOrderComparator implements Comparator<DataFormat> {
      public int compare(DataFormat l, DataFormat r) {
        return (l.num > r.num) ? 1 :
               (l.num < r.num) ? -1: 0;
      }
    }
  }

  public static void main(String[] Args) {
    DataFormat[] x = {//num-sort
      new DataFormat("a", 2),
      new DataFormat("c", 3),
      new DataFormat("b", 5),
      new DataFormat("b", 7),
      new DataFormat("b", 8),
    };

    int SearchNumber = 5;

    System.out.println("Search num = " + SearchNumber);

    int idx = Arrays.binarySearch(x, new DataFormat("", SearchNumber), DataFormat.NUM_ORDER);

    if (idx < 0) System.out.println("Not found the number");
    else         System.out.println("idx = "+idx + "val = "+ x[idx]);
  }
}
