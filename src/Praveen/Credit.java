package Praveen;

public class Credit implements MoneyInf {

    @Override
    public void operations() {
        System.out.println("Amount Credited");
    }

    public static void main(String[] args) {
        MoneyInf a = new Debit();
        a.operations();
        MoneyInf b = new Credit();
        b.operations();
    }
}
