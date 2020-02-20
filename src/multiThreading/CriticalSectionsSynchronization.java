package multiThreading;

public class CriticalSectionsSynchronization {

    public static void main(String[] args) throws InterruptedException {

        InventoryCounter inventoryCounter = new InventoryCounter();
        DecrementingThread threadDecr = new DecrementingThread(inventoryCounter);
        IncrementingThread threadIncr = new IncrementingThread(inventoryCounter);

        threadDecr.start();
        threadIncr.start();

        threadDecr.join();
        threadIncr.join();

        System.out.println("The items count is " + inventoryCounter.getItemsCount());
    }

    public static class DecrementingThread extends Thread {
        private InventoryCounter inventoryCounter;

        public DecrementingThread(InventoryCounter inventoryCounter) {
            this.inventoryCounter = inventoryCounter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                this.inventoryCounter.decrement();
            }
        }
    }

    public static class IncrementingThread extends Thread {
        private InventoryCounter inventoryCounter;

        public IncrementingThread(InventoryCounter inventoryCounter) {
            this.inventoryCounter = inventoryCounter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                this.inventoryCounter.increment();
            }
        }
    }

    public static class InventoryCounter {
        public int items = 0;
        Object lock1 = new Object();

        public void increment() {
            synchronized (lock1) {
                items++;
            }
        }

        public  void decrement() {
            synchronized (lock1) {
                items--;
            }
        }

        public  int getItemsCount() {
            synchronized (lock1) {
                return items;
            }
        }
    }
}
