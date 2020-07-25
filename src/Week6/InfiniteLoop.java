package Week6;


public class InfiniteLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 100) {
            System.out.println("count:" + count);
            count = count * 1;                // OOPS, does not change count
        }
    }
}
