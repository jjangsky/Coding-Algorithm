import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 최대 20개의 입력을 받는다고 가정
        String[] arr = new String[20];

        for (int i = 0; i < 20; i++) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            arr[i] = input;
        }

        List<Map<String, Object>> resultList = new ArrayList<>();
        for (String text : arr) {
            if (text == null || text.isEmpty()) { // 입력이 비어있으면 무시
                continue;
            }
            String[] grades = text.split(" ");

            Map<String, Object> result = new HashMap<>();
            result.put("sub", grades[0]);
            result.put("mark", Double.parseDouble(grades[1])); // 학점을 double로 변환
            result.put("grade", grades[2]);
            resultList.add(result);
        }

        double totalCredits = 0; // 총 학점
        double weightedScore = 0; // 가중 학점 합

        for (Map<String, Object> result : resultList) {
            String grade = (String) result.get("grade");
            if (!grade.equals("P")) { // Pass 과목은 계산에서 제외
                double credits = (double) result.get("mark");
                double gradePoint = getGradePoint(grade);
                weightedScore += gradePoint * credits; // 가중 학점 합
                totalCredits += credits; // 총 학점
            }
        }

        // 결과 계산
        if (totalCredits > 0) {
            double gpa = weightedScore / totalCredits;
            System.out.printf("%.6f%n", gpa);
        }
    }

    public static double getGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0.0; // 잘못된 성적은 0점 처리
        }
    }
}
