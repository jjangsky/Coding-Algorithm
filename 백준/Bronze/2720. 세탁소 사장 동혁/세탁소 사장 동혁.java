import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] tokenArr = {25, 10, 5, 1};
        // 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++){
            int changeMoney = Integer.parseInt(br.readLine());

            for (int k : tokenArr) {
                System.out.print(changeMoney / k + " ");
                changeMoney = changeMoney % k;
            }
            System.out.println();

            }

        }







}

