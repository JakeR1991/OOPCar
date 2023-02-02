public class Car {
    // Private variables for the Car class
    private String make;
    private String model;
    private int year;
    private double speed;

    // Constructor for the Car class
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    // Getter method for the make
    public String getMake() {
        return make;
    }

    // Setter method for the make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter method for the model
    public String getModel() {
        return model;
    }

    // Setter method for the model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method for the year
    public int getYear() {
        return year;
    }

    // Setter method for the year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter method for the speed
    public double getSpeed() {
        return speed;
    }

    // Behavioural method for accelerating the car
    public void accelerate(double acceleration) {
        speed += acceleration;
    }

    // Behavioural method for decelerating the car
    public void decelerate(double deceleration) {
        speed -= deceleration;
        if (speed < 0) {
            speed = 0;
        }
    }
}
