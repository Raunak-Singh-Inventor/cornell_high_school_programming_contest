import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Long.parseLong(st.nextToken()));
        }
        int weird_counter = arr.size();
        for(int length = 2; length <= arr.size(); length++) {
            for(int i = 0; i < arr.size(); i++) {
                if(i + length - 1 < arr.size()) {
                    ArrayList<Long> difs = new ArrayList<>();
                    for (int j = i; j < i + length - 1; j++) {
                        difs.add(arr.get(j + 1) - arr.get(j));
                    }
                    long previous_dif = -difs.get(0);
                    boolean isWeird = true;
                    for (int j = 0; j < difs.size(); j++) {
                        if (difs.get(j) > 0 && previous_dif > 0) {
                            isWeird = false;
                            break;
                        }
                        if (difs.get(j) < 0 && previous_dif < 0) {
                            isWeird = false;
                            break;
                        }
                        if (difs.get(j) == 0) {
                            isWeird = false;
                            break;
                        }
                        previous_dif = difs.get(j);
                    }
                    if (isWeird) {
                        weird_counter++;
                    }
                }
            }
        }
        System.out.println(weird_counter);
    }
}