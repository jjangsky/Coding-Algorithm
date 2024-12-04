import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 최소공배수 계산
            int gcd = getGCD(a, b); // 최대공약수
            int lcm = (a * b) / gcd; // 최소공배수
            System.out.println(lcm);
        }
    }

    private static int getGCD(int a, int b) {
        while (b != 0) {
            // 나머지가 없을 때 a 값이 최대 공약 수
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}