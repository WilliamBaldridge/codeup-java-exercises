package grades;

import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap <String, Student> students = new HashMap<>();

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


        students.put("yasinmogultay", s1);
        students.put("padillacarlos", s2);
        students.put("baldridgewilliam", s3);


        students.forEach(
                (key, value) ->
                        System.out.printf("Github username: %s%nName: %s%nGrade average: %s %n%n", key, value.getName(), value.getGradeAverage()));




    }





}
