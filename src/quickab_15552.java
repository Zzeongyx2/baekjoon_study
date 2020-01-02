import java.io.*;

public class quickab_15552 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            for (int i = 0; i < n; i++) {
                String[] num = br.readLine().split(" ");
                bw.write(Integer.parseInt(num[0])+ Integer.parseInt(num[1]) + "\n");
            }
            bw.flush();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
