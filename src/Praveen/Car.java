package Praveen;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Bike b =new Bike();             // Bike class is used here also
        int w = 2;
        long m = 13000;
//        b.noOfWheels = w;
//        b.mileage = m;
        b.move();
        b.display(w,m);
        b.speed();                  //  we can't use method inside bike class here like speed for that we need multilevel inheritance
        Car c = new Car();
        c.move();
        c.display(4,40000);
    }
}