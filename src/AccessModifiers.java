public class AccessModifiers
{
    public static void main(String[] args)
    {
        HelloWorld HelloWorldObject = new HelloWorld();
        HelloWorldObject.nonStaticTest();
        HelloWorldObject.protectedAccess();
        HelloWorldObject.defaultAccess();
    }
}
