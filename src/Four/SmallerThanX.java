package Four;

import java.io.*;
import java.util.StringTokenizer;

public class SmallerThanX {
    public static void getCounting() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken());
        int X = Integer.parseInt(input.nextToken());

        input = new StringTokenizer(br.readLine());

        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
            int value = Integer.parseInt(input.nextToken());
            arr[i] = value;
        }

        for(int j=0; j<arr.length; j++) {
            if(arr[j] < X) {
                bw.write(arr[j]+" ");
            }
        }

        bw.close();
        br.close();
    }
}
