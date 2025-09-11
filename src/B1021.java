import java.util.*;
import java.io.*;

public class B1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());

        LinkedList<Integer> dq = new LinkedList<>();
        for (int i=1;i<N+1;i++){
            dq.add(i);
        }
        int A []=new int[M];
        st= new StringTokenizer(br.readLine().trim());

        for (int i=0;i<M;i++){
            A[i]= Integer.parseInt(st.nextToken());
        }
        int ops=0;
        for (int target :A){
            int pos=dq.indexOf(target);
            int left= pos;
            int right=dq.size()-pos;
            if(left<=right){
                for(int i=0;i<left;i++){dq.addLast(dq.removeFirst());}
                ops+=left;
            }else{
                for (int i = 0; i < right; i++) dq.addFirst(dq.removeLast());
                ops += right;
            }
            dq.removeFirst();

        }

        System.out.println(ops);
        br.close();
    }

}
