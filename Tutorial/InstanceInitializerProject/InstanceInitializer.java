class InstanceStamp {
  private static int counter = 0;
  private int id;

  private int x = 0;
  private int y = 0;

  {//Instance Init
    id = ++counter;
  }
  public InstanceStamp() {}
  public InstanceStamp(int xx) {this.x = xx;}
  public InstanceStamp(int xx, int yy) {this.x = xx; this.y = yy;}

  public String toString() {
    return "No"+id+"x="+x+", y="+y;
  }
}

public class InstanceInitializer {
  public static void main(String[] Args) {
    InstanceStamp a = new InstanceStamp();
    InstanceStamp b = new InstanceStamp(10);
    InstanceStamp c = new InstanceStamp(13, 20);

    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("c = "+c);
  }
}
