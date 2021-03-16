package animals.feline;

public class Lynx extends Feline {

    private final boolean isEndangered;
    private final String nativeArea;

    public Lynx(String size, String commonName, String subSpecies, String sound, boolean isEndangered, String nativeArea) {
        super(size,commonName, subSpecies, sound);
        this.isEndangered = isEndangered;
        this.nativeArea = nativeArea;
    }

    public void printEmote() {
        System.out.println("*Stalks rabbit*");
    }

    public void makeSound() {
        System.out.println(sound + "\n");
    }

    public void printDelimiter(){
        System.out.println("****************************");
    }

    public void printEndangeredStatus(){
        System.out.printf("Endangered: %s\n", getEndangeredStatus());
    }

    public void printNativeArea(){
        System.out.printf("Native Area: %s\n\n", this.nativeArea);
    }

    public void printDetails(){
        makeSound();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printNativeArea();
        printSize();
        printEndangeredStatus();
        printDelimiter();
    }

    private String getEndangeredStatus(){

        if (isEndangered){
            return "No";
        } else {
            return "Yes";
        }
    }

}
