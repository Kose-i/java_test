import java.util.Random;

class RandId {
  private static int counter;

  private int id;

  static {
    Random rand = new Random();
    counter = rand.nextInt(10) * 100;
  }

  public RandId() {
    id = ++counter;
  }
  public int getId() {
    return id;
  }
}

public class StaticInitializer {
  public static void main(String[] Args) {
    RandId a = new RandId();
    RandId b = new RandId();
    RandId c = new RandId();

    System.out.println("a-id :" + a.getId());
    System.out.println("b-id :" + b.getId());
    System.out.println("c-id :" + c.getId());
  }
}
