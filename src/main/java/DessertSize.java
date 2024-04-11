public enum DessertSize {
    NORMAL("normal"),
    SPECIAL("special");

    private final String value;

    DessertSize(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static DessertSize fromValue(String value) {
        for (DessertSize size : DessertSize.values()) {
            if (size.getValue().equals(value)) {
                return size;
            }
        }
        return null;
    }
}
