public enum BeverageSize {
    SMALL("petit"),
    MEDIUM("moyen"),
    LARGE("grand");

    private final String value;

    BeverageSize(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static BeverageSize fromValue(String value) {
        for (BeverageSize size : BeverageSize.values()) {
            if (size.getValue().equals(value)) {
                return size;
            }
        }
        return null;
    }
}
