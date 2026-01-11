public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("aman");
        System.out.println(s1.name);
        s1.add = "barlai";
        s1.password = 123;

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        s1.name = "beti";
        System.out.println(s2.name);
    }

    static class Student {
        String name;
        int rollNumber;
        String add;

        private int password;

        Student(String name) { // parameterised constructor
            this.name = name;
            System.out.println("Constructor is called");
        }

        Student() {
            System.out.println("ab mai call hua hu , non-parameterised constructor");
        }

        Student(Student s1) { // copy constructor
            this.name = s1.name;
            this.rollNumber = s1.rollNumber;
            this.add = s1.add;
            this.password = s1.password;
        }

    }

}