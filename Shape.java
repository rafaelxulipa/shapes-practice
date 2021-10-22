import java.lang.*;
import java.awt.*; //for Graphics
import javax.swing.*; //for JApplet, JTextField, JLabel
import java.awt.event.*; //for Listener
import java.util.*;


// Shape.java: abstract base class
public abstract class Shape { // abstract class, can't instantiate
   // to implement an idNumber
   private static int counter = 0;
   private int idNumber;
   public Shape () {
      idNumber = ++counter;
   }
   public int getIdNumber() { return idNumber;}

   public double area() { return 0.0; }
   public double volume() { return 0.0; }
   public abstract String getName(); // abstract, so omit body
} 