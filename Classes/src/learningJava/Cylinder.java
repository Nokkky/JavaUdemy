package learningJava;

public class Cylinder extends Circle{
    // height
    // this(radius, height)
    // -- getHeight()
    // -- getVolume()
    public double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        double area = super.getArea();
        return area * this.height;
    }


}
