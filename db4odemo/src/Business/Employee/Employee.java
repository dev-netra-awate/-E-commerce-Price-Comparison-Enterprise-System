/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String empname;
    private int empid;
    private static int count = 1;

    public Employee() {
        empid = count;
        count++;
    }

    public int getempId() {
        return empid;
    }

    public void setempName(String empname) {
        this.empname = empname;
    }

    
    public String getempName() {
        return empname;
    }

    @Override
    public String toString() {
        return empname;
    }
    
    
}
