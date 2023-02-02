
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Driver {
     public static void main(String[] args) {
         
// Instantiation of Course class to change ID, Name, and Code 
       
       Course crs = new Course();
       crs.setID("92909");
       crs.setName("Ranveer");
       crs.setCode("CSC229");
       
// Overloaded Constructor

      System.out.println("ID" +crs.getID());
      System.out.println("Name" +crs.getName());
      System.out.println("Code" +crs.getCode());        
    }
}









