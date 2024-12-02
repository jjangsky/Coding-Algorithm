import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // nCnt 읽기 및 n 배열 생성
        int nCnt = Integer.parseInt(br.readLine());
        String[] inputN = br.readLine().split(" ");

        // HashSet으로 n 배열 저장
        HashSet<Integer> nSet = new HashSet<>();
        for (int i = 0; i < nCnt; i++) {
            nSet.add(Integer.parseInt(inputN[i]));
        }

        // mCnt 읽기 및 m 배열 생성
        int mCnt = Integer.parseInt(br.readLine());
        String[] inputM = br.readLine().split(" ");
        int[] checkArr = new int[mCnt];

        // m 배열의 각 값을 HashSet에서 조회
        for (int i = 0; i < mCnt; i++) {
            int mValue = Integer.parseInt(inputM[i]);
            checkArr[i] = nSet.contains(mValue) ? 1 : 0;
        }

        // 결과 출력
        for (int i = 0; i < checkArr.length; i++) {
            System.out.print(checkArr[i] + " ");
        }
    }
}