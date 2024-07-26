package calculator;

import java.util.*;

public class Calculator {
    /* 수정 */
    private ArrayList<Integer> result;
    private ArrayList<Integer> circle;
    // pi 값이 변하지 않게 final 사용
    final double PI = 3.141592;

    /* 생성자 구현 */
    public Calculator() {
        result = new ArrayList<Integer>();
        circle = new ArrayList<Integer>();
    }
    /* Getter 메서드 구현 */
    public ArrayList<Integer> getResult() {
        return result;
    }

    /* Setter 메서드 구현 */
    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }

    public ArrayList<Integer> getCircle() {
        return circle;
    }

    public void setCircle(ArrayList<Integer> circle) {
        this.circle = circle;
    }
}
