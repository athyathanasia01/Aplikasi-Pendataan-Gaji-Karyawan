/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UASProject;
import java.util.ArrayList;

/**
 *
 * @author ANNISA INTAN NURAINI
 */
public class InputDataEmployee {
    ArrayList<Employee> employeelist;
    
    public InputDataEmployee(){
        employeelist = new ArrayList();
    }
    
    public void InsertData(String EmployeeID, String EmployeeName, String ManagerID, String Position){
        Employee epl = new Employee(EmployeeID, EmployeeName, ManagerID, Position);
        employeelist.add(epl);
    }
    
    public ArrayList<Employee> getAll(){
        return employeelist;
    }
    
    public void deleteData (int index){
        employeelist.remove(index);
    }
    
}
