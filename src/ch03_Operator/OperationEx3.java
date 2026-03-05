package ch03_Operator;

// 단락 회로 평가 (논리 연산)
public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 논리곱(&&)에서 앞 항의 결과값이 거짓이므로 뒷 항은 실행 X
        System.out.println(value);  // false
        System.out.println(num1);   // 20
        System.out.println(i);    // 2 -> 논리 곱에서 뒷 항이 실행되지 않았으므로 i 값은 그대로 2

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);  // 논리합(||)에서 앞 항의 결과값이 참이므로 이 문장은 실행 X
        System.out.println(value);   // true
        System.out.println(num1);   // 30
        System.out.println(i);   // 2 -> 논리 합에서 뒷  항이 실행되지 않았으므로 i 값은 그대로 2
    }
}

/*
단락 회로 평가 - 두 항을 모두 실행하지 않더라도 결과값을 알 수 있는 경우에, 나머지 항은 실행되지 않는 것
&& -> 논리 곱 : 두 항이 모두 참인 경우에만 결과값이 참, 그렇지 않으면 거짓
|| -> 논리 합 : 두 항 중 하나만 참이면 결과값이 참, 두 항이 모두 거짓이면 거짓
! -> 부정 : 참인 경우는 결과값을 거짓으로, 거짓인 경우는 참으로 바꿈
 */