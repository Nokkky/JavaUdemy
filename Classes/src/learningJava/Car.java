package learningJava;

public class Car extends Vehicle{

    private int gears;
    private int wheels;
    private int doors;
    private boolean isManual;
    private int currentGear;

    // Empty constructor, if we define will be used.
    // If not java will  automatically inherent predefined constructor.
    // Although we use empty, fields will still be initialized.


    public Car(String name, String size, int gears, int wheels, int doors, boolean isManual) {
        super(name, size);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        super.move(speed, direction);
    }
}

