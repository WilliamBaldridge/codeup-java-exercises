package inheritancepolylecture;

public class Knife extends KitchenTool {

    public boolean isSharp = true;

    public Knife() {
        super();
        this.isDirty = true;
        this.isSharp = true;
        System.out.println(isDirty + " this kitchen tool is dirty");
    }


    public void wash() {
        System.out.println("Washing knife...");
    }

}
