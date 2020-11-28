import java.util.Random;

class RandomInt {
  public static void main(String[] Args) {
    Random random = new Random();
    int num = random.nextInt(10);// 0~9

    System.out.println("lucky number = " + num);
  }
}
