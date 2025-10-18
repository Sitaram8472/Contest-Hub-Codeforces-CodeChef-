import java.util.*;

public class B_Most_Frequent_Substrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();

    Map<String, Integer> freq = new HashMap<>();
    for (int i = 0; i <= n - k; i++) {
      String sub = s.substring(i, i + k);
      freq.put(sub, freq.getOrDefault(sub, 0) + 1);
    }

    int maxFreq = 0;
    for (int val : freq.values()) {
      if (val > maxFreq)
        maxFreq = val;
    }

    List<String> result = new ArrayList<>();
    for (String key : freq.keySet()) {
      if (freq.get(key) == maxFreq)
        result.add(key);
    }

    Collections.sort(result);
    System.out.println(maxFreq);
    System.out.println(String.join(" ", result));
  }
}
