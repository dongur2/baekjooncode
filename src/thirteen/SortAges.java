package thirteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortAges {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] people = new String[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer human = new StringTokenizer(br.readLine());
            people[i][0] = human.nextToken();
            people[i][1] = human.nextToken();
        }

        Arrays.sort(people, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0] == o2[0]) { // 나이가 같을 경우
                    return 1; // 비교 없이 먼저 가입한 순서
                } else {
                    return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]); // 나이 오름차순
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(people[i][0]+" "+people[i][1]);
        }
    }
}
