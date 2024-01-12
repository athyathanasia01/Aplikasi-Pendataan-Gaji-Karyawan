/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UASProject;

/**
 *
 * @author ANNISA INTAN NURAINI
 */
public class Employee {
    private String EmployeeID, EmployeeName, ManagerID, Position;
    
    public Employee(String EmployeeID, String EmployeeName, String ManagerID, String Position){
        this.EmployeeID   = EmployeeID;
        this.EmployeeName = EmployeeName;
        this.ManagerID    = ManagerID;
        this.Position     = Position;
    }
    
    public String getEmployeeID(){
        return EmployeeID;
    }
    
    public String getEmployeeName(){
        return EmployeeName;
    }
    
    public String getManagerID(){
        return ManagerID;
    }
    
    public String getPosition(){
        return Position;
    }
}
