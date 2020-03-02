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


        System.out.println(cat.getGetterint());

        cat.setGetterint(1);

        System.out.println(cat.getGetterint());






// инкапсуляция и модификаторы доступа
        // public - доступ ко всем методам класса отовсюду
        // protected - доступ только у наследников, даже в другом пакете, главное должна быть родительская связь
        // private - доступ ограничен
        // без указания модификатора (package),(exmpl. int a = "ss") - доступ внутри пакета (mypackcge(папка));
        //
        // такие же модификаторы указываются для методов класса (private void ...)
        // в идеале чаще использовать модификатор protected, для доступа к переменным только для наследников класса
        //





    }
}
