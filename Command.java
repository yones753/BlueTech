package exThreads;



public class Command implements Runnable{
    //DATA
    private Counter counter;
    private int start;
    private int end;

    public Command(Counter counter ,int start ,int end) {
        this.counter = counter;
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            counter.checkGoldNumberOfRenge(i);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
