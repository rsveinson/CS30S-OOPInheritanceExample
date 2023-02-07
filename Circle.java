/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Shape inheritance example Cirlce class
 *
 ***********************************************************************/

// import libraries as needed here

public class Circle extends Shape{
    //*** Class Variables ***
    
    //*** Instance Variables ***
    private double radius;
    
    //*** Constructors ***
    public Circle(){
        // implicit call to Shape()
        radius = 0;
    }
    
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    //*** Getters ***
    public double getRadius(){
        return radius;
    }
    
    //*** Setters ***
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    // others
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    // public String toString(){
        // return getName() + ": " + getID() + ", " + radius;
    // }// end tostring
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString() + "\n");
        sb.append(String.format("%.3f\n", this.getRadius()));
        sb.append(String.format("%.3f\n", this.getArea()));
        
        
        return sb.toString();
    }// end tostring
} // end of public class

    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
