import bank.ATM;
import customer.Customer;

public class Main {
    static boolean success;

    public static void main(String[] args) {
        Logic logic = new Logic();
        Thread thread1 = new Thread(logic);
        Thread thread2 = new Thread(logic);
        Thread thread3 = new Thread(logic);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}




