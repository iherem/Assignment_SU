package concrete;

import abs.workAddress;
import interf.WeaponTransaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Scientist extends workAddress implements WeaponTransaction{
    private String projectname;
    private String projectstatus;
    
    private List<Weapon> listWeapon;
    public Scientist(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String nationality, String ethnicity, int salary, Date startWorkDate, String bankAccount, String work_address) {
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, nationality, ethnicity, salary, startWorkDate, bankAccount, work_address);
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectstatus() {
        return projectstatus;
    }

    public void setProjectstatus(String projectstatus) {
        this.projectstatus = projectstatus;
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
        System.out.println("-- Scientist --");
        super.print();
        System.out.println("Project Name: "+getProjectname());
        System.out.println("Project Status: "+getProjectstatus());
    }
    
}
