public class Person {

    private String name;


//    public Person(String name) {
//        this.name = name;
//    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void sayHello() {

        System.out.println(this.name + " says hello.");

    }


    public static void main(String[] args) {

        Person p1 = new Person("William");
        p1.sayHello();
//        p1.setName("Bob");
//        p1.sayHello();
        System.out.println(p1.getName());

        Person p2 = new Person("William");
        System.out.println(p1.getName().equals(p2.getName()));
        System.out.println(p1 == p2);

        Person p3 = p2;
        System.out.println(p3 == p2);

    }



}
