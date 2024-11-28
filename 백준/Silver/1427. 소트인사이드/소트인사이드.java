import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");

        List<Integer> list = new ArrayList<>();
        for(String item : input){
            list.add(Integer.valueOf(item));
        }
        list.sort(Comparator.reverseOrder());
        for (Integer a : list){
            System.out.print(a);
        }
    }
}
