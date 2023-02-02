public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus ST", 2013);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println();

        car.accelerate(30);
        System.out.println("Speed after acceleration: " + car.getSpeed());
        System.out.println();

        car.decelerate(20);
        System.out.println("Speed after deceleration: " + car.getSpeed());
    }
}
