
class ClassA {
  private int a;
  ClassA() {
    a = 50;
  }
  ClassA(int aa) {
    a = aa;
  }
  int getA() {return a;}
}

class ClassB extends ClassA {
  private int b;
  ClassB(int aa, int bb) {super(aa); b = bb;}
  //ClassB() {super();} //same
}

class ClassC {
  protected int x;
  ClassC() {x = 0;}
  ClassC(int xx) {x = xx;}

  void print() {System.out.println("Class-C = " + x);}
}
class ClassD extends ClassC {
  int x; // Class D field
  ClassD(int x1, int x2) {super.x = x1; this.x = x2;}
  void print() {
    super.print();
    System.out.println("Class-D = " + x);
  }
}

class InheritanceClass {
  public static void main(String[] Args) {
    //ClassB x = new ClassB(20, 1);
    //System.out.println("x.getA() = " + x.getA());

    ClassD x = new ClassD(10, 4);
    x.print();
  }
}
