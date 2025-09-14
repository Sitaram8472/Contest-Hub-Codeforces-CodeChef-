import java.util.Scanner;

public class A_Scary_Fee {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long X = sc.nextLong();
    long C = sc.nextLong();

    long totalcost = 1000 + C;
    long block = X / totalcost;

    long withdrwawl = block * 1000;

    System.out.println(withdrwawl);

    sc.close();
  }
}
