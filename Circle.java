import java.lang.*;
import java.awt.*; //for Graphics
import javax.swing.*; //for JApplet, JTextField, JLabel
import java.awt.event.*; //for Listener
import java.util.*;

// circle.java: the class Circle
public class Circle extends Point {  // inherits from Point
   protected double radius;     

   // Constructor
   public Circle( double r, int a, int b ) {
      super( a, b );  // call the superclass constructor
      radius = ( r >= 0 ? r : 0 );
   }
      
   // Calculate area of Circle
   public double area() { return Math.PI * radius * radius; }

   // convert the Circle to a String
   public String toString()
      { return "Center = " + super.toString() +
               "; Radius = " + radius; }

   // return the class name
   public String getName() { return "Circle"; }
}