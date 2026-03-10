package ch03_Operator;

// 수학 점수, 영어 점수, 국어 점수의 총점과 평균을 구하는 코드
public class Q8 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;
        int korScore = 80;

        int totalScore = mathScore + engScore + korScore;
        System.out.println(totalScore);

        double avgScore = totalScore / 3.0;
        System.out.println(totalScore);
    }
}
