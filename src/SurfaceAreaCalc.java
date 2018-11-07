/** SurfaceAreaCalc.java calculates surface area of a sphere and a box based on
 * dimensions given by the user
 * @author Phillip Turner, for Alice+Jacva
 */
import java.util.Scanner; 

public class SurfaceAreaCalc {
    public static void main(String[] args){
        System.out.println("Today we will calculate the surface area of a sphere and a box.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the radius (in inches) of the sphere?");
        double radius = keyboard.nextDouble();
        System.out.println("What is the length of the box?");
        double length = keyboard.nextDouble();
        System.out.println("What is the width of the box?");
        double width = keyboard.nextDouble();
        System.out.println("What is the height of the box?");
        double height = keyboard.nextDouble();
        radius /= 12.0;
        double sphereSurfaceArea = Sphere.surfaceArea(radius);
        double boxSurfaceArea = Box.surfaceArea(length, width, height);
        System.out.printf("The surface area of the Sphere is %2.2f and the surface area of the Box is %2.2f",sphereSurfaceArea, boxSurfaceArea);
    }
}
