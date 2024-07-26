package calculator;
public class CircleCalculator extends Calculator{
    /* 구현 */
    /* 원의 넓이를 구하는 메서드 선언*/
    public int calculateCircleArea(int num1, int count) {
        /* 원의 넓이 계산 구현 */
        getCircle().add((int) (num1 * num1 * PI));
        return getCircle().get(count);
    }

    public void inquiryCircle() {
        System.out.println(getCircle().toString());
    }
}
