import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1080 {
    static void flip3x3(int[][] A, int r, int c) {
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                A[i][j] ^= 1;  // 0<->1 토글
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int flip = 0;

        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine().trim();
            if (str.length() < M) throw new IllegalArgumentException("행 길이가 M보다 짧음");
            for (int j = 0; j < M; j++) {
                A[i][j] = str.charAt(j) - '0';
            }
        }
        int[][] B = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine().trim();
            if (str.length() < M) throw new IllegalArgumentException("행 길이가 M보다 짧음");

            for (int j = 0; j < M; j++) {
                B[i][j] = str.charAt(j) - '0';
            }
        }
        if (N < 3 || M < 3) {
            System.out.println(Arrays.deepEquals(A, B) ? 0 : -1);
            return;
        }
        for (int i = 0; i < N-3; i++) {
            for (int j = 0; j < M-3; j++) {

                if (A[i][j] != B[i][j]) {
                    flip3x3(A, i, j);
                    flip++;
                }

            }
        }
        System.out.println(Arrays.deepEquals(A, B) ? flip : -1);

    }
}