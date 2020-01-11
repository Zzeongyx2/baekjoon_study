import java.util.Scanner;

public class groupWordChecker_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ans = num;
        String word;

        for(int j=0;j<num;j++){
            word = scan.next();
            boolean [] check = new boolean[26];
            for(int i=1;i<word.length();i++){
                if(word.charAt(i-1) != word.charAt(i)){
                    check[word.charAt(i-1) - 97] = true;
                    if(check[word.charAt(i)-97] == true){
                        ans--;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
