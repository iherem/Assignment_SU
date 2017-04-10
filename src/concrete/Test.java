package concrete;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Spy s = new Spy("Join", "ABC", "male", new Date(), "30/23 Road.Aa", "110299348483", "21001", "Budist", "Budist", 20000, new Date(), "123213");
        Spy fake1 = new Spy("Robert", "Lollipop", "male", new Date(), "21/90 Road.Backwood", "1234123", "80888", "Budist", 35000, "Programmer");
        Spy fake2 = new Spy("Robert2", "Lollipop2", "female", new Date(), "21/90 Road.Backwood", "1234123", "80888", "Budist", 35000, "Programmer");
        Weapon w = new Weapon(1,"AK-47", "borrow");
        Weapon w2 = new Weapon(1,"M4A1", "borrow");
        WorkHistory wh = new WorkHistory(1, "Kill the Boss", "mission complete");
        WorkHistory wh1 = new WorkHistory(2, "Kill the Teacher", "missioning");
        s.fakeInformation(fake1);
        s.fakeInformation(fake2);
        s.listTransaction(w);
        s.listTransaction(w2);
        s.listWorkHistory(wh);
        s.listWorkHistory(wh1);
        for(Spy spy : s.getListFakeSpy()){
            System.out.println(spy.getName());
        }
        for(Weapon wea : s.getListWeapon()){
            System.out.println(wea.getWeaponName());
        }
        for(WorkHistory workh : s.getListWorkHistory()){
            System.out.println(workh.getWorkName());
        }
        //System.out.println(s.getListFakeSpy());
    }
}
