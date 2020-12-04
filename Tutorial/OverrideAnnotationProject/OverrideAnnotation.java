class ClassA {
  ClassA() {}
  public void print() {
    System.out.println("ClassA");
  }
}

class ClassB extends ClassA {
  ClassB() {}
  @Override public void print() {
    System.out.println("ClassB");
  }
}

class OverrideAnnotation {
  public static void main(String[] Args) {
    ClassB x = new ClassB();

    x.print();
  }
}
