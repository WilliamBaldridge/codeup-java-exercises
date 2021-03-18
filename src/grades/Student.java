package grades;

import java.util.*;

public class Student {

    private String name;
    private List<Integer> grades;


    public Student(String name) {

        this.name = name;
        this.grades = new ArrayList<>();

    }

    public String getName() {

        return name;

    }

    public void addGrade(int grade) {

        grades.add(grade);

    }

    public Integer getGradeAverage() {

        int numOfGrades = grades.size();
        int totalGrades = grades.stream().mapToInt(Integer::intValue).sum();

        return totalGrades / numOfGrades;

    }

    public List<Integer> getGrades(){
        return this.grades;
    }


    public static void main(String[] args) {

        Student myself = new Student("William");
        myself.addGrade(70);
        myself.addGrade(90);
        myself.addGrade(93);
//        Arrays.asList();
        System.out.println(myself.getGradeAverage());

        Student yasin = new Student("Yasin");
        yasin.addGrade(90);
        yasin.addGrade(98);
        yasin.addGrade(98);

        System.out.println(yasin.getName());
//        System.out.println(yasin.getGradeAverage());

        yasin.addGrade(100);
        System.out.println(yasin.grades);
        System.out.println(yasin.getGradeAverage());



    }


}
