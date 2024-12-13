import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> saveNum = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int totalCnt = Integer.parseInt(st.nextToken());
        int checkNum = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= totalCnt; i++){
            queue.offer(i);
        }

        while (true){
            for(int i = 1; i <= checkNum; i++){
                if( i == checkNum){
                    saveNum.add(queue.poll());
                }else{
                    queue.offer(queue.poll());
                }
            }
            if(queue.isEmpty()){
                sb.append("<");
                for(int i = 1; i <= saveNum.size(); i++){
                    if (i == saveNum.size()){
                        sb.append(saveNum.get(i-1));
                    }else{
                        sb.append(saveNum.get(i-1)).append(", ");
                    }
                }
                sb.append(">");
                System.out.println(sb);
                break;
            }
        }
    }
}



