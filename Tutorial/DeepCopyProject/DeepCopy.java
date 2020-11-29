class DeepCopy {
  public static void main(String[] Args) {
    deep_cp();
  }
  private static void deep_cp() {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {3, 4, 5, 6, 7, 8, 9};

    System.out.println("data-a:");
    print_data(a);
    System.out.println("data-b:");
    print_data(b);

    b = new int[a.length];
    for (int i = 0;i < a.length;i++) {
      b[i] = a[i];
    }

    System.out.println("data-a:");
    print_data(a);
    System.out.println("data-b:");
    print_data(b);

    a[0] = 10;

    System.out.println("data-a:");
    print_data(a);
    System.out.println("data-b:");
    print_data(b);
  }
  private static void shallow_cp() {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {3, 4, 5, 6, 7, 8, 9};

    System.out.println("data-a:");
    print_data(a);
    System.out.println("data-b:");
    print_data(b);

    b = a;

    System.out.println("data-a:");
    print_data(a);
    System.out.println("data-b:");
    print_data(b);

    a[0] = 10;

    System.out.println("data-a:");
    print_data(a);
    System.out.println("data-b:");
    print_data(b);
  }
  private static void print_data(int[] t) {
    for (int e : t) {
      System.out.print(' ');
      System.out.print(e);
    }
    System.out.print('\n');
  }
}
