package ch03_Operator;

// 산술 연산자를 사용하여 총점과 평균 구하기
public class OperationEx1 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore;     // 수학, 영어의 총점 구하기
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0;        // 평균 구하기 ((수학 + 영어) / 2.0)
        System.out.println(avgScore);
    }
}
