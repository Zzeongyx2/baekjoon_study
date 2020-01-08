import java.util.Scanner;

public class alphabet_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        int []check = new int[26];

        for(int i=0;i<26;i++){
            check[i] = -1;
        }

        for(int i=0;i<S.length();i++){
            int ch = (int)S.charAt(i)-97;
            if(check[ch] == -1){
                check[ch] = i;
            }
        }

        for(int i=0;i<26;i++){
            System.out.print(check[i]+" ");
        }
    }
}
