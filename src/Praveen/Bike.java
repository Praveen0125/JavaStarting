package Praveen;

public class Bike extends Vehicle {
    public void speed(){
        System.out.println("Speed of bike is: 200 km/h");
    }
    public static void main(String[] args) {
        Bike b =new Bike();
        int w = 2;
        long m = 13000;
//        b.noOfWheels = w;
//        b.mileage = m;
        b.move();
        b.display(w,m);
        b.speed();
    }
}
