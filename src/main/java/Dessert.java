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

    public int getPrice(Beverage beverage) {
        if (isNormal()) {
            if (beverage.isMedium()) {
                System.out.print("Prix Formule Standard appliquée ");

                return 0;
            }

            return 2;
        } else {
            if (beverage.isLarge()) {
                System.out.print("Prix Formule Max appliquée ");

                return 0;
            }

            return 4;
        }
    }
}
