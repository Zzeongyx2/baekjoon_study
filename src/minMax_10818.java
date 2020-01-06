import java.util.Scanner;

public class minMax_10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
            max = arr[i];
        }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
