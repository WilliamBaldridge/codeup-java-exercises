package animals.canine;

import animals.Animal;
import animals.Describable;

public abstract class Canine extends Animal {


    public Canine(String size, String commonName, String subSpecies, String sound) {
        super(size, commonName, subSpecies, sound);
    }

    public void printEmote() {

    }

    public void makeSound() {
        System.out.println(sound + "\n");
    }

    public abstract void printDelimiter();

    public void printSubSpecies() {
        System.out.printf("Sub-species: %s\n", this.subSpecies);
    }

    public void printCommonName() {
        System.out.printf("Common name: %s\n", this.commonName);
    }

    public void printSize() {
        System.out.printf("Size: %s\n", this.size);
    }

    public void printDetails(){
        makeSound();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printSize();
        printDelimiter();
    }



}
