import java.util.*;

public class B_Beautiful_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int one = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    one++;
                }
            }

            System.out.println(one);
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    System.out.print(i + 1 + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
