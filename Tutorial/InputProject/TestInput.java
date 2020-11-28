import java.util.Scanner;

class InputTest {
  public static void main(String[] Args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("x(int):");
    int x = stdIn.nextInt();
    System.out.print("y(int):");
    int y = stdIn.nextInt();

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x+y));

  }
}
