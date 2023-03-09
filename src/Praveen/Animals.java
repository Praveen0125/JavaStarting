package Praveen;

public class Animals implements Run, Walk {
    @Override
    public void run() {
        System.out.println("Animals run");
    }

    @Override
    public void walk() {
        System.out.println("Animals also walk");
    }
}
