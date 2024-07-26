package calculator;
public class ArithmeticCalculator extends Calculator{
    AddOperator addOper = new AddOperator();
    SubtractOperator subOper = new SubtractOperator();
    MultiplyOperator multOper = new MultiplyOperator();
    DivideOperator diviOper = new DivideOperator();
    ModOperator modOper = new ModOperator();

    /* 구현 */
    public int calculate(int num1, int num2, char cha, int count) {
        /* 수정 */
        /* 위 요구사항에 맞게 구현 */
        if (num2 == 0 && cha == '/') {
            System.out.println("0으로 나눌 수 없습니다.");
            getResult().add(0);
            return getResult().get(count);
        }
        switch (cha) {
            case '+':
                getResult().add(addOper.operate(num1,num2));
                break;
            case '-':
                getResult().add(subOper.operate(num1,num2));
                break;
            case '*':
                getResult().add(multOper.operate(num1,num2));
                break;
            case '/':
                getResult().add(diviOper.operate(num1,num2));
                break;
            case '%':
                getResult().add(modOper.operate(num1,num2));
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        /* return 연산 결과 */
        return getResult().get(count);
    }

    public void removeResult() {
        /* 구현 */
        getResult().remove(0);
    }
    public void inquiryResults() {
        /* 구현 */
        System.out.println(getResult().toString());
    }
}
