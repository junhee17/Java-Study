package ch02_VarAndType;

// 상수 사용하기
public class Constant {
    public static void main(String[] args) {
        final int MAX_NUM = 100;    // 1. 선언과 동시에 초기화 하는 방법 (가장 일반적)
        final int MIN_NUM;          // 2. 선언만 먼저 하기 (나중에 값을 정할 때)

        MIN_NUM = 0;        // 사용하기 전 반드시 초기화 필요! (하지 않으면 오류 발생)

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        // MAX_NUM = 1000;     // 상수는 값을 변경할 수 없으므로, 이 코드는 오류 발생
    }

}

/*
* 상수 - 변하지 않는 수
* 한 번 선언한 상수는 변하지 않기 떄문에 선언과 동시에 값을 지정하는 것이 좋음
* 상수 이름은 대문자를 주로 사용
* 프로그램 내무에서 반복적으로 사용하고, 변하지 않아야 하는 값을 상수로 선언하면 편리
* 나중에 값이 변경 되어도 그 상수 값만 변경하면 됨
 */
