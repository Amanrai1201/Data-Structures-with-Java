public class MethodOverloading {

    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.sum(20, 30);
        System.out.println(cal1.sum((float) 4.5, (float) 5));
        cal1.sum(4, 5, 71);

    }
}

class Calculator {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    float sum(float a, float b) {
        return a + b;
    }
}

// this is the example of method overloading