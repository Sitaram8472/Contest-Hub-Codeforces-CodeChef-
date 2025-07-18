import java.util.Scanner;

public class code {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int x = sc.nextInt();
      int minDigit = 9;

      while (x > 0) {
        int digit = x % 10;
        minDigit = Math.min(minDigit, digit);
        x /= 10;
      }

      System.out.println(minDigit);
    }

    sc.close();
  }
}
