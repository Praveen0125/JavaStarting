package Praveen;

public class ChildClass extends MethodOverriding {
        String s ="Child class invoked.";
    void show(){
        System.out.println(s);
        System.out.println(super.s);        // calling string s from parent class due to super

    }

    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.show();
    }
}
