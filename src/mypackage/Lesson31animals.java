package mypackage;

public abstract class Lesson31animals {  // Абстрактые классы. Нельзя создавать экзепляры абстрактного класса, от них может только наследоваться другие классы.
                                            // Наследники обязаны описать все абстрактные методы данного класса


    public abstract void saySmth();
    public abstract void eat();

    public void walk(String place){               // могуть присутствовать обычные методы которые при наследовании описывать не нужно
        System.out.println("walk here: " + place);
    }

}
