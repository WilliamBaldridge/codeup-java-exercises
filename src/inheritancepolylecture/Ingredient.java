package inheritancepolylecture;

public class Ingredient {

    public String brandName;
    public boolean isSugarFree;

    public Ingredient() {

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




}
