package learningJava;


public class Circle {
    // write your code here
    // -- radius
    // this(radius)
    // -- getRadius()
    // -- getArea()
    public double radius;

    public Circle(double radius){
        if (radius <= 0){
            radius = 0;
        }else{
            this.radius = radius;
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        double area = this.radius * this.radius * Math.PI;
        return area;
    }
}
