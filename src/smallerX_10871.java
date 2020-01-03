import java.util.Scanner;

public class smallerX_10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int array[] = new int [n];

        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(array[i]<a){
                System.out.print(array[i] + " ");
            }
        }
        scan.close();
    }
}
