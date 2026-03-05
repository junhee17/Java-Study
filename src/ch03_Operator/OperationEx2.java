package ch03_Operator;

// 증가, 감소 연산자를 사용하여 값 연산하기
public class OperationEx2 {
    public static void main(String[] args) {
        int gameScore = 150;     // 게임에서 획득한 점수는 150점

        int lastScore1 = ++gameScore;     // gameScoredp 1만큼 더한 값을 lastScore1에 대입 -> 150 + 1 = 151
        System.out.println(lastScore1);    // 151 출력

        int lastScore2 = --gameScore;     // 151이 된 gameScore에서 1만큼 뺀 값을 lastScore2에 대입 -> 151 - 1 = 150
        System.out.println(lastScore2);    // 150 출력
    }
}

/*
++ -> 힝의 값에 1을 더함
-- -> 항의 값에서 1을 뺌
* 연산자가 앞에 있을경우 먼저 값이 1 증가,감소된 뒤, 변수에 대입함 Ex) val = ++num;
* 연산자가 뒤에 있을 경우 변수에 기존 값을 먼저 대입한 뒤, 값을 증가,감소 함 Ex) val = num--;
 */
