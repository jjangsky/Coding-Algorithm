import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());


        for(int i = 0; i < cnt; i++){
            // testCase 별로 stack 선언
            Stack<String> bracketSet = new Stack<>();
            String input = br.readLine();

            // 중단 분기 처리 변수 선언
            boolean isStopbracket = false;
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(j) == '(' ){
                    bracketSet.push("(");
                }else{
                    if(!bracketSet.isEmpty()){
                        bracketSet.pop();
                    }else{
                        isStopbracket = true;
                        break;
                    }
                }
            }

            if(!bracketSet.isEmpty() || isStopbracket){
                //중단 변수가 존재하거나 Stack에 값이 존재하면 False
                System.out.println("NO");
            }else {
                // 스택에 값이 존재하지 않으면 true
                System.out.println("YES");
            }

        }

    }

}


