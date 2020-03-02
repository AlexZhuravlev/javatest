// Исключения

package mypackage;

public class Lesson24 {
    public static void main(String[] args) {

        devide(10,4);
        devide(10,0);
        devide2(10,1);


        try {
            devide2(10,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


    }

    public static void devide (int a, int b){
        try {
            System.out.println("Result is : " + a/b);
        } catch (ArithmeticException e){
            System.out.println("Err");
        } finally {
            System.out.println("Finish!");
        }

    }

    public static void devide2 (int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Cannot devide by zero!");
        } else {
            System.out.println("Result is " + a/b);
        }

    }

}
