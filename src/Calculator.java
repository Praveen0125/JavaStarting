public class Calculator
{
    public float sum(float a,float b)
    {
        return a+b;
    }
    public float sum(float a,float b,float c)
    {
        return a+b+c;
    }
    public float diff(float x,float y)
    {
        return x-y;
    }
    public float mul(float a,float b)
    {
        return a*b;
    }
    public float div(float x,float y)
    {
        if (y==0)
        {
            System.out.print("Can't divide by zero! ");
        }
        return x/y;
    }
    public static void main(String[] args)
    {
        int p = 10;
        int q = 3;
        int r = 5;
        Calculator obj = new Calculator();
        float res = obj.sum(p,q);                   // two parameters
        System.out.println("Sum is: "+res);
        float res1 = obj.sum(p,q,r);                // three parameters (method overloading)
        System.out.println("Sum is: "+res1);
        float res2 = obj.diff(p,q);                 // call by value
        System.out.println("Difference is: "+res2);
        float res3 = obj.mul(p,q);
        System.out.println("Product is: "+res3);
        float res4 = obj.div(p,q);
        System.out.println("Quotient is: "+res4);
    }
}
