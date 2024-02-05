public class Car {
    String brand;
    String model;
    int yearOfProduction;
    String fuelType;
    double speed;

    Car(String brand, String model, int year, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = year;
        this.fuelType = fuelType;
        this.speed = 0;
    }

    void speed(int amount) {
        this.speed += amount;
        System.out.println("Increased speed: " + this.speed);
    }

    void slow(int amount) {
        this.speed -= amount;
        System.out.println("Decreased speed: " + this.speed);
    }

    void stop() {
        this.speed = 0;
        System.out.println("Reset the speed to 0");
    }

    void checkSpeed(int limit) {
        if (this.speed > limit) {
            System.out.println("Warning! You are above the speed limit.");
        }
    }
}
