/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pturn
 */
public class Box {
    /** volume of a box (class method)
     * @param length, the (double) length of the box
     * @param width, the (double) width of the box
     * @param height, the (double) height of the box
     * @return the volume
     */
    public static double volume(double length, double width, double height){
        return length * width * height;
    }
    /** volume of a box (class method)
     * @param length, the (double) length of the box
     * @param width, the (double) width of the box
     * @param height, the (double) height of the box
     * @return the surface area of the box
     */
    public static double surfaceArea(double length, double width, double height){
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }
}
