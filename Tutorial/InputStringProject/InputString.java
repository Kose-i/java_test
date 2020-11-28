import java.util.Scanner;

class InputString {
  public static void main(String[] Args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("name:");
    //String name = stdIn.next();// Space end
    String name = stdIn.nextLine();// \n end
    System.out.println("Hello " + name + "!");
  }
}
