package ch03_Operator;

// 증가, 감소 연산자를 사용하여 값 연산하기
public class Q9 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore1 = gameScore++;
        System.out.println(lastScore1);

        int lastScore2 = gameScore--;
        System.out.println(lastScore2);
    }
}
