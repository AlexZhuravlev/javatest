package mypackage;

public class Lesson32plane implements Lesson32transport {


    @Override
    public void go() {
        System.out.println("We are flying on a plane");
    }

    @Override
    public void stop() {
        System.out.println("We are flying slower");

    }

    public void setSpeed(int speed){
        System.out.println("Our speed is: " + speed);
    }
}
