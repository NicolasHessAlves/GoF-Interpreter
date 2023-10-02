import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Boolean> variableMap = new HashMap<>();

    public boolean lookup(String name) {
        return variableMap.getOrDefault(name, false);
    }

    public void assign(VariableExpression var, boolean value) {
        variableMap.put(var.getName(), value);
    }
}