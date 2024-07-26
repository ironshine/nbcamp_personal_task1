package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* Calculator 인스턴스 생성 */
        Calculator cal = new Calculator();
        CircleCalculator circleCal = new CircleCalculator();
        ArithmeticCalculator ariCal = new ArithmeticCalculator();

        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        int count = 0;
        int circleCount = 0;

        /* 반복문 사용 해서 연산을 반복 */
        /* 반복문 시작 */
        String str = "";
        while (!str.equals("exit")) {
            /* 사칙연산을 진행할지 원의 너비를 구할지 선택 구현 */
            System.out.println("원의 넓이를 구하시겠습니까? (원의넓이 입력 시 진행)");
            /* 원의 넓이를 구하는 경우 반지름을 입력받아 원의 넓이를 구한 후 출력*/
            if (sc.nextLine().equals("원의넓이")) {
                System.out.print("반지름을 입력하세요: ");
                int num1 = sc.nextInt();
                sc.nextLine();

                /* 원의 넓이 저장 */
                /* 원의 넓이 출력 */
                System.out.println("결과: " + circleCal.calculateCircleArea(num1, circleCount));

                /* 저장된 원의 넓이 값들 바로 전체 조회 */
                System.out.println("저장된 원의넓이를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (sc.nextLine().equals("inquiry")) {
                    circleCal.inquiryCircle();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                /* exit을 입력 받으면 반복 종료 */
                str = sc.nextLine();

                /* index 증가 */
                circleCount++;
                continue;
            }
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();
            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char cha = sc.nextLine().charAt(0);

            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            /* 연산의 결과를 배열에 저장합니다. */
            System.out.println("결과: " + ariCal.calculate(num1,num2,cha,count));


            /* index를 증가 시킵니다. */
            count++;

            /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            /* 위 요구사항에 맞게 구현 */
            if (sc.nextLine().equals("remove")) {
                ariCal.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            /* 위 요구사항에 맞게 구현 */
            /* 문제 요구사항에 맞게 toString 에서 foreach문으로 변경 */
            if (sc.nextLine().equals("inquiry")) {
                ariCal.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            str = sc.nextLine();
        }
        /* 반복문 종료 */
    }
}
