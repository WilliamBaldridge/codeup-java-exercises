package oopLecture;

class Student {

    // ======================== slide 8 (constructors)

//        public String name;
//        public String cohort;
//
//        public Student(String studentName) {
//            name = studentName;
//            cohort = "Unassigned";
//        }
//
//        public Student(String studentName, String assignedCohort) {
//            name = studentName;
//            cohort = assignedCohort;
//        }
//
//    public static void main(String[] args) {
//        Student s1 = new Student("Justin", "Lassen");
////        s1.name = "Justin";
////        s1.cohort = "Lassen";
//        Student s2 = new Student("William", "Luna");
//        Student s3 = new Student("Sophie", "Olympic");
//
//        System.out.println(s1);
//
//    }


    // ======================== slide 9 (this keyword)

//        public String name;
//        public String cohort;
//
//        public Student(String name) {
//            this(name, "Unassigned");
//        }
//
//        public Student(String name, String cohort) {
//            this.name = name;
//            this.cohort = cohort;
//        }
//
//        public String sayHello() {
//            return "Hello from " + this.name + "!";
//        }
//
//    public static void main(String[] args) {
//        Student s1 = new Student("Justin", "Lassen");
////        s1.name = "Justin";
////        s1.cohort = "Lassen";
//        Student s2 = new Student("William", "Luna");
//        Student s3 = new Student("Sophie");
//
//        System.out.println(s1);
//
//    }


    // ======================== slide 10 (visibility)

        public String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public double shareGrade() {
            return grade;
        }



}

