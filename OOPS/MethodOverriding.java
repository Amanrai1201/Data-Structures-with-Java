public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        Dear d1 = new Dear();
        d1.eat();
        d1.breath();
    }
}

class Animal {
    void breath() {
        System.out.println("Breath oxygen");
    }

    void eat() {
        System.out.println("eats everything");
    }
}

class Dear extends Animal {
    void eat() {
        System.out.println("eats grass only");
    }
}