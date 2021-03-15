package inheritancepolylecture;

public class Ingredient {

    public String brandName;
    protected int calories;

    public Ingredient(String brandName) {
        this.brandName = brandName;
    }

    public void throwAway() {
        System.out.println("Throwing away ingredient..");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }




}
