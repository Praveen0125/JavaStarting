package Praveen;

interface Run {
    void run();
    static int a= 5;
    default void say(){
        System.out.println("Welcome");
    }
    static void speak(){
        System.out.println("The number is: "+a);
    }
}
interface Walk{
    void walk();
}

class Humans extends Animals{
}
public class MultipleInheritance{
    public static void main(String[] args) {
        Run.speak();
        Run r = new Humans();
        Walk w = new Humans();
        r.say();
        r.run();
        w.walk();
    }
}