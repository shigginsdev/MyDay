/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpMyDay;

/**
 * Date: 8/8/2013
 * @author shiggins
 * another git test
 */
public class Employee implements fpMyDay {
    
    String emp_workstationName;
    String emp_department;
    String emp_emailAddr;
           
    public Employee (String workstation, String department, String email)
    {
        emp_workstationName = workstation;
        emp_department = department;
        emp_emailAddr = email;
    }
    
    public void startTime()
    {
        //get the system time
    }
    
    public void endTime()
    {
        //get the system time
    }
    
    public void getActiveApplication()
    {
        //which application is the user accessing
        
    }
    
        
    public void printStatements()
    {
        System.out.println("User:" + emp_workstationName);
    }
        
    
}
