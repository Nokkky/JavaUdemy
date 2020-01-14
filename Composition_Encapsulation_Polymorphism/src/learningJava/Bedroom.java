package learningJava;

public class Bedroom {
    private int numberOfBedroom;

    public Bedroom(){
        this(1);
    }
    public Bedroom(int numberOfBedroom) {
        this.numberOfBedroom = numberOfBedroom;
    }

    public int getNumberOfBedroom() {
        return numberOfBedroom;
    }

    public void setNumberOfBedroom(int numberOfBedroom) {
        this.numberOfBedroom = numberOfBedroom;
    }
}
