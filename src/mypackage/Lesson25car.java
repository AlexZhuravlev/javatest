package mypackage;

public class Lesson25car {

    //Lesson26 конструктор класса. Это метод с названием класса, в котором указываются ОБЯЗАТЕЛЬНЫЕ для заполнения параметры при создании класса, или что то что должно выполнится

    public Lesson25car(){  // конструткор для создания экземпляров класса без указания параметровю. Без него тако йэкземпляр создать нельзя!
        System.out.println("New car created with default color!");
    }

    public Lesson25car(String color){ // отдельный конструктор для создания экзепляров класса с параметром color. Если в конструкторе указано несколько параметров - все они обязательны при создании
        System.out.println("New Car Created!");
        this.color = color;
    }

    public Lesson25car(int length, String color, int height, int width){
        System.out.println("New car created with 3 params!");
        this.color = color;
        this. height = height;
        this.width = width;
        this.length = length;
    }

    // модификаторы доступа

    static int asd = 12; // модификатор static - методы доступны извне, без надобности создавать обьект класса. Эту переменную можно изменить извне
    static void method(){  // такая же фигня с методами класса (функциями)
        System.out.println("static method!");
    }

    private static int prvt = 44; // не виден вне файла

    final static int fin = 333; // переменная или функция видна извне, но не изменяема






    int height;  // методы класса созданы без модификатора - не досутпны для изменения извне
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 240;

    public void addWeight(int weight){
        this.weight += weight;
        System.out.println("New weight is: " + this.weight);
    }

    public void drive(int speed){
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("We are driving at: " + speed);
        } else {
            System.out.println("Cannot drive, max weight is more than " + maxWeight + ", its actualy: " + weight);
        }
    }
}
