
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewDriver {
    
     public static void main(String[] args) {
       Course crs = new Course("ID", "Name", "Code");  
       crs.setID("RAM ID");
       crs.setName("Ranveer Singh");
       crs.setCode("CSC229");
     System.out.println("RAM ID" +crs.getID());
     System.out.println("Ranveer Singh" +crs.getName());
     System.out.println("CSC229" +crs.getCode());
        
    }
    
}
