package inheritancepolylecture;

public class PeanutButter extends Ingredient {

    private String texture;

    public PeanutButter(String brandName, String texture) {
        super(brandName);
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public void throwAway() {
        System.out.println("Throwing away peanut butter..");
    }

}
