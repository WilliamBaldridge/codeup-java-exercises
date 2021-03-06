import java.util.*;

public class WarmUp {

    /* TODO: create a static method, secondListIsOneMore, that returns a boolean based on two passed
        lists of integers. If each integer in the second list is one more than the integer at the same
        index in the first list, the method will return true and false otherwise. Assume both lists are
        the same length.

        Examples:
        ... 1, 2, 3 and 2, 3, 4 returns true
        ... 1, 3, 6 and 2, 4, 7 returns true
        ... -5, 10, -200 and -4, 11, -199 returns true
        ... 1, 2, 3 and 2, 3, 5 returns false

     */

//    public static Boolean secondListIsOneMore(List <Integer> arr1, List <Integer> arr2) {
//        mismatch(arr1, arr2);
//        return
//
//    }

//    public static boolean secondListIsOneMore(List<Integer> lOne, List<Integer> lTwo) {
//        for (int i = 0; i < lOne.size(); i += 1) {
//            if (lOne.get(i) + 1 != lTwo.get(i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> lOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        List<Integer> lTwo = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
//        List<Integer> lThree = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
//        System.out.println(secondListIsOneMore(lOne, lTwo)); // should return true
//        System.out.println(secondListIsOneMore(lOne, lThree)); // should return false
//        System.out.println(secondListIsOneMore(lTwo, lThree)); // should return true
//    }



   /* TODO: In Java exercises, create a class, JavaIIIWarmUp, and include the following. You will also need to create a main method to test it. Create a static method, sameFirstAndLast, that takes in a string and returns true if the first and last character match (not case sensitive).
Examples:
  Input  - “Bob”
  Output - true
  Input  - “Steve”
  Output - false
  Input  - “refrigerator”
  Output - true
  Input  - “q2kdj3vq”
  Output - true
    */

    static boolean sameFirstAndLast (String inputString) {

        char firstChar = Character.toLowerCase(inputString.charAt(0));
        char lastChar = Character.toLowerCase(inputString.charAt(inputString.length() - 1));

        return firstChar == lastChar;

    }

    public static void main(String[] args) {
        System.out.println(sameFirstAndLast("Bob"));
        System.out.println(sameFirstAndLast("steve"));
        System.out.println(sameFirstAndLast("refrigerator"));
        System.out.println(sameFirstAndLast("q2kdj3vq"));
    }


}

