public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Interpreter Pattern ----");
        Context context = new Context();
        context.put("a", 5);
        context.put("b", 10);

        AbstractExpression innerExp = new MultiplyNonTerminalExpression(new TerminalExpression("a"), new TerminalExpression("b"));
        AbstractExpression expression = new MultiplyNonTerminalExpression(new TerminalExpression("a"), innerExp);
        System.out.println("Product Result is:  " + expression.interpret(context));

    }
}
