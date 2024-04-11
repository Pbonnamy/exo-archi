public class App {

    // calcule le prix payé par l'utilisateur dans le restaurant, en fonction de type de
    // repas qu'il prend (assiette ou sandwich), de la taille de la boisson (petit, moyen, grand), du dessert et
    // de son type (normal ou special) et si il prend un café ou pas (yes ou no).
    // les prix sont fixes pour chaque type de chose mais des réductions peuvent s'appliquer
    // si cela rentre dans une formule!
    public int Compute(Meal meal, Beverage beverage, Dessert dessert, String coffee) {

        int total = 0;

        if (meal.isPlate()) {
            total += 15;

            if (beverage.isSmall()) {

                total += 2;

                if (dessert.isNormal()) {

                    total += 2;
                } else {

                    total += 4;
                }

            } else if (beverage.isMedium()) {

                total += 3;
                if (dessert.isNormal()) {

                    System.out.print("Prix Formule Standard appliquée ");

                    total = 18;
                } else {
                    total += 4;
                }

            } else if (beverage.isLarge()) {

                total += 4;
                if (dessert.isNormal()) {

                    total += 2;
                } else {

                    System.out.print("Prix Formule Max appliquée ");

                    total = 21;
                }

            }
        } else {
            total += 10;
            if (beverage.isSmall()) {

                total += 2;

                if (dessert.isNormal()) {

                    total += 2;
                } else {

                    total += 4;
                }

            } else if (beverage.isMedium()) {
                total += 3;

                if (dessert.isNormal()) {

                    System.out.print("Prix Formule Standard appliquée ");

                    total = 13;

                } else {

                    total += 4;
                }

            } else if (beverage.isLarge()) {
                total += 4;

                if (dessert.isNormal()) {

                    total += 2;
                } else {

                    System.out.print("Prix Formule Max appliquée ");

                    total = 16;
                }

            }
        }
        if (meal.isPlate() && beverage.isMedium() && dessert.isNormal() && coffee.equals("yes")) {
            System.out.print(" avec café offert!");
        } else {

            if (!coffee.equals("yes")) {
                total += 1;
            }
        }
        return total;
    }


}