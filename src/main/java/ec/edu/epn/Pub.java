package ec.edu.epn;

public class Pub {
    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

    private static final int INGREDIENT_RUM = 65;
    private static final int INGREDIENT_GRENADINE = 10;
    private static final int INGREDIENT_LIME_JUICE = 10;
    private static final int INGREDIENT_GREEN_STUFF = 10;
    private static final int INGREDIENT_TONIC_WATER = 20;
    private static final int INGREDIENT_GIN = 85;
    
    public int computeCost(String drink, boolean student, int amount) {

        if (amount > 2 && (drink.equals(GT)  || drink.equals(BACARDI_SPECIAL))) {
            throw new IllegalArgumentException("Too many drinks, max 2.");
        }
        int price;
        if (drink.equals(ONE_BEER)) {
            price = 74;
        }
        else if (drink.equals(ONE_CIDER)) {
            price = 103;
        }
        else if (drink.equals(A_PROPER_CIDER)) price = 110;
        else if (drink.equals(GT)) {
            price = INGREDIENT_GIN + INGREDIENT_TONIC_WATER + INGREDIENT_GREEN_STUFF;
        }
        else if (drink.equals(BACARDI_SPECIAL)) {
            price = INGREDIENT_GIN/2 + INGREDIENT_RUM + INGREDIENT_GRENADINE + INGREDIENT_LIME_JUICE;
        }
        else {
            throw new IllegalArgumentException("Too many drinks, max 2.");
        }
        if (student && (drink.equals(ONE_CIDER) || drink.equals(ONE_BEER) || drink.equals(A_PROPER_CIDER))) {
            price = price - price/10;
        }
        return price*amount;
    }
}
