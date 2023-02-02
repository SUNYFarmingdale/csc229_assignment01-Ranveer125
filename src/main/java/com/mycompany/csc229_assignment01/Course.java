/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
    
    private int ID;
    private String Name;
    private String Code;
  
public Course(String id, String name) {
   
   // This is the Default Constructor
 
}   

public Course(int ID, String Name, String Code) {
    
       this.ID = ID;
       this.Name = Name;
       this.Code = Code; 
    // This is the Overloaded Constructor 
}

/**
 * 
 * @param ID ID to set 
 */
public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

 /**
  * 
  * @return current ID
  */           
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getCode() {
        return Code;
    }
}


