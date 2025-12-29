import java.util.*;

public class B_New_Year_Cake {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      int tempa = a;
      int tempb = b;

      int layer = 0;
      int size = 1;

      while (true) {
        if (layer % 2 == 0) {
          if (a >= size) {
            a -= size;
          } else {
            break;
          }
        } else {
          if (b >= size) {
            b -= size;
          } else {
            break;
          }
        }

        size += size;
        layer++;
      }

      int layer2 = 0;
      int size2 = 1;

      while (true) {
        if (layer2 % 2 == 0) {
          if (tempb >= size2) {
            tempb -= size2;
          } else {
            break;
          }
        } else {
          if (tempa >= size2) {
            tempa -= size2;
          } else {
            break;
          }
        }

        size2 += size2;
        layer2++;

      }
      System.out.println(Math.max(layer, layer2));

    }
    sc.close();
  }
}