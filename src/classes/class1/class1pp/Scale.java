package classes.class1.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Scale {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String played = br.readLine();

        String[] origin = played.split(" ");
        String[] sortedAsc = played.split(" ");
        String[] sortedDes = played.split(" ");

        Arrays.sort(sortedAsc);
        Arrays.sort(sortedDes, Collections.reverseOrder());

        if (Arrays.equals(origin, sortedAsc)) { // 오름차순
            System.out.println("ascending");
        } else if (Arrays.equals(origin, sortedDes)) { // 내림차순
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
