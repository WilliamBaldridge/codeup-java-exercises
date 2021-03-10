package oopLecture;

public class DishTools {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;


    public void printSummary() {
        System.out.printf("Cost: %d \n Name: %s \n Recommend: %b", costInCents, nameOfDish, wouldRecommend);
    }

    public static final int AVG_COST_DISH_IN_CENTS = 1300;

    public String shoutDishName() {

        return String.format("%S", nameOfDish);
    }

//    public static String analyzeDishCost() {
//
//    }
//
//    public void flipRecommendation() {
//        if ( == true) {
//
//        }
//    }


}
