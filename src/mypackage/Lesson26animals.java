package mypackage;

public class Lesson26animals {

    String name;
    String color;

    public void walk(String place){
        System.out.println("We are walking here:" + place);
    }

    public void sleep() {
        System.out.println("Zzz Zzz Zzz");
        System.out.println("I'm sleeping!");

    }

    private int getterint = 100;

    public int getGetterint() {
        return getterint;
    }

    public void setGetterint(int getterint) {
        this.getterint = getterint;
    }
}
