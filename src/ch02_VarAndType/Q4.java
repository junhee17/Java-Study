package ch02_VarAndType;

// 명시적 형 변환 확인하기
public class Q4 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 2.0;

        System.out.println((int)(num1 + num2));
        System.out.println((int)(num1 - num2));
        System.out.println((int)(num1 * num2));
        System.out.println((int)(num1 / num2));
    }
}
