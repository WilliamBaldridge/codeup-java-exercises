package oopLecture;


public class DishTest {

    public static void main(String[] args) {

//        Dish dish1 = new Dish();
//        dish1.costInCents = 1495;
//        dish1.nameOfDish = "Evil Jungle Prince";
//        dish1.wouldRecommend = true;

        Dish dish1 = new Dish("Evil Jungle Prince", 1495, true);

//        dish1.printSummary();

//        System.out.println(DishTools.shoutDishName(dish1));

        System.out.println(dish1.getName());
        System.out.println(dish1.getCost());
        System.out.println(dish1.getRecommend());

    }



}
