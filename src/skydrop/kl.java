// 1
class Vehicle {
    void drive() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.display();
    }
}

// 2
class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    int getSalary() {
        return 30000;
    }
}

class HRManager extends Employee {
    void work() {
        System.out.println("HR Manager is working");
    }

    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
    }
}

// 3
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 4, b = 5;
        System.out.println("Rectangle Area: " + (l * b));
    }
}

class Square extends Rectangle {
    void area() {
        int s = 6;
        System.out.println("Square Area: " + (s * s));
    }
}

class Circle extends Square {
    void area() {
        double r = 3.0;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();  // It will run Circle's area method
    }
}
