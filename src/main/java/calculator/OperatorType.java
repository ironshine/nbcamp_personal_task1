package calculator;

public enum OperatorType {

    ADD('+'),
    SUB('-'),
    MUL('*'),
    DIV('/'),
    MOD('%')
    ;

    private final char label;

    OperatorType(char label) {
        this.label = label;
    }

    public char label() {
        return label;
    }
    public static OperatorType findOperatorType(char label) {
        for (OperatorType type : values()) {
            if (type.label() == label) {
                return type;
            }
        }
        return null;
    }

}
