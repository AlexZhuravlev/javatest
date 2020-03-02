package mypackage;

import javax.swing.text.Element;

public class Lesson17 {
    public static void main(String[] args) {
        System.out.println("Start Program");

        for (int i = 0; i < 10; i++){
            System.out.println(i*10);
        }

        System.out.println("End Program");
        System.out.println();

        for (int i = 10; i>0 ; i--){
            System.out.println(i);
        }

        int[] array = new int[10];

        for (int i = 0; i<10; i++){
            array[i] = i*2;
        }

        for (int i = 0; i<10; i++){
            System.out.println("Element with index " + i + " is: " + array[i]);
        }

        for (int element : array){
            System.out.println(element);
        }

        //FOR EACH

        String[] seasons  = new String[] {"Winter", "Spring", "Summer", "Autumn"};

        for (String i : seasons){
            System.out.println(i);
        }

        //WHILE

        int i = 0;
        boolean bool = true;

        while (bool){
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool = false;
        }

        System.out.println("DO WHILE");

        i = 0;

        do {
            System.out.println("Do: " + i);
            i++;
        } while(i<5);

    }
}
