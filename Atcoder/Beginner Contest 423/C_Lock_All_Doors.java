import java.util.*;

public class C_Lock_All_Doors {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int start = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        start = i;
        break;
      }
    }
    if (start == -1) {
      System.out.println(0);
      return;
    }
    int end = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] == 0) {
        end = i;
        break;
      }
    }

    int oper = 0;

    for (int i = r - 1; i >= start; i--) {
      if (arr[i] == 0) {
        oper++;
      } else {
        oper += 2;
      }
    }

    for (int i = r; i <= end; i++) {
      if (arr[i] == 0) {
        oper++;
      } else {
        oper += 2;
      }
    }

    System.out.println(oper);

  }
}