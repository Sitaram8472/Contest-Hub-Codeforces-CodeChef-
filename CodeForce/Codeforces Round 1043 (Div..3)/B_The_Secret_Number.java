import java.util.*;

public class B_The_Secret_Number {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();

      ArrayList<Long> list = new ArrayList<>();

      long pow = 10;
      for (int i = 0; i < 18; i++) {
        long div = pow + 1;
        if (div > n) {
          break;
        }
        if (n % div == 0) {
          long x = n / div;
          list.add(x);

        }
        pow *= 10;
      }

      if (list.isEmpty()) {
        System.out.println(0);
      } else {
        Collections.sort(list);
        System.out.println(list.size());
        for (long i : list) {
          System.out.print((i) + " ");
        }
        System.out.println();

      }

    }
    sc.close();
  }
}