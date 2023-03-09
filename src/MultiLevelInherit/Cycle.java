package MultiLevelInherit;

public class Cycle extends Bike {
    void run3(){
        System.out.println("Cycle has some properties of bike");
    }

    public static void main(String[] args) {
        Cycle c =new Cycle();
        c.run3();           // both properties of bike and 2 wheeler are used here.
        c.run2();
        c.run1();
    }
}
