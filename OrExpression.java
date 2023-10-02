public class OrExpression extends BooleanExpression {
    private BooleanExpression operand1;
    private BooleanExpression operand2;

    public OrExpression(BooleanExpression operand1, BooleanExpression operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public boolean evaluate(Context context) {
        return operand1.evaluate(context) || operand2.evaluate(context);
    }

    @Override
    public BooleanExpression replace(String name, BooleanExpression exp) {
        return new OrExpression(operand1.replace(name, exp), operand2.replace(name, exp));
    }

    @Override
    public BooleanExpression copy() {
        return new OrExpression(operand1.copy(), operand2.copy());
    }
}