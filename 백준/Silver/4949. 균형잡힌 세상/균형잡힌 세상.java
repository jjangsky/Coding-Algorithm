import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String text = br.readLine();
            if(!text.equals(".")){
                Stack<Character> stack = new Stack<>();
                text = text.trim();
                boolean isFlag = true;
                for(int i = 0; i < text.length(); i++){
                    char input = text.charAt(i);
                    if(input == '(' || input == '['){
                        stack.push(input);
                    }

                    if(input == ')'){
                        if(!stack.isEmpty() && stack.peek() == '('){
                            stack.pop();
                        }else{
                            isFlag = false;
                            break;
                        }
                    }

                    if(input == ']'){
                        if(!stack.isEmpty() && stack.peek() == '['){
                            stack.pop();
                        }else{
                            isFlag = false;
                            break;
                        }
                    }
                }

                if(stack.isEmpty() && isFlag){
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }else{
                break;
            }
        }

    }
}



