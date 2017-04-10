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
public abstract class address extends Job {
    private String name;
    private String sname;
    private String gender;
    private Date DateOfBirth;
    private String address;
    private String passport;
    private String employeeId;
    private String nationality; //สัญชาติ
    private String ethnicity;// เชื้อชาติ
    private int salary;
    private Date startWorkDate;
    private String bankAccount;

    public address(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String nationality, String ethnicity, int salary, Date startWorkDate, String bankAccount) {
        this.name = name;
        this.sname = sname;
        this.gender = gender;
        this.DateOfBirth = DateOfBirth;
        this.address = address;
        this.passport = passport;
        this.employeeId = employeeId;
        this.nationality = nationality;
        this.ethnicity = ethnicity;
        this.salary = salary;
        this.startWorkDate = startWorkDate;
        this.bankAccount = bankAccount;
    }

    public address(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String ethnicity, int salary, String jobName) {
        this.name = name;
        this.sname = sname;
        this.gender = gender;
        this.DateOfBirth = DateOfBirth;
        this.address = address;
        this.passport = passport;
        this.employeeId = employeeId;
        this.ethnicity = ethnicity;
        this.salary = salary;
        setJobName(jobName);
    }
    
    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    
}
