package Praveen;

interface Run {
    void run();
}
interface Walk{
    void walk();
}

class Humans extends Animals{
}
public class MultipleInheritance{
    public static void main(String[] args) {
        Run r = new Humans();
        Walk w = new Humans();
        r.run();
        w.walk();
    }
}