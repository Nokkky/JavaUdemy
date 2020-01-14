package learningJava;

public class Kitchen {
    private Microwave microwave;
    private Oven oven;
    private int numberOfKitchen;

    // By default, if do not assign Microwave and oven using default microwave and oven.
    public Kitchen(){
        this( new Microwave(), new Oven());
    }

    // If do not assign number of kitchen, the number of kitchen is 1.
    public Kitchen(Microwave microwave, Oven oven){
        this(microwave, oven, 1);
    }

    public Kitchen(Microwave microwave, Oven oven, int numberOfKitchen) {
        this.microwave = microwave;
        this.oven = oven;
        this.numberOfKitchen = numberOfKitchen;
    }

    public int getKitchenNumber(){
        return numberOfKitchen;
    }

    public Microwave getMicrowave() {
        return microwave;
    }

    public Oven getOven() {
        return oven;
    }

    public void status(){
        System.out.println("Checking Kitchen of Room.");
        System.out.println(" We have " + numberOfKitchen + " kitchen.");

        System.out.println(" In Kitchen we have " + microwave.getNumber() + " "
                + microwave.getBrand() + " microwave. ");
        System.out.println(microwave.isOperating());

        System.out.println(" In Kitchen we have " + oven.getNumber() + " "
                + oven.getBrand() + " oven. ");
        System.out.println(oven.isOperating());


    }
}
