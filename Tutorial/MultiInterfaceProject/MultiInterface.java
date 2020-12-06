interface InterfaceA {
  void play();
}
interface InterfaceB {
  int RED   = 1;
  int GREEN = 2;
  int BLUE  = 3;
}

class ClassA implements InterfaceA, InterfaceB {
  int skin;

  ClassA(int a) {
    skin = a;
  }

  @Override public void play() {
    System.out.println("play");
  }

  public void getSkinColor() {
    System.out.println(skin);
    switch(skin) {
      case RED: System.out.println("RED"); break;
      case GREEN: System.out.println("GREEN"); break;
      case BLUE: System.out.println("BLUE"); break;
    }
  }
}

class MultiInterface {
  public static void main(String[] Args) {
    ClassA x = new ClassA(2);

    x.getSkinColor();
  }
}

