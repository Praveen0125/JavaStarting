public class ClassMissc
{
    static class Constructor {
        Constructor(int a, int b){
            int x = a+b;
            System.out.println(x);
        }
        Constructor(int p){
            this(p,5);                  // constructor chaining
        }
    }
    public static void main(String[] args){
        Constructor obj = new Constructor(8,9);
        Constructor obj2 = new Constructor(8);
    }
}
