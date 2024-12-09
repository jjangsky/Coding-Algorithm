import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Stack<Integer> moneySet = new Stack<>();

        for(int i = 0; i < cnt; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                moneySet.push(num);
            }else{
                if(!moneySet.isEmpty()){
                    moneySet.pop();
                }
            }
        }

        int result = 0;
        for(Integer money : moneySet){
            result+= money;
        }

        System.out.println(result);
    }

}


