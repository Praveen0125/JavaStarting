package Praveen;

interface MoneyInf {
    void operations();
}

public class Debit implements MoneyInf{

    @Override
    public void operations() {
        System.out.println("Money Debited");
    }
}

