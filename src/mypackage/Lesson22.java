package mypackage;

public class Lesson22 {

    public static void main(String[] args) {

        int a = 13;
        int b = 15;
        int sum = getSum(a,b);
//        System.out.println(getSum(a,b));
//
//        System.out.println(sum);
//        System.out.println(getSum(1,3));
//        System.out.println(getSum(2,4));
//
//        System.out.println();
//
//        showSum(1,2,3); // works cuz of println in function(method)
//
//        System.out.println();
//
//        saySmth();
//
//        sayHello("Oleksandr");

        String name = "Lol";

//        sayHello(name);

        showSumToPerson("Vasya", 12,43,55);

        boolean result = showSumBool(1,3,4);
        System.out.println(result);



    }

    //func
    static int getSum(int x, int y){

        int sum = x + y;
        return sum;

    }

    //void - метод не возвращает тип

    static void showSum(int x, int y, int z){
        int sum = x+y+z;
        System.out.println("Sum is: "+sum);
    }

    static void saySmth(){  // метод не принимает каких либо параметров и не принимает *(или принимает)
        System.out.println("SAY");
        System.out.println("SOMETHING");
    }

    static void sayHello(String name){
        System.out.println("Hello: " + name + " !");
        System.out.println("RUN");

    }

    static void showSumToPerson(String name, int a, int b, int c){ //вложенные методы ( void)
        System.out.println("Start");
        sayHello(name);
        showSum(a,b,c);
        System.out.println("End");


    }

    static boolean showSumBool(int a, int b, int c){
        int sum = a+b+c;
        return true;

    }



}
