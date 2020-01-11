import java.util.Scanner;

public class dial_5622 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int[] size = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
     String word = scan.nextLine();
     int sum=0;

     for(int i=0;i<word.length();i++){
            sum = sum + size[word.charAt(i)-65];
     }
        System.out.println(sum);
    }
}
