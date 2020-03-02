package mypackage;

public class Lesson26 {

    public static void main(String[] args) {


        Lesson26cat cat = new Lesson26cat();
        Lesson26dog dog = new Lesson26dog();

        cat.name = "Vasya";
        dog.name = "Barsik";

        cat.color = "White";
        dog.color = "Black";

        System.out.println("Cat name: " + cat.name + ", " + "Cat color: " + cat.color);
        System.out.println("Dog name: " + dog.name + ", " + "Dog color: " + dog.color);

        cat.walk("Backyard");
        dog.walk("Park");

        dog.sleep();
        cat.sleep();

        cat.feed("Milk");

        dog.lay();
        dog.sit();







    }
}
