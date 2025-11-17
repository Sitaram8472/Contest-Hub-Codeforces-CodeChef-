import java.util.*;

public class A_ASCII_Art_Contest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int[] arr = new int[3];
    arr[0] = a;
    arr[1] = b;
    arr[2] = c;

    Arrays.sort(arr);

    int diff1 = arr[2] - arr[0];
    int diff2 = arr[2] - arr[1];
    if (diff1 >= 10 || diff2 >= 10) {
      System.out.println("check again");
    } else {
      System.out.println("final" + " " + arr[1]);
    }

  }
}
