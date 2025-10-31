import java.util.*;

public class Make_All {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[20];
    if (n == 20) {
      for (int i = 0; i < 10; i++) {
        a[i] = i + 1;
      }

      for (int i = 10; i < 20; i++) {
        a[i] = i - 9;
      }

    } else {
      for (int i = 0; i < 10; i++) {
        a[i] = (int) Math.pow(10, i);
      }

      for (int i = 10; i < 20; i++) {
        a[i] = (int) Math.pow(10, i - 10) * 5;
      }

    }
    for (int i = 0; i < 20; i++) {
      System.out.print(a[i] + (i < 19 ? " " : ""));
    }

    sc.close();
  }
}
