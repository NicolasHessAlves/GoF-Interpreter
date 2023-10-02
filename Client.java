public class Client {
    public static void main (String[] args) {
        // Expression (true and x) or (y and (not x))

        BooleanExpression expression;
        Context context = new Context();

        VariableExpression x = new VariableExpression("X");
        VariableExpression y = new VariableExpression("Y");

        expression = new OrExpression(new AndExpression(new Constant(true), x), new AndExpression(y, new NotExpression(x)));

        context.assign(x, false);
        context.assign(y, true);

        System.out.println("Result: " + Boolean.toString(expression.evaluate(context)));

        // Expression (true and x) or ((not z) and (not x))

        VariableExpression z = new VariableExpression("Z");
        NotExpression notZ = new NotExpression(z);

        BooleanExpression replacement = expression.replace("Y", notZ);

        context.assign(z, true);

        System.out.println("Result: " + Boolean.toString(replacement.evaluate(context)));
    }
}
