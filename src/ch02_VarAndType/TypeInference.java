package ch02_VarAndType;

/*
기존에는 자바의 모든 변수를 사용할 때는 자료형을 정확히 명시해야 했음
자바 10부터 자료형을 쓰지 않고도 var을 통해 컴파일 됨
주의 사항
* 한번 선언한 자료형 변수를 다른 자료형으로 사용할 수 없다
* var로 자료형 없이 변수를 선언하는 방법은 지역변수 {}범위 내만 가능하다
 */

// var를 사용해 변수 선언하기
public class TypeInference {
    public static void main(String[] args) {
        var i = 10;       // int i = 10으로 컴파일
        var j = 10.0;     // double j = 10.0으로 컴파일
        var str = "hello";     // String str = "hello"로 컴파일

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";   // 위에서 문자형으로 컴파일된 str은 같은 문자욜은 대입가능,
        // str = 3      // 오류가 발생하기 때문에 주석으로 처리 - 정수형 같이 다른 형은 대입 불가능
    }
}
