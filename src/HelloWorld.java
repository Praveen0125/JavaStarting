public class HelloWorld {
    void defaultAccess()                // default
    {
        System.out.println("Default access modifier used");
    }
    protected void protectedAccess()    // protected
    {
        System.out.println("Protected access modifier used");
    }
    private void privateAccess()        // private
    {
        System.out.println("Private access modifier used");
    }
    public void nonStaticTest()         // public
    {
        System.out.println("A non Static method");
    }
    public static void staticTest()     // public but static so can't be used in inheritance
    {
        System.out.println("A Static method");
    }
    public static void main(String[] args)
    {
        HelloWorld helloWorldObject = new HelloWorld(); // Creating object of class HelloWorld
        System.out.println("Hello World!");
        staticTest(); //using directly
        helloWorldObject.nonStaticTest(); // using indirectly by creating an object.
        helloWorldObject.defaultAccess();
        helloWorldObject.privateAccess();
        helloWorldObject.protectedAccess();
    }
}
