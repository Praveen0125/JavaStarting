public class ClassInJava
{
    static class vehicleIn
    {
        public void car()
        {
            System.out.println("Car is called");
        }
        public void bus()
        {
            System.out.println("Bus is called");
        }
    }
    public static void main(String[] args)
    {
        vehicleIn obj = new vehicleIn();
        obj.bus();
        obj.car();
    }
}
