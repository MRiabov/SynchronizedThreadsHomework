import bank.ATM;
import customer.Customer;

public class Logic implements Runnable{

    private final ATM atm = new ATM();
    @Override
    public void run() {
        boolean success=false;
        do {
            Customer customer=new Customer();
            try {
                success=atm.cashOut(customer.request());
                customer.reaction(success);
            } catch (InterruptedException ignored){}
        } while (success);
    }
}

