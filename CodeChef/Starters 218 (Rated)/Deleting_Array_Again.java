import java.util.*;

public class Deleting_Array_Again {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }

            int[] cost = new int[n];

            for (int i = 0; i < n; i++) {
                cost[i] = sc.nextInt();

            }

            // ArrayList<Integer> l = new ArrayList<>();
            // for (int i = 0; i < n; i++) {
            // l.add(num[i]);
            // }

            // Collections.sort(l, Collections.reverseOrder());
            // // Arrays.sort(cost);

            int ans = 0;
            int min = 10000;
            for (int i = 0; i < n; i++) {
                min = Math.min(cost[i], min);
                ans += min * num[i];
            }

            System.out.println(ans);

        }
        sc.close();
    }
}