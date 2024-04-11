public enum MealType {
    PLATE("assiette"),
    SANDWICH("sandwich");

    private final String value;

    MealType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static MealType fromValue(String value) {
        for (MealType type : MealType.values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        return null;
    }
}
