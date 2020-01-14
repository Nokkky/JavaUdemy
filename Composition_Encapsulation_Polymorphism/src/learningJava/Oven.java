package learningJava;

public class Oven {
    private String brand;
    private boolean operating;
    private int numberOfOven;

    public Oven(){
        this("Media");
    }

    public Oven(String brand){
        this(brand, 1);
    }


    public Oven(String brand, int numberOfOven) {
        this.brand = brand;
        this.numberOfOven = numberOfOven;
        this.operating = false;
    }


    public void turnOn(){
        this.operating = true;
    }

    public void turnOff(){
        this.operating = false;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return numberOfOven;
    }

    public void changeBrand(String brand) {
        this.brand = brand;
    }

    public void setNumberOfOven(int numberOfOven) {
        this.numberOfOven = numberOfOven;
    }

    public String isOperating() {
//        return operating;
        return " The operating status of oven is " + this.operating;

    }


}
