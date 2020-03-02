package mypackage;

import java.sql.Struct;

public class TestClass {
    public static void main(String[] args) {
//        byte a = 5;
//        short b = 129;
//        int c;
//        c = 2147483641;
//        long d = 124234242344323L;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//
//        double double1 = 123.123;
//        System.out.println("double =  " + double1);
//        float float1 = 123.33f;
//        System.out.println(float1);
//
//        boolean bool1 = true;
//        boolean bool2 = false;
//        System.out.println(bool1);
//        System.out.println(bool2);
//
//        boolean bool3 = 1+2>0;
//        boolean bool4 = 1+2>5;
//
//        System.out.println(bool3);
//        System.out.println(bool4);
//
//        String str = "stringa";
//        System.out.println(str);
//
//        String str2 = "stringa2";
//        String str3 = str + " " + str2;
//        System.out.println(str3);
//
//        char char1 = 'w';
//        System.out.println(char1);
//
//
//
//        String[] name = new String[3];
//        int[] arr = new int[10];
//
//        name[0] = "1st";
//        name[1] = "2nd";
//        name[2] = "3rd";
//
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//
//        arr[3] = 15;
//        arr[3] = 10;
//        System.out.println(arr[3]);
//
//        int[] array = {1, 34, 55, 44,555,551,555};
//
//        for (int i=0; i<7; i++){
//            System.out.println(array[i]);
//        }
//
//        int[] array2 = new int[15];
//
//        for(int j=0; j<15; j++){
//            array2[j] = j*10;
//            System.out.println(array2[j]);
//        }
//
//        System.out.println();
//        System.out.println(array2.length);
//
//        System.out.println();
//        System.out.println(array2[array2.length-1]);
//
//
//        int a;
//        a = 10;
//        a = 11;
//        int b =3;
//        System.out.println(a);
//        System.out.println(a%b);
//
//        int a=15;
//        int b=10;
//
//        System.out.println(!(false));
//
//        int i = 0;
//        i--;
//        i++;
//        System.out.println(i);

//        String s = "some string";
//        String s2 = "SOME string i";
//        System.out.println(s.equals("some string"));
//        System.out.println(s.equals("string"));
//        System.out.println(s.equals(s2));
//        System.out.println(s.equalsIgnoreCase(s2));
//
//        System.out.println(s2);
//        System.out.println(s2.toLowerCase());
//        System.out.println(s2.toUpperCase());
//
//        System.out.println();
//        System.out.println(s.charAt(1));
//        System.out.println(s2.indexOf("i"));
//
//        System.out.println(s2.contains("SOME"));
//
//        System.out.println(s2.length());
//
//        System.out.println();
//        System.out.println(s2.startsWith("SOME"));
//        System.out.println(s2.endsWith("i"));
//
//        System.out.println();
//        s = "Hello,there";
//        System.out.println();
//        String[] array = s.split(",");
//        System.out.println(array[0] + "!" + array[1] + "!");
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//
//        String str = "My name is %s! I'm %d years old";
//        int age = 30;
//        String name = "Aleksandr";
//
//        System.out.println(String.format(str, name, age));
//        System.out.println(String.format(str, "Vasya", 19));
//
//        System.out.println();
//
//        String age2 = "35";
//        int a = Integer.parseInt(age2);
//        System.out.println(a*3);
//        System.out.println();
//
//
//        String str3 = "Hello, There!";
//        System.out.println(str3.substring(1,5));
//        System.out.println(str3.substring(4, str3.length() -2));

        String s1 = "Hello";
        String s2 = "There";
        String s3 = "!";
        String res;

        res = s1+s2+s3;
        System.out.println(res);

        res = s1.concat(s2).concat(s3);
        System.out.println(res);




    }
}
