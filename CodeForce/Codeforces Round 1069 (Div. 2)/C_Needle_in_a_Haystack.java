import java.util.*;

public class C_Needle_in_a_Haystack {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
      int t = sc.nextInt();
      while (t-- > 0) {
        String s = sc.next();
        String target = sc.next();

        int[] count = new int[26];

        for (char c : target.toCharArray()) {
          count[c - 'a']++;
        }

        boolean possible = true;
        for (char c : s.toCharArray()) {
          count[c - 'a']--;
        }

        for (int i : count) {
          if (i < 0) {
            possible = false;
            break;
          }
        }

        if (!possible) {
          System.out.println("Impossible");
          continue;
        }

        StringBuilder sb = new StringBuilder();
        int total = 0;

        for (char c : s.toCharArray()) {
          int val = c - 'a';
          while (total < val) {
            while (count[total] > 0) {
              sb.append((char) ('a' + total));
              count[total]--;
            }
            total++;
          }
          sb.append(c);
        }

        while (total < 26) {
          while (count[total] > 0) {
            sb.append((char) ('a' + total));
            count[total]--;
          }
          total++;
        }

        System.out.println(sb.toString());
      }
    }
    sc.close();
  }
}