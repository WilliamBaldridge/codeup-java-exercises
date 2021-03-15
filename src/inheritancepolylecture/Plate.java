package inheritancepolylecture;

public class Plate extends KitchenTool{

    public Plate(boolean isDirty) {
        super();
        System.out.println(isDirty + " this kitchen tool is dirty");
    }

    public void wash() {
        System.out.println("Washing plate...");
    }


}
