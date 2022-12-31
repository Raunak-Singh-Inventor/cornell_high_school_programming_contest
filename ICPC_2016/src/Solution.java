import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(r.readLine());
        double drain_rate = Double.parseDouble(st.nextToken());
        double charge_rate = Double.parseDouble(st.nextToken());
        double b1 = Double.parseDouble(st.nextToken());
        double b2 = Double.parseDouble(st.nextToken());

        System.out.println((long) ((b1+b2)/(drain_rate-charge_rate)));
    }
}