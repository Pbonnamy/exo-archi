public class Meal {
    private String name;
    private MealType type;

    public Meal(String name, MealType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public MealType getType() {
        return type;
    }

    public boolean isPlate() {
        return type.equals(MealType.PLATE);
    }

    public boolean isSandwich() {
        return type.equals(MealType.SANDWICH);
    }
}
