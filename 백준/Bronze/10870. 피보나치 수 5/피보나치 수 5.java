import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] numArr = new int[21];
        numArr[0] = 0;
        numArr[1] = 1;

        for(int i = 2; i < numArr.length; i++){
            numArr[i] = numArr[i-1] + numArr[i-2];
        }

        System.out.println(numArr[num]);

    }

}


