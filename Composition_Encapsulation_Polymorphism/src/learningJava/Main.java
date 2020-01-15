package learningJava;

public class Main {

    public static void main(String[] args) {
//        practiceOfComposition();
//        practiceOfEncapsulation();
        practiceOfPolymorphism();
    }

    public static void practiceOfComposition(){
        // ****** Practice of Composition ******
        /** For challenge of Composition, we created a Room class with subclass Kitchen, Bedroom, and Living Room.
         *  In Kitchen, we do detailed description and construction.
         *  Room
         *  -- Kitchen, Bedroom, Living Room
         *  -- getKitchen(), getBedroom(), getLivingRoom()
         *    Kitchen
         *    -- Microwave, Oven, numberOfKitchen
         *    -- getMicrowave(), getOven(), getNumberOfKitchen()
         *    -- status()
         *     Microwave
         *     -- brand, numberOfMicrowave, operating = false
         *     -- getBrand(), getNumber()
         *     -- changeBrand(), changeNumber()
         *     -- turnOn(), turnOff()
         *     -- isOperating()
         *     Oven
         *     -- similar to Microwave **/
        Oven oven = new Oven("SamSung",2);
        Microwave microwave = new Microwave("LG");
        Kitchen kitchen = new Kitchen(microwave,oven,1);
        Bedroom bedroom = new Bedroom();
        LivingRoom livingRoom = new LivingRoom();

        Room myRoom = new Room(kitchen,bedroom,livingRoom);

        myRoom.getKitchen().status();

        myRoom.getKitchen().getMicrowave().turnOn();
        myRoom.getKitchen().getOven().turnOn();
        myRoom.getKitchen().status();

        myRoom.getKitchen().getOven().turnOff();
        myRoom.getKitchen().status();

    }

    public static void practiceOfEncapsulation(){
        // ****** Encapsulation *****
        /** Printer
         * -- tonerLevel, numberOfPages, duplexPrinter
         * -- fillUpToner()
         * -- increaseNumberOfPagesPrinted()
         * -- **/
        Printer myPrinter = new Printer(50, true);
        System.out.println("Is duplexPrinter: " + myPrinter.isDuplexPrinter());
        System.out.println("Initial toner level is: " + myPrinter.getTonerLevel());
        System.out.println("Initial pages are: " + myPrinter.getPagesPrinted());

        myPrinter.pagesPrinted(1000);
        System.out.println("Increases pages to: " + myPrinter.getPagesPrinted());

        myPrinter.fillUpToner(110);
        System.out.println("FillUpToner to: " + myPrinter.getTonerLevel());
    }

    public static void practiceOfPolymorphism(){

        Honda myHonda = new Honda();
        myHonda.brake();

        BMW myBMW = new BMW();
        myBMW.brake();
        myBMW.startEngine();
    }
}

class Car{
    private String name;
    private int cylinder;
    private int wheels;
    private boolean engine;


    public Car(int cylinder, String name){
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    };

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine(){
        System.out.println("Start engine in Car");
        this.engine = true;
    }

    public void brake(){
        System.out.println("Car().braking");
    }
}

class Honda extends Car{

    public Honda() {
        super(4,"Honda");
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine in Honda.");
//        super.startEngine();
    }

    @Override
    public void brake() {
        System.out.println("Brake at Honda");
//        super.brake();
    }
}

class BMW extends Car{

    public BMW() {
        super(4,"BMW");
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine in BMW.");
    }

}