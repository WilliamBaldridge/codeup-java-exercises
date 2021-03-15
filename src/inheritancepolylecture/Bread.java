package inheritancepolylecture;

public class Bread extends Ingredient{

    public Bread(String brandName) {
        super(brandName);
    }

    public void throwAway() {
        System.out.println("Throwing away bread..");
    }

}
