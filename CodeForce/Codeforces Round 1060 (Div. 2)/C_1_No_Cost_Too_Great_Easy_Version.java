import java.util.*;

public class C_1_No_Cost_Too_Great_Easy_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int ones = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) ones++;
            }

            sc.nextLine(); // skip b line

            int cost = 0;

            boolean hasGCD = false;
            outer: for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(a[i], a[j]) > 1) {
                        hasGCD = true;
                        break outer;
                    }
                }
            }

            if (hasGCD) cost = 0;
            else if (ones >= 2) cost = 2;
            else cost = 1;

            System.out.println(cost);
        }
        sc.close();
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }
}
