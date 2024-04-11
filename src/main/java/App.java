public class App {

    // calcule le prix payé par l'utilisateur dans le restaurant, en fonction de type de
    // repas qu'il prend (assiette ou sandwich), de la taille de la boisson (petit, moyen, grand), du dessert et
    // de son type (normal ou special) et si il prend un café ou pas (yes ou no).
    // les prix sont fixes pour chaque type de chose mais des réductions peuvent s'appliquer
    // si cela rentre dans une formule!
    public int Compute(Meal meal, Beverage beverage, Dessert dessert, boolean coffee) {

        int total = 0;

        total += meal.getPrice();
        total += beverage.getPrice();
        total += dessert.getPrice(beverage);

        if (meal.isPlate() && beverage.isMedium() && dessert.isNormal() && coffee) {
            System.out.print(" avec café offert!");
        } else {

            if (!coffee) {
                total += 1;
            }
        }
        return total;
    }
}