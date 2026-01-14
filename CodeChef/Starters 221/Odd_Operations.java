import java.util.*;
import java.lang.*;
import java.io.*;

public class Odd_Operations {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 2 != 0) {
                System.out.println(0);
                continue;
            }

            int digit = n % 10;
            boolean odd = false;
            int maxdigit = -1;
            int temp = n;

            while (temp > 0) {
                int rem = temp % 10;
                if (rem % 2 != 0) {
                    odd = true;
                }
                if (rem > maxdigit) {
                    maxdigit = rem;
                }
                temp /= 10;
            }

            if (odd) {
                System.out.println(1);
                continue;
            }

            if (n < 10) {
                System.out.println(-1);
            } else if (maxdigit > digit) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

    }
}