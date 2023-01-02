import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int rounds = Integer.parseInt(st.nextToken());
        if(rounds==0) {
            System.out.println("YES");
            return;
        }
        ArrayList<Long> scores = new ArrayList<>();
        for(int i = 0; i < Math.pow(2,rounds); i++) {
            st = new StringTokenizer(r.readLine());
            scores.add(Long.parseLong(st.nextToken()));
        }
        Long dudu_score = scores.get(0);
        scores.remove(0);
        scores.sort(Comparator.naturalOrder());
        long dudu_opponent = scores.get(0);
        scores.remove(0);
        if(dudu_score>=dudu_opponent) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}