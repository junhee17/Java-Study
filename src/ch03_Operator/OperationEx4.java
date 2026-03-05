package ch03_Operator;

// 조건 연산자를 사용하여 부모님의 나이 비교하기
public class OperationEx4 {
    public static void main(String[] args) {
        int fatherAge = 45;
        int motherAge = 47;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';   // 조건식이 거짓이므로 T 선택

        System.out.println(ch);
    }
}

/*
조건 연산자 (삼항 연산자)
* 조건식 ? 결과 1 : 결과2; -> 조건식이 참이면 결과1, 조건식이 거짓이면 결과 2가 선택됨
 */