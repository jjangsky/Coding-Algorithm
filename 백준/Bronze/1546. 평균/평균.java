import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subject = sc.nextInt();
        int[] subArr = new int[subject];
        for(int i = 0; i < subject; i++){
            subArr[i] = sc.nextInt();
        }

        int maxScore = 0;
        for(int i = 0; i < subject; i++){
            if(subArr[i] > maxScore){
                maxScore = subArr[i];
            }
        }

        float totalNewScore = 0;
        for(int i = 0; i < subject; i++){
            float score = ((float)subArr[i] / maxScore)*100;
            totalNewScore += score;
        }

        float avg = totalNewScore/subject;

        System.out.println(avg);






    }
}
