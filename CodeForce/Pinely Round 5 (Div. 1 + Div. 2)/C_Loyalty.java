import java.util.*;

public class C_Loyalty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long X = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long totalb = 0;
            long S = 0;
            long prevl = 0;

            for (long price : a) {
                long newl = (S + price) / X;
                if (newl > prevl) {
                    totalb += price;
                }
                S += price;
                prevl = newl;
            }

            System.out.println(totalb);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i + 1 == n ? "\n" : " "));
            }
        }
        sc.close();
    }
}
