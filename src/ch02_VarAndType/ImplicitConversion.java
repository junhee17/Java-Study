package ch02_VarAndType;

// 묵시적 형 변환 확인하기
public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum;    // byte값이 int형 변수로 대입

        System.out.println(bNum);     // 10 출력
        System.out.println(iNum);     // 10 출력

        int iNum2 = 20;
        float fNum = iNum2;    // int형 값이 float형 변수로 대입

        System.out.println(iNum);     // 10 출력
        System.out.println(fNum);     // 20.0 출력

        double dNum;
        dNum = fNum + iNum;     // 20.0 + 10
        System.out.println(dNum);    // 30.0 출력


    }
}

/*
* 형 변환 - 각 변수의 자료형이 다를 때 자료형을 같게 바꾸는 것
묵시적 형 변환이 일어나는 경우 데이터 손실 우려가 없으므로 자바가 자동으로 변환해줌
* 바이트 크기가 작은 자료형에서 큰 자료형으로
* 덜 정밀한 자료형에서 더 정밀한 자료형으로
 */
