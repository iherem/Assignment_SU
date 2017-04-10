/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abs;

import java.util.Date;

/**
 *
 * @author bank
 */
public abstract class workAddress extends address{
    private String work_address;

    public workAddress(String name, String sname, String gender, 
            Date DateOfBirth, String address, String passport, 
            String employeeId, String nationality, 
            String ethnicity, int salary, Date startWorkDate, 
            String bankAccount, String work_address) {
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, nationality, ethnicity, salary, startWorkDate, bankAccount);
        this.work_address = work_address;
    }
    
    public workAddress(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String ethnicity, int salary, String jobName){
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, ethnicity, salary, jobName);
    }
    
    

    public String getWork_address() {
        return work_address;
    }

    public void setWork_address(String work_address) {
        this.work_address = work_address;
    }
    
}
