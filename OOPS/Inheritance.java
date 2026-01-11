public class Inheritance {
    // Inheritance is when properties and methods of base class are passed on to a
    // derived class is called inheritance.
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

// Derived class // subclass
class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("Swims in water");
    }
}