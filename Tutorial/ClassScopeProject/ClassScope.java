
class ClassScope {
  static int x = 700;
  static void printX() {
    System.out.println("x = " + x);
  }
  public static void main(String[] Args) {

    System.out.println("x = "+x);
    int x = 800;
    System.out.println("x = "+x);

    System.out.println("ClassScope.x = " + ClassScope.x);
    printX();
  }
}
