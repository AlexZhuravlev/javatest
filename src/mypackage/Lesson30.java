package mypackage; // Полиморфизм. Переопределение методов класса его дочерними элементами

public class Lesson30 {

    public static void main(String[] args) {

        Lesson30animals cat = new Lesson30cat();
        Lesson30animals dog = new Lesson30dog();
        Lesson30animals fox = new Lesson30animals();

        cat.sound();
        dog.sound();
        fox.sound();

    }

}
