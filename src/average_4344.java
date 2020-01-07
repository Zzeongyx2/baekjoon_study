import java.util.Scanner;

public class average_4344 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();

       for(int i=0;i<num;i++) {
           int sum = 0;
           float cnt = 0;
           int n = scan.nextInt();

           int[] student = new int[n];
           for (int j = 0; j < n; j++) {
               student[j] = scan.nextInt();
               sum = sum + student[j];
           }
           int avg = sum / n;

           for (int k = 0; k < n; k++) {
               if (student[k] > avg) {
                   cnt++;
               }
           }
           System.out.printf("%.3f", (cnt/n)*100);
           System.out.println("%");
       }
    }
}
