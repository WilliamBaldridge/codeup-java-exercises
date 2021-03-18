package grades;

import movies.Movie;
import movies.MoviesArray;
import util.Input;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GradesApplication {

    public static void main(String[] args) {


        Student s1 = new Student("Yasin");
        s1.addGrade(99);
        s1.addGrade(96);
        s1.addGrade(96);
        s1.addGrade(99);

        Student s2 = new Student("Carlos");
        s2.addGrade(100);
        s2.addGrade(89);
        s2.addGrade(88);
        s2.addGrade(92);

        Student s3 = new Student("William");
        s3.addGrade(75);
        s3.addGrade(79);
        s3.addGrade(96);
        s3.addGrade(83);

        Student s4 = new Student("Emily");
        s4.addGrade(97);
        s4.addGrade(92);
        s4.addGrade(96);
        s4.addGrade(83);

        students.put("yasinmogultay", s1);
        students.put("carlospadilla", s2);
        students.put("williambaldridge", s3);
        students.put("emilyhorn", s4);


        boolean running = true;

        while (running) {
            System.out.println(returnOptionsDisplay());

            String userResponse = promptUserForChoice();
            running = executeUserChoice(userResponse);

        }

    }


    public static HashMap<String, Student> students = new HashMap<>();
    public static Input input = new Input();


    private static boolean executeUserChoice(String choice) {

        boolean continueRunning = true;

        switch (choice) {
            case "no" -> continueRunning = false;
            case "yasinmogultay" -> viewStudentByChoice();
            case "carlospadilla" -> viewStudentByChoice();
            case "williambaldridge" -> viewStudentByChoice();
            case "emilyhorn" -> viewStudentByChoice();
        }

        System.out.println("Would you like to see another student?");
        return continueRunning;
    }

    private static String returnOptionsDisplay() {

        String choices = """
                
                What student would you like info on?
                                
                yasinmogultay | padillacarlos | baldridgewilliam | emilyhorn
                """;

        return choices;
    }

    private static String promptUserForChoice() {

        Input input = new Input();

        System.out.println("Enter your choice: ");

        return input.getString().toLowerCase();

    }

    public static void viewStudentByChoice() {
        System.out.println("What student would you like info on?");
        String studentKey = input.getString();
        if (students.containsKey(studentKey)) {
            System.out.printf("Name: %s%n Github username: %s%n Average grade: %s%n All grades: %s%n%n", students.get(studentKey).getName(), studentKey, students.get(studentKey).getGradeAverage(), students.get(studentKey).getGrades());
        } else {
            System.out.printf("Sorry, no student found with the username of %s", studentKey);
        }
    }




}













