import java.util.*;

public class D_Destruction_of_the_Dandelion_Fields {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long a[] = new long[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextLong();
      }

      ArrayList<Long> odd = new ArrayList<>();

      long sum = 0;

      for (int i = 0; i < n; i++) {
        if ((a[i] & 1) == 0) {
          sum += a[i];
        } else {
          odd.add(a[i]);
        }
      }

      if (odd.size() > 0) {
        Collections.sort(odd, Collections.reverseOrder());
        for (int i = 0; i < (odd.size() + 1) / 2; i++) {
          sum += odd.get(i);
        }
      }

      System.out.println(odd.size() > 0 ? sum : 0);

    }
    sc.close();
  }
}