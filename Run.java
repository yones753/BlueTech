public class Run {

    public static void main(String[] args) {

//        int n = 4;
//        System.out.println("Number of ways to go up the stairs :"+takeStairs(n));

    }

    public static void squareArray() {
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = (int) Math.pow(index, 2);
        }
    }

    public static int takeStairs(int n) {
        if (n == 0) return 1;
        else if (n < 0) return 0;
        else return takeStairs(n - 2) + takeStairs(n - 1);
    }
}
