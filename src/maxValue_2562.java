import java.util.Scanner;


public class maxValue_2562 {
    public static void main(String[] args) {
        int arr[] = new int[9];
        Scanner scan = new Scanner(System.in);
        int max = arr[0];
        int index=1;
        for(int i=0;i<9;i++){
            arr[i] = scan.nextInt();
            if(arr[i]>max){
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }

}
