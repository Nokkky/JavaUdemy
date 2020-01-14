package learningJava;

public class Microwave {

    private String brand;
    private boolean operating;
    private int numberOfMicrowave;


    public Microwave(){
        this("Media");
    }

    public Microwave(String brand){
        this(brand,1);
    }

    public Microwave(String brand, int numberOfMicrowave) {
        this.brand = brand;
        this.numberOfMicrowave = numberOfMicrowave;
        this.operating = false;
    }

    public void turnOn(){
        this.operating = true;
        System.out.println("We turn on the microwave.");
    }

    public void turnOff(){
        this.operating = false;
        System.out.println("We turn off the microwave.");
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return numberOfMicrowave;
    }

    public void changeBrand(String brand) {
        this.brand = brand;
    }

    public void changeNumver(int numberOfMicrowave){
        this.numberOfMicrowave = numberOfMicrowave;
    }

    public String isOperating() {
        return " The operating status of microwave is " + this.operating;
//        return operating;
    }
}
