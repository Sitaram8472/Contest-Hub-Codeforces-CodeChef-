import java.util.*;

public class B_Find_Permutation_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    int freq[] = new int[n + 1];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] != -1) {
        freq[arr[i]]++;
        if (freq[arr[i]] > 1) {
          System.out.println("No");
          return;
        }
      }
    }

    List<Integer> miss = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (freq[i] == 0) {
        miss.add(i);
      }
    }

    int idx = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == -1) {
        arr[i] = miss.get(idx++);
      }
    }

    System.out.println("Yes");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    sc.close();
  }
}
