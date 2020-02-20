package multiThreading;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadJoiningTest {

    public static void main(String[] args) {

        List<Long> inputNumbers = Arrays.asList(12L, 23L, 340000L, 6L);
        List<FactorialThread> threads = new ArrayList<>();

        inputNumbers.stream()
                .forEach(inputNumber -> {
                    threads.add(new FactorialThread(inputNumber));
                });

        threads.forEach( thread -> {
             thread.setDaemon(true);
            thread.start();
        } );

        threads.forEach( thread -> {
            try {
                thread.join(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threads.forEach( thread -> {
            if (thread.getFinished()) {
                System.out.println("The result is " + thread.getResult());
            } else {
                System.out.println("the calculation of is still in progress");
            }
        });
    }

    private static class FactorialThread extends Thread {
        private long inputNumber;
        private BigInteger result;
        private Boolean isFinished;

        public FactorialThread(long inputNumber) {
            this.inputNumber = inputNumber;
            this.result = BigInteger.ZERO;
            this.isFinished = Boolean.FALSE;
        }

        @Override
        public void run() {
            this.result = this.factorial(this.inputNumber);
            this.isFinished = Boolean.TRUE;
            System.out.println("Fin calculation of " + inputNumber);
        }

        private BigInteger factorial(long n) {
            BigInteger resultTemp = BigInteger.ONE;
            for (long i = n; i >= 1; i--) {
                resultTemp = resultTemp.multiply(new BigInteger(Long.toString(i)));

            }
            return resultTemp;
        }

        public BigInteger getResult() {
            return result;
        }

        public Boolean getFinished() {
            return isFinished;
        }
    }
}
