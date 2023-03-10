public class ExceptionHandling {
    public static void main(String[] args){
        int a = 20;
        int b = 0;
        try {
            if (b==0){
            throw new Exception("Divide by zero error.");           // declaring our own exception which will be printed in general exception.
            }
            System.out.println(a/b);
        }
//        catch (ArithmeticException exception){                // this only checks arithmetic exception
//            System.out.println("An arithmetic exception occurred: "+exception.getMessage());
//        }
        catch (Exception e){                        // checks all exception if not mentioned specifically. (req. when we throw execption)
            System.out.println("An exception occurred: "+e.getMessage());
        }
        finally {
            System.out.println("Execution handled, now next line of code can be executed.");
        }
        System.out.println("Product: "+(a*b));      // if exception handled then only executes.
    }
}
