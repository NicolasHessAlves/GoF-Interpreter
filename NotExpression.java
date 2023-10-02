// NotExp class
public class NotExpression extends BooleanExpression {
    private BooleanExpression operand;

    public NotExpression(BooleanExpression operand) {
        this.operand = operand;
    }

    @Override
    public boolean evaluate(Context context) {
        return !operand.evaluate(context);
    }

    @Override
    public BooleanExpression replace(String name, BooleanExpression exp) {
        return new NotExpression(operand.replace(name, exp));
    }

    @Override
    public BooleanExpression copy() {
        return new NotExpression(operand.copy());
    }
}
