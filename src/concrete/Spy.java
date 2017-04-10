package concrete;

import abs.workAddress;
import interf.WeaponTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Spy extends workAddress implements WeaponTransaction{
    private List<Spy> listFakeSpy;
    private List<Weapon> listWeapon;
    
    public Spy(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String nationality, String ethnicity, int salary, Date startWorkDate, String bankAccount) {
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, nationality, ethnicity, salary, startWorkDate, bankAccount,null);
    }
    
    public Spy(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String ethnicity, int salary, String jobName){
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, ethnicity, salary, jobName);
    }
    
    
    
    public void fakeInformation(Spy s){
        if(this.listFakeSpy == null){
            this.listFakeSpy = new ArrayList<>();
        }
        this.listFakeSpy.add(s);
    }

    @Override
    public void listTransaction(Weapon w) {
        if(this.listWeapon == null){
            this.listWeapon = new ArrayList<>();
        }
        this.listWeapon.add(w);
    }

    public List<Spy> getListFakeSpy() {
        return listFakeSpy;
    }

    public void setListFakeSpy(List<Spy> listFakeSpy) {
        this.listFakeSpy = listFakeSpy;
    }

    public List<Weapon> getListWeapon() {
        return listWeapon;
    }

    public void setListWeapon(List<Weapon> listWeapon) {
        this.listWeapon = listWeapon;
    }


    
}

    