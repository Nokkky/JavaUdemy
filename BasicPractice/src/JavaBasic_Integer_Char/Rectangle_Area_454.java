package JavaBasic_Integer_Char;

public class Rectangle_Area_454 {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here

    public int width;
    public int height;
    private static final int INITIAL_WIDTH = 1;
    private static final int INITIAL_HEIGHT = 1;

    public Rectangle_Area_454(){
        this.width = INITIAL_WIDTH;
        this.height = INITIAL_HEIGHT;
    }

    public Rectangle_Area_454(int width, int height){
        if (width < 0 || height < 0){
            throw new IllegalArgumentException("Illegal Initialize Value");
        }else{
            this.width = width;
            this.height = height;
        }

    }

    public int getArea(){

        return width*height;
    }



}
