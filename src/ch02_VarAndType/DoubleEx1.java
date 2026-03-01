package ch02_VarAndType;

// 실수형 변수를 선언하고 값을 출력하기
public class DoubleEx1 {
    public static void main(String[] args) {
        double dnum = 3.14;     // 자바에서 실수는 double형을 기본으로 사용
        float fnum = 3.14F;     // float형을 사용하고 싶다면 F, f와 같은 식별자를 사용해줘야함

        System.out.println(dnum);
        System.out.println(fnum);
    }
}
