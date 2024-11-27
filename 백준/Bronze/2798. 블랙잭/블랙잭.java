import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] card = br.readLine().split(" ");

        int cnt = Integer.parseInt(input[0]);
        int sum = Integer.parseInt(input[1]);

        int max = 0;
        for (int i = 0; i < cnt; i++){
            for (int j = 1; j< cnt; j++){
                for (int k = 2; k < cnt; k++){
                    int one = Integer.parseInt(card[i]);
                    int two = Integer.parseInt(card[j]);
                    int three = Integer.parseInt(card[k]);
                    if(one != two && two != three && one != three){
                        int result = one + two + three;
                        if (result > max && result <= sum){
                            max = result;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}

