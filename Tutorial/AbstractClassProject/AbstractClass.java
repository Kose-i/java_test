abstract class ClassA {
  abstract void print();
}

class ClassB extends ClassA {
  @Override void print() {
    System.out.println("Override print");
  }
}
class AbstractClass {
  public static void main(String[] Args) {
    //ClassB x = new ClassB();
    //ClassA x = new ClassA(); //error
    ClassA x = new ClassB(); //error

    x.print();
  }
}
