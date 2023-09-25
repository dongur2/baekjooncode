package classes.class2.class2p;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackQ {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 주어지는 명령의 수
        Stack st = new Stack();

        for (int i = 0; i < N; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            String method = input.nextToken();

            //push X: 정수 X를 스택에 넣는 연산이다.
            //pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            //size: 스택에 들어있는 정수의 개수를 출력한다.
            //empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
            //top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

            if (method.equals("push")) {
                int num = Integer.parseInt(input.nextToken());
                st.push(num);

            } else if (method.equals("pop")) {
                if (st.isEmpty()) {
                    bw.append("-1\n");
                    bw.flush();
                } else {
                    bw.append(st.pop()+"\n");
                    bw.flush();
                }

            } else if (method.equals("size")) {
                bw.append(st.size()+"\n");
                bw.flush();

            } else if (method.equals("empty")) {
                if (st.isEmpty()) {
                    bw.append("1\n");
                    bw.flush();
                } else {
                    bw.append("0\n");
                    bw.flush();
                }

            } else if (method.equals("top")) {
                if (st.isEmpty()) {
                    bw.append("-1\n");
                    bw.flush();
                } else {
                    bw.append(st.peek()+"\n");
                    bw.flush();
                }
            }
        }

        bw.close();
        br.close();
    }
}
