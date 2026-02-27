package ch02_VarAndType;

// 문자형 연습
public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);      // 문자 A 출력
        System.out.println((int)ch1);     // 뮨자에 해당하는 정숫값(아스키 코드값) 65 출력

        char ch2 = 66;        // 정숫값 대입
        System.out.println(ch2);     //정숫값에 해당하는 문자 B 출력

        int ch3 = 67;
        System.out.println(ch3);    // 문자 정수값 67 출력
        System.out.println((char)ch3);     // 정숫값에 해당하는 문자 C 출력
    }
}

/*
* 문자형을 int형으로 출력하고 싶을 때, char형으로 선언한 변수 앞에 (int) 붙이기
  int형을 char형으로 출력하고 싶을 때, (char) 붙이기
* 문자를 사용할 땐 '' (작은 따옴표)로 감싸고, 문자열은 ""(큰 따옴표)로 감싼다
* 'A'와 "A"는 전혀 다른 값이며 문자열의 경우 끝에 항상 널 문자(\0)가 있다
* 유니코드 값을 직접 사용하여 처리할 수도 있다  Ex) '\uD55C'-> 한 \(백슬래시)는 뒤에 나올 내용이 특수한 내용이라는 걸 알려주기 위함
 */