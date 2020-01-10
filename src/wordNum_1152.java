import java.util.Scanner;
import java.util.StringTokenizer;

public class wordNum_1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        StringTokenizer word = new StringTokenizer(sentence, " ");
        System.out.println(word.countTokens());

    }
}
