package calculator;

import java.util.*;

public class Calculator<T> {
    private ArrayList<T> result;
    private ArrayList<Integer> circle;
    static final double PI = 3.14;
    private T num1;
    private T num2;

    /* 생성자 구현 */
    public Calculator() {
        result = new ArrayList<>();
        circle = new ArrayList<>();
    }
    /* Getter 메서드 구현 */
    public ArrayList<T> getResult() {
        return result;
    }

    /* Setter 메서드 구현 */
    public void setResult(ArrayList<T> result) {
        this.result = result;
    }

    /* 원의 넓이 Getter, Setter 메서드 구현 */
    public ArrayList<Integer> getCircle() {
        return circle;
    }

    public void setCircle(ArrayList<Integer> circle) {
        this.circle = circle;
    }

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }
}
