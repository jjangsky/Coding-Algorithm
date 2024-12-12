import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] cntArr = br.readLine().split(" ");

        Stack<Integer> stack = new Stack<>();
        int checkNum = 1;
        boolean isFlag = true;

        for(int i = 0; i < cnt; i++){
            int num = Integer.parseInt(cntArr[i]);
            if(num == (checkNum)){
                checkNum++;
            }else if(!stack.isEmpty() && (stack.peek() == checkNum)){
                stack.pop();
                checkNum++;
                i--;
            }else{
                stack.push(num);

            }
        }

        if(!stack.isEmpty()){
            for(int i = 0; i < stack.size(); i++){
                if(stack.peek() == checkNum){
                    stack.pop();
                    checkNum++;
                }else {
                    isFlag = false;
                    break;
                }
            }
        }
        if (isFlag){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
}



