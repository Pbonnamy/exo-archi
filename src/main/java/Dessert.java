public class Dessert {
    private String name;
    private DessertSize size;

    public Dessert(String name, DessertSize size) {
        this.name = name;
        this.size = size;
    }

    public boolean isNormal() {
        return size == DessertSize.NORMAL;
    }
}
