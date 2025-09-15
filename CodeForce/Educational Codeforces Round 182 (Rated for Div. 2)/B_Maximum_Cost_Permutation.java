import java.util.*;

public class B_Maximum_Cost_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            int zero = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    zero++;
                }
            }
            int start = 0;
            int end = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    start = i;
                    break;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] != i + 1) {
                    end = i;
                    break;
                }
            }

            if (zero == 1) {
                HashSet<Integer> set = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    set.add(arr[i]);
                }
                int missing = 0;
                for (int i = 0; i < n; i++) {
                    if (!set.contains(i + 1)) {
                        missing = i + 1;
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 0) {
                        arr[i] = missing;
                    }
                }

                start = 0;
                end = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] != i + 1) {
                        start = i;
                        break;
                    }
                }
                for (int i = n - 1; i >= 0; i--) {
                    if (arr[i] != i + 1) {
                        end = i;
                        break;
                    }
                }
                if (start == end) {
                    System.out.println(0);
                } else {
                    System.out.println(end - start + 1);
                }

            } else if (start == end) {
                System.out.println(0);
            } else {
                System.out.println(end - start + 1);
            }

        }
        sc.close();
    }
}