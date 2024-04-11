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
        if (beverage.isSmall()) {
            if (isNormal()) {
                return 2;
            } else {
                return 4;
            }
        } else if (beverage.isMedium()) {
            if (isNormal()) {
                System.out.print("Prix Formule Standard appliquée ");

                return 0;
            } else {
                return 4;
            }
        } else if (beverage.isLarge()) {
            if (isNormal()) {
                return 2;
            } else {
                System.out.print("Prix Formule Max appliquée ");

                return 0;
            }
        }

        return 0;
    }
}
