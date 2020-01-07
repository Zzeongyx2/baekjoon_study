import java.util.Scanner;

public class remainder_3052 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int arr[] = new int [10];
     int rest[] = new int [10];
     int cnt =10;

     for(int i=0;i<10;i++){
         arr[i] = scan.nextInt();
         rest[i] = arr[i]%42;
         for(int j=0;j<i;j++){
             if(rest[i] == rest[j]){
                 cnt--;
                 break;
             }
         }
     }
        System.out.println(cnt);
    }

}
