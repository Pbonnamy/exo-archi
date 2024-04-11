public class Beverage {
    private String name;
    private BeverageSize size;

    public Beverage(String name, BeverageSize size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public BeverageSize getSize() {
        return size;
    }

    public boolean isSmall() {
        return size.equals(BeverageSize.SMALL);
    }

    public boolean isMedium() {
        return size.equals(BeverageSize.MEDIUM);
    }

    public boolean isLarge() {
        return size.equals(BeverageSize.LARGE);
    }
}
