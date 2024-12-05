import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int oneNum = Integer.parseInt(st.nextToken());
        int oneDe = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int twoNum = Integer.parseInt(st.nextToken());
        int twoDe = Integer.parseInt(st.nextToken());

        int resNum = oneNum * twoDe + twoNum * oneDe;
        int resDe = oneDe * twoDe;

        // 최대 공약수 구하기
        int maxDivide = maxDivideNum(resNum, resDe);
        resNum = resNum / maxDivide;
        resDe = resDe/ maxDivide;

        System.out.println(resNum + " " + resDe);
    }

    private static int maxDivideNum(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }




}

