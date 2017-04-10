package concrete;

import abs.workAddress;
import interf.WeaponTransaction;
import interf.WorkHistoryInterface;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Spy extends workAddress implements WeaponTransaction, WorkHistoryInterface{
    private List<Spy> listFakeSpy;
    private List<Weapon> listWeapon;
    private List<WorkHistory> listWorkHistory;
    private String jobName;
    public Spy(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String nationality, String ethnicity, int salary, Date startWorkDate, String bankAccount) {
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, nationality, ethnicity, salary, startWorkDate, bankAccount,null);
    }
    
    public Spy(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String ethnicity, int salary, String jobName){
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, ethnicity, salary);
        this.jobName = jobName;
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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    
    public List<Weapon> getListWeapon() {
        return listWeapon;
    }

    public void setListWeapon(List<Weapon> listWeapon) {
        this.listWeapon = listWeapon;
    }

    public List<WorkHistory> getListWorkHistory() {
        return listWorkHistory;
    }

    public void setListWorkHistory(List<WorkHistory> listWorkHistory) {
        this.listWorkHistory = listWorkHistory;
    }

    
    @Override
    public void listWorkHistory(WorkHistory wh) {
        if(this.listWorkHistory == null){
            this.listWorkHistory = new ArrayList<>();
        }
        this.listWorkHistory.add(wh);
    }
    public void print(){
        System.out.println("-- Spy --");
        super.print();
        for(WorkHistory wh : getListWorkHistory()){
            System.out.println("WorkHistory Id: "+wh.getWorkId());
            System.out.println("WorkHistory Name: "+wh.getWorkName());
            System.out.println("WorkHistory Status: "+wh.getWorkStatus());
        }
        for(Weapon w : getListWeapon()){
            System.out.println("Weapon Id: "+w.getWeaponId());
            System.out.println("Weapon Name: "+w.getWeaponName());
            System.out.println("Weapon Status: "+w.getWeaponStatus());
        }
        System.out.println("--- Fake Spy ----");
        for(Spy s : getListFakeSpy()){
            System.out.println("Name: "+s.getName());
            System.out.println("Surname: "+s.getSname());
            System.out.println("Gender: "+s.getGender());
            System.out.println("DateOfBirth: "+s.getDateOfBirth());
            System.out.println("Address: "+s.getAddress());
            System.out.println("Passport: "+s.getPassport());
            System.out.println("Employee Id: "+s.getEmployeeId());
            System.out.println("Ethnicity: "+s.getEthnicity());
            System.out.println("Salary: "+s.getSalary());
            System.out.println("Job: "+s.getJobName());
        }
    }

    
}

    
