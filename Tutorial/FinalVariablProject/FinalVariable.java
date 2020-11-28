class FinalVariable {
  public static void main(String[] Args) {
    final double pi = 3.14159265;

    double r = 1.0;
    System.out.println("r = " + r);
    //pi = 2.0; // final Variable Error

    System.out.println("circle length:" + 2*pi*r);
    System.out.println("circle area:" + pi*r*r);
  }
}
