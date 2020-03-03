package mypackage;

public class Lesson31 {
    public static void main(String[] args) {

        Lesson31cat cat = new Lesson31cat();
        Lesson31dog dog = new Lesson31dog();


        dog.walk("park");
        dog.saySmth();
        dog.eat();
        dog.sit();
        System.out.println();

        cat.walk("backyard");
        cat.saySmth();
        cat.eat();



    }
}
