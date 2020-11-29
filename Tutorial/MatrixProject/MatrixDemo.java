import java.util.Scanner;

class MatrixDemo {
  public static void main(String[] Args) {
    Scanner stdIn = new Scanner(System.in);

    int[] data = new int[5];
    for (int i = 0;i < data.length;i++) {
      System.out.print("data["+i+"]=");
      data[i] = stdIn.nextInt();
    }

    for (int i = 0;i < data.length;i++) {
      System.out.println("data["+i+"]="+data[i]);
    }

  }
  private static void MultiMatrix() {
    int[][] a = {new int[5], new int[3], new int[4], null};
  }
}
