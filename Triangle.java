/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Shape inheritance example
 *
 ***********************************************************************/

// import libraries as needed here

public class Triangle extends Shape{
    //*** Class Variables ***
    
    //*** Instance Variables ***
    double base;
    double height;
    
    //*** Constructors ***
    public Triangle(){
        // implicit call to super class no-arg
        this.base = 1;
        this.height = 1;
    }
    
    //public Shape(String name){
    public Triangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }// full arg
    
    //*** Getters ***
    public double getBase(){
        return this.base;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    //*** Setters ***
    public void setBase(double b){
        this.base = b;
    }
    
    public void setHeight(double h){
        this.height = h;
    }
    
    // others
    public double getArea(){
        return this.getBase() * this.getHeight() / 2;
    }
    
    public String toString(){
    StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString() + "\n");
        sb.append(String.format("%.3f\n", this.getBase()));
        sb.append(String.format("%.3f\n", this.getHeight()));
        sb.append(String.format("%.3f\n", this.getArea()));
        
        return sb.toString();    
    }// end toString
    
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
    

