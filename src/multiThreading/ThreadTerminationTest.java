package multiThreading;

import java.math.BigInteger;

public class ThreadTerminationTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking thread");
            }
        });

        //thread.start();
        // thread.interrupt();

        Thread thread1 = new Thread( new LongComputationTask(new BigInteger("2"), new BigInteger("2")));

        thread1.setDaemon(true);
        thread1.start();

        Thread.sleep(500);
        //thread1.interrupt();
    }

    private static class LongComputationTask implements Runnable {

        private BigInteger base;
        private BigInteger pow;

        public LongComputationTask(BigInteger base, BigInteger pow) {
            this.base = base;
            this.pow = pow;
        }

        @Override
        public void run() {
            System.out.println(base + "^" + pow + "=" + this.pow(base, pow));
        }

        private BigInteger pow (BigInteger base, BigInteger pow){
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(pow) != 0 ; i = i.add(BigInteger.ONE)){
                result = result.multiply(base);
            }
            return result;
        }
    }
}
