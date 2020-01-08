import java.util.Scanner;

public class string_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            String S = scan.next();
            for(int j=0;j<S.length();j++){
                for(int k=0;k<a;k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
