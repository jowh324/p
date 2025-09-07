import java.io.*;
import java.util.*;
//1015
public class B1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N= Integer.parseInt(br.readLine().trim());

        int A[]= new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int [][]arr= new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0]= A[i];
            arr[i][1]= i;
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
            return Integer.compare(o1[0], o2[0]);
        });
        int P[]= new int[N];

        for (int i = 0; i < N; i++) {
            int a=arr[i][1];
            P[a]=i;

        }
        for (int i = 0; i < N; i++) {
            sb.append(P[i]+" ");
        }
        System.out.println(sb);




    }
}
