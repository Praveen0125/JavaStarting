package Praveen;

public class Vehicle {
    int noOfWheels;
    long mileage;
    public void move(){
        System.out.println("Vehicle's move.");
    }
    public void display(int x,long y){
        System.out.println("It has "+x+" wheels.");
        System.out.println("It's mileage is: "+y);
    }
}
