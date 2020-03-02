package mypackage;

import javax.swing.plaf.metal.MetalTabbedPaneUI;

public class Lesson25 {

    public static void main(String[] args) {

        Lesson25car car1 = new Lesson25car();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        System.out.println("Add some weight!");

        car1.addWeight(700);
        car1.drive(100);


        Lesson25car car2 = new Lesson25car();
        car2.color = "White";
        Lesson25car car3 = new Lesson25car();
        car3.color = "Red";

        car2.drive(100);
        car3.drive(150);

        System.out.println(car2.color);


        //Lesson26, конструктор класса

        Lesson25car car4 = new Lesson25car("redda");
        System.out.println(car4.color);

        Lesson25car car5 = new Lesson25car("Blue");
        System.out.println(car5.color);

        Lesson25car car6 = new Lesson25car(12,"blue",33, 44);
        System.out.println(car6.length);
        System.out.println(car6.color);
        System.out.println(car6.height);
        System.out.println(car6.width);

        //OR

        System.out.println(car6.length + " " + car6.color + " " + car6.height + " " + car6.width);


        // Lesson 27 модификаторы досутпа, Static & Final.

        System.out.println(Lesson25car.asd);

        System.out.println(car2.asd);

        Lesson25car.asd = 10;

        System.out.println(car2.asd);

        Lesson25car.method();

        System.out.println(Lesson25car.fin);





    }
}
