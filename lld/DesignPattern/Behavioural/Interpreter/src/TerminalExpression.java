public class TerminalExpression implements AbstractExpression {
    private String value;

    public TerminalExpression(String value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return context.get(value);
    }
}
