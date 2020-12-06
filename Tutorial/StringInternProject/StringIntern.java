class StringIntern {
  public static void main(String[] Args) {
    String x = "DEF";
    String y = "ABC" + x;
    String z = "ABC" + x;

    if (y == z) {
      System.out.println("y == z");
    } else {
      System.out.println("y != z");
    }

    y = y.intern();
    z = z.intern();

    if (y == z) {
      System.out.println("y == z");
    } else {
      System.out.println("y != z");
    }
  }
}
