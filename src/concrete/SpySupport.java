package concrete;

import abs.workAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SpySupport extends workAddress {

    private Map<SpySupport, Spy> yourSpy;

    public SpySupport(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String nationality, String ethnicity, int salary, Date startWorkDate, String bankAccount, String workaddress) {
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, nationality, ethnicity, salary, startWorkDate, bankAccount, workaddress);
    }

    public Map<SpySupport, Spy> getYourSpy() {
        return yourSpy;
    }

    public void setYourSpy(Map<SpySupport, Spy> yourSpy) {
        this.yourSpy = yourSpy;
    }

    public void setSpy(Spy s) {
        if (this.yourSpy == null) {
            this.yourSpy = new HashMap<>();
        }
        this.yourSpy.put(this, s);
    }

    public Spy getChildSpy() {
        Spy s = null;
        for (SpySupport childSpy : this.getYourSpy().keySet()) {
            s = this.getYourSpy().get(childSpy);
        }
        return s;
    }

    public void print() {
        System.out.println("-- Spy Support --");
        super.print();
        System.out.println("- Spy -");
        System.out.println("Spy Name: " + getChildSpy().getName());
        for (WorkHistory wh : getChildSpy().getListWorkHistory()) {
            System.out.println("WorkHistory Id: " + wh.getWorkId());
            System.out.println("WorkHistory Name: " + wh.getWorkName());
            System.out.println("WorkHistory Status: " + wh.getWorkStatus());
        }
    }
}
