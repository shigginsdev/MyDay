/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpMyDay;

/**
 *
 * @author shiggins
 */
public class AccountManager extends Employee {
    
    private String amSalesRep;
    
    public AccountManager (String workstation, String department, String email, String salesRep)
    {
        super(workstation, department, email);
        amSalesRep = salesRep;         
    }
    
}
