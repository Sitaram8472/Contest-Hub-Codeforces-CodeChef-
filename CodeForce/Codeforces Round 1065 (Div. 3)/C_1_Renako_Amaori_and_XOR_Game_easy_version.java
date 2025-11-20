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

            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    if (a[i] != b[i]) {
                        if (xorA < xorB) {
                            xorA ^= b[i];
                            xorB ^= a[i];
                        }
                    }
                } else {
                    if (a[i] != b[i]) {
                        if (xorB < xorA) {
                            xorB ^= a[i];
                            xorA ^= b[i];
                        }
                    }
                }
            }

            if (xorA > xorB) {
                System.out.println("Ajisai");
            } else if (xorB > xorA) {
                System.out.println("Mai");
            } else {
                System.out.println("Tie");
            }

        }
        sc.close();
    }
}
