import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int size = Integer.parseInt(inputArr[0]);
        int money = Integer.parseInt(inputArr[1]);

        int[] tokenArr = new int[size];
        int useToken = 0;

        for(int i = 0; i < size; i++){
            tokenArr[i] = Integer.parseInt(br.readLine());
        }

        while (true){
            if (money == 0) break;
            if(money / tokenArr[size-1] > 0){
                useToken += money / tokenArr[size-1];
                money = money % tokenArr[size -1];
            }
            size = size -1;
        }

        System.out.println(useToken);


    }
}


