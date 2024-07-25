package calculator;

import java.util.*;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */

    private ArrayList<Integer> result;

    /* 생성자 구현 */
    public Calculator() {
        result = new ArrayList<Integer>();
    }


    public int calculate(int num1, int num2, char cha, int count) {
        /* 위 요구사항에 맞게 구현 */
        if (num2 == 0 && cha == '/') {
            System.out.println("0으로 나눌 수 없습니다.");
            result.add(0);
            return result.get(count);
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

    /* Getter 메서드 구현 */
    public ArrayList<Integer> getResult() {
        return result;
    }

    /* Setter 메서드 구현 */
    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }

    public void removeResult() {
        /* 구현 */
        result.remove(0);
    }
    public void inquiryResults() {
        /* 구현 */
        System.out.println(result.toString());
    }
}
