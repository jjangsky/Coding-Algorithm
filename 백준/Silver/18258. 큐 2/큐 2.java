import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int lastInput = 0; // 마지막 입력값

        for(int i = 0; i < cnt; i++){
            String[] inputArr = br.readLine().split(" ");
            switch (inputArr[0]){
                case "push" :
                    queue.offer(Integer.parseInt(inputArr[1]));
                    lastInput = Integer.parseInt(inputArr[1]);
                    break;
                case "pop" :
                    if(!queue.isEmpty()){
                        sb.append(queue.poll()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if(!queue.isEmpty()){
                        sb.append(0).append("\n");
                    }else{
                        sb.append(1).append("\n");
                    }
                    break;
                case "front" :
                    if(!queue.isEmpty()){
                        sb.append(queue.peek()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                case "back" :
                    if(!queue.isEmpty()){
                        sb.append(lastInput).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}


