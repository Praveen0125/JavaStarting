public class Cal
{
    static class Calc {
        Calc(){ System.out.println("Calculator is initialized."); }     // Constructor
        Calc(int x, int y){                                             // Parameterized constructor
            System.out.println("Another Calculator is initialized.");
            System.out.println("Just use of Constructor: "+(x+y)); }
        public void sum(float p, float q) { System.out.println("Sum of "+p+" and "+q+" is : "+(p+q)); }
        public void sum(float p, float q, float r)
        {
            System.out.println("Sum of "+p+", "+q+" and "+r+" is : "+(p+q+r));
        }
        public void diff(float p, float q)
        {
            System.out.println("Diff of "+p+" and "+q+" is : "+(p-q));
        }
        public void diff(float p, float q, float r) { System.out.println("Diff of "+p+", "+q+" and "+r+" is : "+(p-q-r)); }
        public void mul(float p, float q)
        {
            System.out.println("Product of "+p+" and "+q+" is : "+(p*q));
        }
        public void mul(float p, float q, float r) { System.out.println("Product of "+p+", "+q+" and "+r+" is : "+(p*q*r)); }
        public void div(float p, float q) {
            if (q==0) { System.out.print("Divide by zero condition! "); }
            System.out.println("Quotient of "+p+" and "+q+" is : "+(p/q)); }
    }
    public static void main(String[] args) {
        Calc obj = new Calc();
        Calc obj1 = new Calc(5,6);
        float x = 25.6f;
        float y = 5.2f;
        float z = 6.5f;
        float z1 = 0f;
        obj.sum(x,y);
        obj.sum(x,y,z);
        obj.diff(x,y);
        obj.diff(x,y,z);
        obj.mul(x,y);
        obj.mul(x,y,z);
        obj.div(x,y);
        obj.div(x,z1);
        obj1.sum(x,z);
    }
}
