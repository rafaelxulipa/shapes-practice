import java.lang.*;
import java.awt.*; //for Graphics
import javax.swing.*; //for JApplet, JTextField, JLabel
import java.awt.event.*; //for Listener
import java.util.*;

// Point.java: the class Point
public class Point extends Shape {
   protected int x, y; // coordinates of the Point

   // constructor
   public Point( int a, int b ) { x = a; y = b; }

   // get x coordinate
   public int getX() { return x; }

   // get y coordinate
   public int getY() { return y; }

   // convert the point into a String representation
   public String toString()
      { return "[" + x + ", " + y + "]"; }

   // return the class name
   public String getName() { return "Point"; }    
}
