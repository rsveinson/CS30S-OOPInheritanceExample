/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: Inheritance example using Shapes
 *
 ***********************************************************************/

// import libraries as needed here

public class Shape {
    //*** Class Variables ***
    private static int nextID = 1000;
    
    //*** Instance Variables ***
    protected String name;
    protected int id;
    
    //*** Constructors ***
    public Shape(){
        id = getNextID();
        name = "unknown";
    }// end no arg
    
    public Shape(String name){
        id = getNextID();
        this.name = name;
    }// end arg
   
    //*** Getters ***
    public String getName(){
        return this.name;
    }
    
    public int getID(){
        return this.id;
    }
    
    //*** Setters ***
    public void setName(String name){
        this.name = name;
    }
    
    // ** others **
    public String toString(){
        return  name + ": " + id;
    }
    
    private int getNextID(){
        return nextID++;
    }// end get next id
    
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
