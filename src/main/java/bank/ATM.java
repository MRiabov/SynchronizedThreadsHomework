package bank;

public class ATM {
    private static int balance=15;
    public boolean cashOut(int request){
        if (request<=balance) {
            balance-=request;
            System.out.println("The customer has received " + request+"$.");
            System.out.println("There are " +balance+"$ left");
            return true;
        }
        else {
            System.out.println("There isn't enough money in the ATM.");
            return false;
        }
    }
}
