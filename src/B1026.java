import java.io.*;
import java.util.*;
public class B1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N= Integer.parseInt(br.readLine().trim());

        int A[]= new int[N];
        int B[]= new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 셋째 줄: B
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int Bcopy[]= B.clone();
        Arrays.sort(Bcopy);
        long S=0;
        for(int i=0;i<N;i++){
            S+=(long)A[i]*Bcopy[N-1-i];
        }
        System.out.println(S);
    }
}
