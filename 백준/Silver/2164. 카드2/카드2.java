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

        for(int i = 1; i <= cnt; i++){
            queue.offer(i);
        }

        // 1만 들어온 경우는 바로 출력
        if(queue.size() == 1){
            System.out.println(1);
            return;
        }

        boolean isFlag = true;

        while (true){
            if(isFlag){
                queue.poll();
                isFlag = false;
            }else{
                queue.offer(queue.poll());
                isFlag = true;
            }
            if(queue.size() == 1){
                System.out.println(queue.peek());
                break;
            }

        }
    }
}



