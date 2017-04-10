package concrete;

import abs.workAddress;
import interf.WeaponTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Security extends workAddress implements WeaponTransaction{
    private List<Weapon> listWeapon;
    public Security(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String nationality, String ethnicity, int salary, Date startWorkDate, String bankAccount, String work_address) {
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, nationality, ethnicity, salary, startWorkDate, bankAccount, work_address);
    }

    public List<Weapon> getListWeapon() {
        return listWeapon;
    }

    public void setListWeapon(List<Weapon> listWeapon) {
        this.listWeapon = listWeapon;
    }
    
    @Override
    public void listTransaction(Weapon w) {
        if(this.listWeapon == null){
            this.listWeapon = new ArrayList<>();
        }
        this.listWeapon.add(w);
    }
    public void print(){
        System.out.println("-- Security --");
        super.print();
        for(Weapon w : getListWeapon()){
            System.out.println("Weapon Id: "+w.getWeaponId());
            System.out.println("Weapon Name: "+w.getWeaponName());
            System.out.println("Weapon Status: "+w.getWeaponStatus());
        }
    }
    
    
}
