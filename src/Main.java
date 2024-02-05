public class Main {
    public static void main(String[] args) {
        // Test Task 3
        Car car = new Car("Tesla", "S", 2012, "Electric");

        car.speed(149);
        car.slow(50);
        car.stop();
        car.speed(150);
        car.checkSpeed(100);
    }
}