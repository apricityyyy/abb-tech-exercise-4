public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.getInstanceCount());

        Counter counter1 = new Counter();
        System.out.println(counter1.getInstanceCount());

        Counter counter2 = new Counter();
        System.out.println(counter2.getInstanceCount());

        Counter counter3 = new Counter();
        System.out.println(counter3.getInstanceCount());
    }
}