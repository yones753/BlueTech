package exThreads;

import java.util.ArrayList;
import java.util.List;

public class Threads {

    public static void createThreads() {

        int goldNumber = 0;
        final int MAX_RANGE = 100_000;
        int range = MAX_RANGE / 5;
        int start = 1;
        int end = start + range - 1;
        Counter c = new Counter();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Command(c, start, end));
            thread.start();
            start = 1 + end;
            end = start + range - 1;
            threads.add(thread);
        }
        long startTime = System.currentTimeMillis();
        for (var t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Used " + (elapsedTime / 1000.0) + " seconds.");

        goldNumber = c.getLocalGoldNumber();
        System.out.println(goldNumber);

    }

}
