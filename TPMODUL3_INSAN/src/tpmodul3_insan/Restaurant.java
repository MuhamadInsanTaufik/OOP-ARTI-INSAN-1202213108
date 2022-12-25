package tpmodul3_insan;

public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;


    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodNumber;
    }

    public void makeFood(){
        synchronized(Restaurant.lock){
            if (this.waitingForPickup){
                try{
                    System.out.println("Restoran: Menunggu makanan untuk mengantar makanan ");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Restoran: Membuat makanan nomor " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restoran: Memberitahu pelayan untuk mengambil makanan\n");
        }
    }
    public static Object getLock() {
        return lock;
    }

    
}
