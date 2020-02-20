package multiThreading;

public class DataRaceTest {

    public static void main(String[] args) {
        SharedClass sharedClass = new SharedClass();

        Thread thread1 = new Thread(() -> {
            for (int i = 0 ; i < 1_000_000; i++)  {
                sharedClass.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0 ; i < 1_000_000 ; i++)  {
                sharedClass.checkForDataRace();
            }
        });
        thread1.start();
        thread2.start();
    }

    public static class SharedClass {

        private volatile int x;
        private volatile int y;

        public SharedClass() {
            this.x = 0;
            this.y = 0;
        }

        public void increment() {
            x++;
            y++;
        }

        public void checkForDataRace() {
            if (y > x) {
                System.out.println(" y > x - Data Race is detected");
            }
        }
    }
}
