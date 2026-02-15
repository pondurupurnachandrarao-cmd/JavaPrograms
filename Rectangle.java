import java.util.*;

class Rectangle {
    double length, width;

    void read() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
