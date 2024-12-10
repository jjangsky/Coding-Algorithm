import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());

        // 스택 선언
        Stack<Integer> box = new Stack<>();
        for(int i = 0; i < cnt; i++){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "1":
                    box.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    if(!box.empty()){
                        str.append(box.pop()).append("\n");
                    }else{
                        str.append(-1).append("\n");
                    }
                    break;
                case "3":
                    if(!box.empty()){
                        str.append(box.size()).append("\n");
                    }else{
                        str.append(0).append("\n");
                    }
                    break;
                case "4":
                    if (box.empty()){
                        str.append(1).append("\n");
                    }else{
                        str.append(0).append("\n");
                    }
                    break;
                case "5":
                    if(!box.empty()){
                        str.append(box.peek()).append("\n");
                    }else{
                        str.append(-1).append("\n");
                    }
                    break;
            }
        }

        System.out.print(str);
    }

}


