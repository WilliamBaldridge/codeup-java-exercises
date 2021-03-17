package grades;

import java.util.*;

public class Student {

    private String name;
    private List<Double> grades;


    public Student(String name, ArrayList<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add((double) grade);
    }

    public Double getGradeAverage() {
        double numOfGrades = grades.size();
        double totalGrades = grades.stream().mapToDouble(Double::doubleValue).sum();

        return totalGrades / numOfGrades;
    }


    public static void main(String[] args) {



        ArrayList myGrades;

        myGrades = new ArrayList(Arrays.asList(
                89.0,
                100.0,
                98.0,
                94.0,
                82.0,
                88.0,
                88.0,
                92.0,
                95.0
        ));

        Student myself = new Student("William", myGrades);

        System.out.println(myself.getName());
        System.out.println(myGrades.size());
        System.out.println(myself.getGradeAverage());

//        myGrades.addGrade(100);



    }


}
