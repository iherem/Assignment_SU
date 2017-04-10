
package concrete;

import abs.workAddress;
import interf.WorkHistoryInterface;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MissionController extends workAddress implements WorkHistoryInterface{
    private List<WorkHistory> listWorkHistory;
    public MissionController(String name, String sname, String gender, Date DateOfBirth, String address, String passport, String employeeId, String nationality, String ethnicity, int salary, Date startWorkDate, String bankAccount) {
        super(name, sname, gender, DateOfBirth, address, passport, employeeId, nationality, ethnicity, salary, startWorkDate, bankAccount, null);
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
        System.out.println("-- Mission Controller --");
        super.print();
        for(WorkHistory wh : getListWorkHistory()){
            System.out.println("WorkHistory Id: "+wh.getWorkId());
            System.out.println("WorkHistory Name: "+wh.getWorkName());
            System.out.println("WorkHistory Status: "+wh.getWorkStatus());
        }
    }
}
