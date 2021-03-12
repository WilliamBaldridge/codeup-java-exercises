package oopLecture;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish(String name, int cost, boolean recommend) {
        this.costInCents = cost;
        this.nameOfDish = name;
        this.wouldRecommend = recommend;
    }


    public void printSummary() {
        System.out.printf("Cost: %d%n Name: %s%n Recommend: %b", this.costInCents, this.nameOfDish, this.wouldRecommend);
    }

    public int getCost() {
        return costInCents;
    }

    public void updateCost(int cost) {
        this.costInCents = cost;
    }

    public String getName() {
        return nameOfDish;
    }

    public void updateName(String name) {
        this.nameOfDish = name;
    }

    public boolean getRecommend() {
        return wouldRecommend;
    }

    public void updateRecommend(boolean recommend) {
        this.wouldRecommend = recommend;
    }



}
