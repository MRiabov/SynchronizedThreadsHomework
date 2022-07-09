package customer;

public class Customer {
    private final int request;
    private final String name;
    private static int index = 0;

    public Customer() {
        this.request = (int) (Math.random() * 5+2);
        this.name = "Customer"+index++;
    }

    public int request() throws InterruptedException {
        System.out.println("New customer "+ name + " has arrived!");
        Thread.sleep(3000);
        System.out.println(name + " has requested " + request + "$");

        return request;
    }

        public void reaction(boolean fulfilled){
            if (fulfilled) System.out.println("The customer is happy.");
            else System.out.println("The customers are disappointed");
        }

}
