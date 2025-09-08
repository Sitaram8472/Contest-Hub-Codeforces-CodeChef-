import java.util.*;

public class Endless_Play {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int h = sc.nextInt();

    int day = n - 4;
    System.out.println(day * 24 + h);

    sc.close();
  }
}
