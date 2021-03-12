import java.util.Arrays;

public class ArraysExercises {

//    Person[] peopleArr;
//
//    peopleArr = new Person[3];
//
//    peopleArr[0] = new Person("Bob");
//    peopleArr[1] = new Person("Joe");
//    peopleArr[2] = new Person("Sue");
//
////        Arrays.fill(peopleArr, "Bob");
//
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


    public static Person[] addPerson(Person[] peopleArr, Person person) {

//        int peopleArrLength = peopleArr.length +1;
        Person[] extendedPeopleArr = Arrays.copyOf(peopleArr, peopleArr.length +1);

        extendedPeopleArr[extendedPeopleArr.length - 1] = person;

        return extendedPeopleArr;

    }



    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] peopleArr;

        peopleArr = new Person[3];

        peopleArr[0] = new Person("Bob");
        peopleArr[1] = new Person("Joe");
        peopleArr[2] = new Person("Sue");

//        Arrays.fill(peopleArr, "Bob");

        System.out.println(Arrays.toString(peopleArr));


//        for (int i = 0; i < peopleArr.length; i++) {
//        System.out.println(peopleArr.getName()); // needed [i]
//    }

        for (int i = 0; i < peopleArr.length; i++) {
            System.out.println(peopleArr[i].getName());
        }

        peopleArr = addPerson(peopleArr, new Person("Bob"));

        for (Person person: peopleArr) {

            System.out.println("Using enhanced for loop: " + person.getName());

        }


    }


}
