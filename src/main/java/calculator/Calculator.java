package calculator;

import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    ArrayList<Integer> result = new ArrayList<Integer>();


    public int calculate(int num1, int num2, char cha, int count) {
        /* 위 요구사항에 맞게 구현 */
        if (num2 == 0 && cha == '/') {
                System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        switch (cha) {
            case '+':
                result.add(num1 + num2);
                break;
            case '-':
                result.add(num1 - num2);
                break;
            case '*':
                result.add(num1 * num2);
                break;
            case '/':
                result.add(num1 / num2);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        /* return 연산 결과 */
        return result.get(count);
    }
}
