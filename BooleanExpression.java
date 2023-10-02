public abstract class BooleanExpression {
    public abstract boolean evaluate(Context context);
    public abstract BooleanExpression replace(String name, BooleanExpression exp);
    public abstract BooleanExpression copy();
}