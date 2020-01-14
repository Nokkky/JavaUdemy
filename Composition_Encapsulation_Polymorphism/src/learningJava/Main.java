package learningJava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Oven oven = new Oven("Samsung",2);
        Microwave microwave = new Microwave("LG");
        Kitchen kitchen = new Kitchen(microwave,oven,1);
        Bedroom bedroom = new Bedroom();
        LivingRoom livingRoom = new LivingRoom();

        Room myRoom = new Room(kitchen,bedroom,livingRoom);

        myRoom.getKitchen().status();
        myRoom.getKitchen().getMicrowave().turnOn();
        myRoom.getKitchen().status();
    }
}
