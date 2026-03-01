package ch02_VarAndType;

// 명시적 형 변환 확인하기
public class ExplicitConversion {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2;   // 더하기 전 형 변환 일어남 (1과 0으로 변환된 두 값을 합하여 결과값 1)
        int iNum4 = (int)(dNum1 + fNum2);    // 두 실수의 합이 먼저 계산되고 형 변환됨
                                             // 더하는 과정에서 묵시적 형 변환 일어나 더해져 2.1, 이후 int형으로 명시적 형 변환으로 2
        System.out.println(iNum3);    // 1 출력
        System.out.println(iNum4);    // 2 출력
    }
}

/*
명시적 형 변환의 경우 프로그래머가 변환할 자료형을 괄호안에 명시적으로 써줘야함
같은 연산이라도 형 변환이 언제 이루어졌는지에 따라 결괏값이 다르게 나타날 수 있음

명시적 형 변환이 일어나는 경우:
* 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우 Ex) int -> byte
하지만 byte형이 표현할 수 있는 범위를 넘으면 자료 손실이 발생할 수 있음
int iNum = 1000;          // 1000이 byte의 범위를 넘음
byte bNum = (byte)iNum;    // -24 출력
* 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입하는 경우 Ex) 실수 자료형 double -> 정수 자료형 int
실수의 소수점 이하 부분이 생략되고 정수만 출력됨
 */