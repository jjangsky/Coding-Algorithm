import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i < cnt; i++){
            String[] inputArr = br.readLine().split(" ");
            switch (inputArr[0]){
                case "1" :
                    deque.addFirst(Integer.parseInt(inputArr[1]));
                    break;
                case "2" :
                    deque.addLast(Integer.parseInt(inputArr[1]));
                    break;
                case "3" :
                    if(!deque.isEmpty()){
                        System.out.println(deque.poll());
                    }else{
                        System.out.println(-1);
                    }
                    break;
                case "4" :
                    if(!deque.isEmpty()){
                        System.out.println(deque.pollLast());
                    }else{
                        System.out.println(-1);
                    }
                    break;
                case "5" :
                    if(!deque.isEmpty()){
                        System.out.println(deque.size());
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "6" :
                    if(!deque.isEmpty()){
                        System.out.println(0);
                    }else{
                        System.out.println(1);
                    }
                    break;
                case "7" :
                    if(!deque.isEmpty()){
                        System.out.println(deque.peek());
                    }else{
                        System.out.println(-1);
                    }
                    break;
                case "8" :
                    if(!deque.isEmpty()){
                        System.out.println(deque.peekLast());
                    }else{
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}


