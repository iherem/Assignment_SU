package concrete;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Spy s = new Spy("Join", "ABC", "male", new Date(), "30/23 Road.Aa", "110299348483", "21001", "Budist", "Budist", 20000, new Date(), "123213");
        Spy fake1 = new Spy("Robert", "Lollipop", "male", new Date(), "21/90 Road.Backwood", "1234123", "80888", "Budist", 35000, "Programmer");
        Spy fake2 = new Spy("Robert2", "Lollipop2", "female", new Date(), "21/90 Road.Backwood", "1234123", "80888", "Budist", 35000, "Programmer");
        Weapon w = new Weapon(1, "AK-47", "borrow");
        Weapon w2 = new Weapon(1, "M4A1", "borrow");
        WorkHistory wh = new WorkHistory(1, "Kill the Boss", "mission complete");
        WorkHistory wh1 = new WorkHistory(2, "Kill the Teacher", "missioning");
        s.fakeInformation(fake1);
        s.fakeInformation(fake2);
        s.listTransaction(w);
        s.listTransaction(w2);
        s.listWorkHistory(wh);
        s.listWorkHistory(wh1);
        

        SpySupport ss = new SpySupport("Mosza", "MosMos", "male", new Date(), "30/23 Road.Aa", "110299348483", "21001", "Budist", "Budist", 20000, new Date(), "123213", "Bangkok");
        ss.setSpy(s);
        System.out.println(ss.getChildSpy().getName());
        
        Staff staf = new Staff("staff1", "staff1 sname", "female", new Date(), "30/23 Road.Aa", "110299348483", "21001", "Budist", "Budist", 20000, new Date(), "123213", "Chaimai");
        
        System.out.println(staf.getName());
        MissionController mc = new MissionController("controller 1", "EIEI", "male", new Date(), "30/23 Road.Aa", "110299348483", "21001", "Budist", "Budist", 20000, new Date(), "123213");
        WorkHistory wh_mc = new WorkHistory(1, "Kill others people", "mission complete");
        mc.listWorkHistory(wh_mc);
        System.out.println("------");
        for(WorkHistory wh_mc_l : mc.getListWorkHistory()){
            System.out.println(wh_mc_l.getWorkName());
        }
        Security security = new Security("Mosza", "MosMos", "male", new Date(), "30/23 Road.Aa", "110299348483", "21001", "Budist", "Budist", 20000, new Date(), "123213", "Bangkok");
        Weapon security_w1 = new Weapon(1, "M4A1", "borrow");
        security.listTransaction(security_w1);
        Scientist scientist = new Scientist("Scientist 1", "Scientist sername", "male", new Date(), "30/23 Road.Aa", "110299348483", "21001", "Budist", "Budist", 20000, new Date(), "123213", "Bangkok");
        scientist.setProjectname("Project A");
        scientist.setProjectstatus("Done");
        scientist.print();
    }
}
