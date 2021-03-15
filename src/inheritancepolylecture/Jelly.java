package inheritancepolylecture;

public class Jelly extends Ingredient{

    public boolean isSugarFree;

    public Jelly(String brandName, boolean isSugarFree) {
        super(brandName);
        this.isSugarFree = isSugarFree;
    }

    public void throwAway() {
        System.out.println("Throwing away jelly..");
    }

    public int getCalories() {
        return this.calories;
    }

    public boolean isSugarFree() {
        return isSugarFree;
    }

    public void setSugarFree(boolean sugarFree) {
        isSugarFree = sugarFree;
    }




}
