package mypackage; //перегрузка методов - копирование методов с разным типов или количеством входящих данных.

public class Lesson23 {

    public static void main(String[] args) {

        int result = getSum(1,2);
        System.out.println(result);

        result = getSum(1,2,3);
        System.out.println(result);

        System.out.println();

        sayHello("Alex");
        sayHello("ALEX", "Zhu");
        sayHello();


        int[] array = {1, 33, 33, 12, 33};
        int sum = getSum(array, "Nick");
        System.out.println(sum);


    }

    static int getSum(int x, int y){
        int sum;
        sum = x+y;
        return sum;
    }

    static int getSum(int x, int y, int z){  // same func
        int sum;
        sum = x+y+z;
        return sum;
    }

    static void sayHello(String name){
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("run");
        System.out.println("away!");

    }

    static void sayHello(String name, String surname){
        System.out.println();
        System.out.println("Hello " + name + surname + "!");
        System.out.println("run");
        System.out.println("away!");

    }

    static void sayHello(){
        System.out.println("Hi there!");
    }

    static int getSum (int[] array, String name){  //метод принимает массив и отдает сукмму элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Name: " + name);
        System.out.println("Sum: " + sum);
        return sum;

    }



}
