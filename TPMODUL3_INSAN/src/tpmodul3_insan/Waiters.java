package tpmodul3_insan;

public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("===============================================");
        System.out.println("ID Kostumer: " + this.customerID);
        System.out.println("Nomor makanan: " + this.orderQty);
        System.out.println("Harga total: " + (this.orderQty * foodPrice));
        System.out.println("===============================================");
    }

    public void getFood(){
        synchronized(Restaurant.getLock()){

            System.out.println("Pelayan: Makanan siap untuk diantar");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Pelayan: Memberitahu restoran untuk membuat makanan lagi\n");

        }
    }
}
