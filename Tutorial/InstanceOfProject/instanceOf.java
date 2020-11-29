
class ParentClass {
}

class ChildClass extends ParentClass {
}

class InstanceOf {
  public static void main(String[] Args) {
    ParentClass p = new ParentClass();
    printInstance(p);

    System.out.println("-----");

    ChildClass c = new ChildClass();
    printInstance(c);
  }

  private static void printInstance(Object obj) {
    if (obj instanceof ParentClass) {
      System.out.print("obj is ParentClass instance\n");
    }

    if (obj instanceof ChildClass) {
      System.out.print("obj is ChildClass instance\n");
    }
  }
}
