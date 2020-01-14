package learningJava;

public class Room {

    private Kitchen kitchen;
    private Bedroom bedroom;
    private LivingRoom livingroom;

    public Room(Kitchen kitchen, Bedroom bedroom, LivingRoom livingroom){
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.livingroom = livingroom;
    }

    public Kitchen getKitchen(){
        return kitchen;
    }

    public Bedroom getBedroom(){
        System.out.println("Bedroom of Room.");
        bedroom.getNumberOfBedroom();
        return bedroom;
    }

    public LivingRoom getLivingroom() {
        System.out.println("Livingroom of Room");
        return livingroom;
    }
}
