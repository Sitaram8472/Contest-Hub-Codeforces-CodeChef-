import java.util.*;

public class C_1_Renako_Amaori_and_XOR_Game_easy_version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int xorA = 0, xorB = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                xorA ^= a[i];
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                xorB ^= b[i];
            }

            if (n == 1) {
                if (a[0] == b[0]) {
                    System.out.println("Tie");
                } else {
                    System.out.println("Ajisai");
                }

                continue;
            }

            if (xorA == xorB) {
                System.out.println("Tie");
                continue;
            }
            int d = 0;
            int l = -1;

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    d++;
                    l = i + 1;
                }
            }

            if (d % 2 == 0) {
                System.out.println("Tie");
            } else if (l % 2 != 0) {
                System.out.println("Ajisai");
            } else {
                System.out.println("Mai");
            }

        }
        sc.close();
    }
}
