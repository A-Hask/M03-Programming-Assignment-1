import java.lang.Comparable;
import java.lang.String;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public int compareTo(Circle o){
        if (radius == o.getRadius()){
            return 0;
        } else if (radius < o.getRadius()){
            return -1 ;
        } else {
            return 1;
        }
    }

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
        
    }

    /*Return radius */
    public double getRadius(){
        return radius;
    }

    /*Set a new radius */
    public void setRadius (double radius){
        this.radius = radius;
    }

    /*return area */
    public double getArea(){
        return radius * radius * Math.PI;
    }

    /*return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /*return perimeter */
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    /*Print circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

}
