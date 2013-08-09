/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpMyDay;

/**
 *
 * @author shiggins
 */
public class Manager extends Employee{
    
    private String emp_type;
    
    public Manager (String workstation, String department, String email, String type)
    {
        super(workstation, department, email);
        emp_type = type;
    }
    
}
