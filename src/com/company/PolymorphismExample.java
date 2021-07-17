package com.company;

public class PolymorphismExample {
    public static void main(String[] args) {
        // Here the runtime polymorphism fundamental is not applied,
        // as it is of single CashPayment form
        CashPayment c = new CashPayment();
        c.pay();

        // Now the initialization is done using runtime polymorphism and
        // it can have many forms at runtime
        // Single payment "p" instance can be used to pay by cash and credit card
        Payment p = new CashPayment();
        p.pay(); // Pay by cash

        p = new CreditPayment();
        p.pay(); // Pay by creditcard
    }
}


/**
 * This represents payment interface
 */
interface Payment {
    public void pay();
}

class CashPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }
}

/**
 * Creditcard IS-A Payment type
 */
class CreditPayment implements Payment {

    // method overriding
    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }

}


class Adder {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
       // System.out.print
    }
}
//Method Overloading: changing the data type of arguments
class Adder {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
}
class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(12.3, 12.6));
    }
}



class A {}
class B extends A {}
class Demo {
    public static void main(String[] args) {
        A a = new B(); //upcasting
    }
}


class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}
class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}
class TestPolymorphism2 {
    public static void main(String args[]) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}