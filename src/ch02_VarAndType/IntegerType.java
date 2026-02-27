package ch02_VarAndType;

public class IntegerType {
    public static void main(String[] args) {
        byte bNum = 127;       // 1바이트
        short sNum = 32767;    // 2바이트
        int iNum = 2147483647; // 4바이트 (가장 많이 씀)
        long lNum = 12345678900L; // 8바이트 (끝에 L or l을 붙여야 함!)

        System.out.println(iNum);
    }
}

/*
* 각 정수 자료형의 범위를 넘어가면 오류가 발생
* 자바는 모든 정수 값을 int형을 기본으로 처리 (연산 등)
* long  num = 1000; -> 오류 발생하지 않는 이유는 1000이 int의 범위를 넘지 않고 long형으로 자동 변환됨

 */