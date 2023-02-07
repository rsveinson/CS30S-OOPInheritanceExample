import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:    Shapes inheritance example
 * 
 *************************************************************/

public class ShapesDriver {
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    final static String delim = "[ ]+";          // delimiter for splitting input records

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system

        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("Shapes inheritance example");
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        System.out.println(pInfo.getBanner());
        //fout.print(banner);

        // ***** Get Input *****

        // ***** Main Processing *****

        Shape shape = new Shape("Blob");
        Shape anotherShape = new Shape();
        System.out.println(shape);
        System.out.println(anotherShape);

        // circles
        Circle circle = new Circle("Disk", 4.5);
        System.out.println(circle);
        Circle anotherCircle = new Circle();
        System.out.println(anotherCircle);

        // Triangles
        Triangle triangle = new Triangle("Hat", 5.0, 4.0);
        System.out.println(triangle);
        Triangle anotherTriangle = new Triangle();
        System.out.println(anotherTriangle);

        System.out.println("-----------------------------------");
        System.out.println("Using ArrayList with inheritance");
        System.out.println("-----------------------------------");
        System.out.println();

        ArrayList<Shape> list = new ArrayList();
        list.add(shape);
        list.add(anotherShape);
        list.add(circle);
        list.add(anotherCircle);
        list.add(triangle);
        list.add(anotherTriangle);

        // now print the list
        for(Shape s : list){
            System.out.println(s);
        }// end for

        // use sub-class methods
        anotherCircle.setRadius(5.5);
        //list.get(3).setRadius(6.5);
        Circle temp = (Circle)list.get(3);
        temp.setRadius(5.5);

        // now print the list
        for(Shape s : list){
            if(s instanceof Circle){
                temp = (Circle)s;
                System.out.println(temp.getArea());
            }
        }// end for

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
