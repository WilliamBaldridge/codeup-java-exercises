package oopLecture;

public class Person {

//        // SLIDE 3
//        public String firstName;
//        public String lastName = "Smith"; // can set default values
//        public int age;


        // methods are used for more functionality, this "toString()" is super common to be able to display the object values altogether. IJ has built in ones with cntrl + return
//        @Override
//        public String toString() {
//                return "Person{" +
//                        "firstName='" + firstName + '\'' +
//                        ", lastName='" + lastName + '\'' +
//                        ", age=" + age +
//                        '}';
//        }


        // SLIDE 4

        // instance variables
//        public String firstName;
//        public String lastName;
//
//        // instance method (leaving "static" off)
//        public String sayHello() {
//                return lastName + ", " + firstName + " says hi!";
//        }

//        public void fallAsleep() {
//                isAwake = false;
//        }
//
//        public void wakeUp() {
//                isAwake = true;
//        }


    // SLIDE 7
        public static long worldPopulation = 7_500_000_000L; // class property
        public String name;                                  // instance property

//        public static void main(String[] args) {
//
//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
//
//
//                Person theBestDrummerAlive = new Person();
//                theBestDrummerAlive.name = "Neil Peart";
//                Person.worldPopulation += 1; // accessing a static property
//                // this also works, but is usually not a good idea
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//                // DONT DO THIS, it will not compile
////                 System.out.println(Person.name);
//        }

}
