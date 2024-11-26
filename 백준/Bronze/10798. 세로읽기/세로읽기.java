import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] firstArr = new String [5][15];

        // 가장 큰 문자열
        int size = 0;

        for(int i = 0; i < 5; i++){
            String[] text = br.readLine().split("");
            firstArr[i] = new String[text.length];
            for(int j = 0; j < text.length; j++){
                // 배열의 크기를 동적으로 생성해야함
                firstArr[i][j] = text[j];
                // 가장 큰 문자열 길이 저장
                if(text.length > size){
                    size = text.length;
                }
            }
        }
        for(int i = 0; i < size; i++){
            for (int j = 0; j< 5; j++) {
                if (i < firstArr[j].length)
                    System.out.print(firstArr[j][i]);
            }
        }
    }
}

