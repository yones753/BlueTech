package exThreads;

public class Counter {

    private int localCount = 0;
    private int localGoldNumber = 0;

    public void checkGoldNumberOfRenge(int i) {
        int tempCount = 0;
        for (int j = 1; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                tempCount++;
            }
        }
        if (this.localCount < tempCount) {
            this.localCount = tempCount;
            this.localGoldNumber = i;
        }
    }

    public int getLocalGoldNumber() {
        return localGoldNumber;
    }

}
