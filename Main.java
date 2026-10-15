interface Shape {
    void area();
}

class Rectangle implements Shape {
    int l, b;
    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    public void area() {
        System.out.println("Rectangle Area = " + (l * b));
    }
}

class Triangle implements Shape {
    int base, h;
    Triangle(int base, int h) {
        this.base = base;
        this.h = h;
    }
    public void area() {
        System.out.println("Triangle Area = " + (0.5 * base * h));
    }
}

public class Main {
    public static void main(String[] args) {
        new Rectangle(15, 5).area();
        new Triangle(8, 7).area();
    }
}