public class Main {

    public static void main(String[] args) {
        // pour tester, lancer en ligne de commande :
        // java Program "assiette" "couscous" "coca" "moyen" "baba" "normal" "yes"
        // Note: Make sure the class name matches the file name when compiling and running in Java.
        App app = new App();

        Meal meal = new Meal(args[1], MealType.fromValue(args[0]));
        Beverage beverage = new Beverage(args[2], BeverageSize.fromValue(args[3]));
        Dessert dessert = new Dessert(args[4], DessertSize.fromValue(args[5]));

        boolean coffee = args[6].equals("yes");

        int price = app.Compute(meal, beverage, dessert, coffee);
        System.out.println("Prix à payer : " + price + "€");
    }
}