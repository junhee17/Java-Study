package ch04_Ifexample;

// if-else if-else문으로 입장료 계산하기
public class Ifexample2 {
    public static void main(String[] args) {
        int age = 9;
        int charge;

        if (age < 8) {
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        }
        else if (age < 14) {   // 이 조건문에서 만족하므로 더 이상 다른 조건식은 비교하지 않음
            charge = 2000;
            System.out.println("초등학생입니다.");
        }
        else if (age < 20) {
            charge = 2500;
            System.out.println("중고등학생입니다.");
        }
        else {
            charge = 3000;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는 " + charge + "원입니다.");    // 출력문에서 +를 사용하면 여러단어를 연결하여 출력가능
    }
}

/*
* if-else if문 : 하나의 조건을 만족하면 나머지 비교는 생략함
- 동일 조건(나이 등)을 비교할 떈 if-else if문을 써야 불필요한 연산ㅇ르 막고 정확한 결과가 출력
* if-if문 : 각 조건을 독립적으로 모두 체크해야 할 때 사용 (성별 등 개별 조건)
 */