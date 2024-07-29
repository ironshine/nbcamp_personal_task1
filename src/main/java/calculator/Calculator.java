package calculator;

import java.util.*;

public class Calculator {
    private ArrayList<Integer> result;
    private ArrayList<Integer> circle;
    static final double PI = 3.14;

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

    /* 원의 넓이 Getter, Setter 메서드 구현 */
    public ArrayList<Integer> getCircle() {
        return circle;
    }

    public void setCircle(ArrayList<Integer> circle) {
        this.circle = circle;
    }
}
