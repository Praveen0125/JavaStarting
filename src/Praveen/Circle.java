package Praveen;

interface InterfaceInJava {
    float area(float r);
}
public class Circle implements InterfaceInJava{

    @Override
    public float area(float r) {
        return ((float) 22/7)*r*r;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        float ar = c.area(7);
        System.out.println("Area of circle is: "+ar);
    }
}