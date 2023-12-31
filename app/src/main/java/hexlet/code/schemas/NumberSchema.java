package hexlet.code.schemas;

public final class NumberSchema extends BaseSchema {

    public NumberSchema() {
        super();
        addCheck("instanceof",
                value -> {
                    if (value != null) {
                        return value instanceof Integer;
                    }
                    return true;
                }
        );
    }

    public NumberSchema required() {
        addCheck("required",
                value -> value != null
        );
        return this;
    }

    public NumberSchema positive() {
        addCheck("positive",
                value -> {
                    if (value instanceof Integer) {
                        return (Integer) value > 0;
                    }
                    return true;
                }
        );
        return this;
    }

    public NumberSchema range(int min, int max) {
        addCheck("range",
                value -> {
                    if (value instanceof Integer) {
                        return (Integer) value >= min && (Integer) value <= max;
                    }
                    return true;
                }
        );
        return this;
    }
}
