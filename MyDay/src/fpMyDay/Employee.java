/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpMyDay;

/**
 * Date: 8/8/2013
 * @author shiggins
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
    }
    
    public void endTime()
    {
    }
    
    public void getActiveApplication()
    {
    }
    
    public void printStatements()
    {
        System.out.println("User:" + emp_workstationName);
    }
        
    
}
