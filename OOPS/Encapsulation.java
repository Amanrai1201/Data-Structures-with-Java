public class Encapsulation {
    // Encapsulation is defined as the wrapping up of data & methods under a single
    // unit. It also implements data hiding.

    public static void main(String[] args) {
        Student s1 = new Student("aman");
        System.out.println(s1.name);
    }

}

class Student {
    String name;
    int roll;

    Student(String name) { // constructor
        // System.out.println();
        this.name = name;
    }
}

// java apna khud ka constructor tabhi initialise karta hai agar aap khud se
// apnna constructor na banao toh!!

// Constructor Overloading is the phenomenon in which when we create an object
// and constructor accoridng to their paramter chooses which to excetue is
// called construtor ovverloading!!
