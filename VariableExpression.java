public class VariableExpression extends BooleanExpression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean evaluate(Context context) {
        return context.lookup(name);
    }

    @Override
    public BooleanExpression replace(String name, BooleanExpression exp) {
        if (this.name.equals(name)) {
            return exp.copy();
        } else {
            return new VariableExpression(this.name);
        }
    }

    @Override
    public BooleanExpression copy() {
        return new VariableExpression(name);
    }
}
