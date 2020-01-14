package learningJava;

public class LivingRoom {

    private int numberOfLivingRoom;

    public LivingRoom(){
        this(1);
    }

    public LivingRoom(int numberOfLivingRoom) {
        this.numberOfLivingRoom = numberOfLivingRoom;
    }

    public int getNumberOfLivingRoom() {
        return numberOfLivingRoom;
    }

    public void setNumberOfLivingRoom(int numberOfLivingRoom) {
        this.numberOfLivingRoom = numberOfLivingRoom;
    }
}
