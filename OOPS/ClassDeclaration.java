public class ClassDeclaration {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Constructor for creating objects of pen class, the actual memory allocation
                            // of class happens here
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen { // declaring class along with it's attributes and functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void CalculatePercentage(int Math, int Physics, int bio) {
        percentage = (Math + Physics + bio) / 3;
    }
}
