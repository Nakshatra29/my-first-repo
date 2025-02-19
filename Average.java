import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int total = 0;
        float avg;

    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements in the array");
    int n = sc.nextInt();
    int[] arrPrices = new int[n];
    System.out.println("enter prices");
    for (int i=0;i < n;i++) {
        arrPrices[i] = sc.nextInt();
        total+=arrPrices[i];
         
    }
    avg=total/n;
      System.err.println("the total price is " + total);
      System.out.println("the average is " + avg);
      System.out.println("the prices above averge is :");
      for (int i=0;i < n; i++) {
        if(arrPrices[i] > avg) {
            System.out.println(arrPrices[i]);
        }
      }
      
    }
}