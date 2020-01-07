import java.util.Scanner;

public class average_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double arr[] = new double[n];
        double max = arr[0];
        double sum=0;

        for(int i=0;i<n;i++){
            arr[i] =scan.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
        System.out.println(sum/n);
    }
}
