public class Constant extends BooleanExpression {
    private final boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(Context context) {
        return value;
    }

    @Override
    public BooleanExpression replace(String name, BooleanExpression exp) {
        return this;
    }

    @Override
    public BooleanExpression copy() {
        return new Constant(value);
    }
}
