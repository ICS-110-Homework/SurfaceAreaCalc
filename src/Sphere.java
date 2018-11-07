/**
 *
 * @author Phillip Turner
 */
public class Sphere {
    /** volume of a sphere (class method)
     * @param radius, the (double) radius of the sphere
     * @return the volume of a sphere with that radius
     */
    public static double volume(double radius){
        return 4.0 / 3.0 * Math.PI * Math.pow(radius,3.0);
    }
    /** volume of a sphere (class method)
     * @param radius, the (double) radius of the sphere
     * @return the surface area of a sphere with that radius
     */
    public static double surfaceArea(double radius){
        return Math.PI * Math.pow(radius,2.0) * 4;
    }
}
