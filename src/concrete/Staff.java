
package concrete;

import abs.workAddress;
import java.util.Date;

public class Staff extends workAddress{
    
    public Staff(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String nationality, String ethnicity, int salary, Date startWorkDate, String bankAccount, String work_address) {
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, nationality, ethnicity, salary, startWorkDate, bankAccount, work_address);
    }
    public void print(){
        System.out.println("-- Staff --");
        super.print();
    }
    
}
