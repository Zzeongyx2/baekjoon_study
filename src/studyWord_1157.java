import java.util.Scanner;

public class studyWord_1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next().toUpperCase();
        int max=0;
        char result='?';
        int [] cnt = new int[26];

        for(int i=0;i<word.length();i++){
            cnt[word.charAt(i)-65]++;
            if(max<cnt[word.charAt(i)-65]){
                max = cnt[word.charAt(i)-65];
                result = word.charAt(i);
            }else if(max == cnt[word.charAt(i)-65]){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
