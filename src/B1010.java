import java.io.*;
//1010
public class B1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int C= Integer.parseInt(br.readLine().strip());

        while (C-- > 0) {
            String[] input = br.readLine().strip().split(" ");

            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int r;
            long res=1;
            r= Math.min(N,M-N);
            for(int i=1; i<=r; i++){
               res = res*(M - r +i)/i;
            }

            sb.append(res).append("\n");

        }

        System.out.print(sb);

        br.close();

    }
}