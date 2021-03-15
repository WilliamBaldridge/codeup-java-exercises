import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class ArraysExercises {

//    public Person[] peopleArr;

//    public Person [] peopleArr = new Person[3];


//    public static Person[] addPeople(Person[] peopleArr) {
//
//        Person[] extendedPeopleArr = Arrays.copyOf(peopleArr, peopleArr.length + 1);
//
//        for (Person person : peopleArr) {
//            person.setName("Bob");
//            extendedPeopleArr[extendedPeopleArr.length - 1] = person;
//
//        }
//
//        return extendedPeopleArr;
//        peopleArr[0] = new Person("Bob");
//        peopleArr[1] = new Person("Joe");
//        peopleArr[2] = new Person("Sue");
//        return peopleArr[0].getName(peopleArr);
//        return peopleArr;

//}


//        Arrays.fill(peopleArr, "Bob");

//        System.out.println(Arrays.toString(peopleArr));
//
//
//        for (int i = 0; i < peopleArr.length; i++) {
//        System.out.println(peopleArr.getName()); // needed [i]
//    }
//
//        for (int i = 0; i < peopleArr.length; i++) {
//        System.out.println(peopleArr[i].getName());
//    }


//    public static Person[] addPerson(Person[] peopleArr, Person person) {
//
////        int peopleArrLength = peopleArr.length +1;
//        Person[] extendedPeopleArr = Arrays.copyOf(peopleArr, peopleArr.length +1);
//
//        extendedPeopleArr[extendedPeopleArr.length - 1] = person;
//
//        return extendedPeopleArr;
//
//    }


    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] peopleArr;

        peopleArr = new Person[3];
//
//        peopleArr[0] = new Person("Bob");
//        peopleArr[1] = new Person("Joe");
//        peopleArr[2] = new Person("Sue");

//        Arrays.fill(peopleArr, "Bob");

//        System.out.println(Arrays.toString(peopleArr));


//        for (int i = 0; i < peopleArr.length; i++) {
//        System.out.println(peopleArr.getName()); // needed [i]
//    }

//        for (int i = 0; i < peopleArr.length; i++) {
//            System.out.println(peopleArr[i].getName());
//        }
//
//        peopleArr = addPerson(peopleArr, new Person("Bob"));
//
//        for (Person person: peopleArr) {
//
//            System.out.println("Using enhanced for loop: " + person.getName());
//
//        }

//        System.out.println(peopleArr);
//        System.out.println(Arrays.toString(addPeople(peopleArr)));


        int numberOfSs = countLetters("MissiSSippi", 's');
        System.out.println(numberOfSs); // should return 4

    }

    public static int countLetters(String input, char character) {
        int charCount = 0;
//        charCount = character;

        for (int i = 0; i < input.length(); i += 1) {
            if (Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(character)) {
                charCount++;
            }
        }
        return charCount;
    }


}
