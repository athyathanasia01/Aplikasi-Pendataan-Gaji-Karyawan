/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UASProject;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ANNISA INTAN NURAINI
 */
public class EmployeeMainMenu extends javax.swing.JPanel {
    
    public EmployeeInterface employee;
    
    Statement st;
    Connection cn;
    /**
     * Creates new form EmployeeMainMenu
     */
    public EmployeeMainMenu() {
        initComponents();
        this.cn = connectivity.connected();
    }
    
    public void addEvent (EmployeeInterface event){
       this.employee = event; 
    }
    
    String username;

    public EmployeeMainMenu(String username) {
        this.username = username;
    }
    
    public String login (){
        return username;
    }
    
    String EmployeeName = " ";
    String EmployeeID   = " ";
    String ManagerID    = " ";
    String Position     = " ";
    String DateOfBirth  = " ";
    String Address      = " ";
    String Email        = " ";
    String Phone        = " ";
    String Salary       = " ";
    String Status       = " ";
    
    public void data(){
        String SQL1  = "SELECT EmployeeName, EmployeeID, ManagerID, Position, DateOfBirth FROM employeedata WHERE EmployeeID =?";
        try {
            try (PreparedStatement pst = cn.prepareStatement(SQL1, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)){
                pst.setString(1, login());
                try (ResultSet rs = pst.executeQuery()){
                    if(rs.first()){
                        EmployeeName = rs.getString(1);
                        EmployeeID   = rs.getString(2);
                        ManagerID    = rs.getString(3);
                        Position     = rs.getString(4);
                        DateOfBirth  = rs.getString(5);
                    }
                    rs.close();
                }
                pst.close();
            }
            TextFieldProfileEmployeeName.setText(EmployeeName);
            TextFieldProfileEmployeeID.setText(EmployeeID);
            TextFieldProfileManagerID.setText(ManagerID);
            TextFieldProfilePosition.setText(Position);
            TextFieldProfileDateOfBirth.setText(DateOfBirth);
            TextFieldSalaryCheckEmployeeID.setText(EmployeeID);
            TextFieldSalaryCheckManagerID.setText(ManagerID);
            TextFieldSalaryCheckEmployeeName.setText(EmployeeName);
        }
        catch (SQLException e){
            Logger.getLogger(AdminEditMenu.class.getName()).log(Level.SEVERE, null, e);
        }
        
        String SQL2  = "SELECT EmployeeAddress, EmployeeEmail, EmployeePhone FROM employeecontact WHERE EmployeeID =?";
        try {
            try (PreparedStatement pst = cn.prepareStatement(SQL2, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)){
                pst.setString(1, login());
                try (ResultSet rs = pst.executeQuery()){
                    if(rs.first()){
                        Address      = rs.getString(1);
                        Email        = rs.getString(2);
                        Phone        = rs.getString(3);
                    }
                    rs.close();
                }
                pst.close();
            }
            TextFieldProfileAddress.setText(Address);
            TextFieldProfileEmail.setText(Email);
            TextFieldProfilePhone.setText(Phone);
        }
        catch (SQLException e){
            Logger.getLogger(AdminEditMenu.class.getName()).log(Level.SEVERE, null, e);
        }
        
        String SQL3 = "SELECT SalaryTotal, Status FROM employeesalary WHERE EmployeeID =?";
        try {
            try (PreparedStatement pst = cn.prepareStatement(SQL3, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)){
                pst.setString(1, login());
                try (ResultSet rs = pst.executeQuery()){
                    if(rs.first()){
                        Salary       = rs.getString(1);
                        Status       = rs.getString(2);
                    }
                    rs.close();
                }
                pst.close();
            }
            TextFieldSalaryCheckSalary.setText(Salary);
            TextFieldSalaryCheckStatus.setText(Status);
        }
        catch (SQLException e){
            Logger.getLogger(AdminEditMenu.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BT_ChangePassword = new javax.swing.JButton();
        BT_Logout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        TabPaneProfile = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextFieldProfileEmployeeName = new javax.swing.JTextField();
        TextFieldProfileEmployeeID = new javax.swing.JTextField();
        TextFieldProfileManagerID = new javax.swing.JTextField();
        TextFieldProfileDateOfBirth = new javax.swing.JTextField();
        TextFieldProfileAddress = new javax.swing.JTextField();
        TextFieldProfileEmail = new javax.swing.JTextField();
        TextFieldProfilePhone = new javax.swing.JTextField();
        BT_SaveChanges = new javax.swing.JButton();
        BT_DeleteChanges = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        TextFieldProfilePosition = new javax.swing.JTextField();
        TabPaneSalaryCheck = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TextFieldSalaryCheckManagerID = new javax.swing.JTextField();
        TextFieldSalaryCheckEmployeeID = new javax.swing.JTextField();
        TextFieldSalaryCheckEmployeeName = new javax.swing.JTextField();
        TextFieldSalaryCheckSalary = new javax.swing.JTextField();
        TextFieldSalaryCheckStatus = new javax.swing.JTextField();
        BT_MoveToBank = new javax.swing.JButton();
        warninglable = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BT_PrintReceipt = new javax.swing.JButton();
        TabPaneReference = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(143, 189, 143));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabel1.setText("CV. KARYA BANGSA");

        BT_ChangePassword.setBackground(new java.awt.Color(143, 156, 192));
        BT_ChangePassword.setText("change password");

        BT_Logout.setBackground(new java.awt.Color(143, 98, 167));
        BT_Logout.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_ChangePassword)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BT_Logout)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_ChangePassword)
                .addGap(18, 18, 18)
                .addComponent(BT_Logout)
                .addGap(28, 28, 28))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setText("PROFILE");

        jLabel3.setText("Employee Name");

        jLabel4.setText("Employee ID");

        jLabel5.setText("Manager ID");

        jLabel6.setText("Date of Birth");

        jLabel7.setText("Address");

        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel9.setText("CONTACT INFO");

        jLabel10.setText("phone");

        TextFieldProfileEmployeeName.setEditable(false);

        TextFieldProfileEmployeeID.setEditable(false);

        TextFieldProfileManagerID.setEditable(false);

        TextFieldProfileAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldProfileAddressActionPerformed(evt);
            }
        });

        BT_SaveChanges.setBackground(new java.awt.Color(47, 118, 108));
        BT_SaveChanges.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BT_SaveChanges.setText("save changes");
        BT_SaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SaveChangesActionPerformed(evt);
            }
        });

        BT_DeleteChanges.setBackground(new java.awt.Color(0, 204, 102));
        BT_DeleteChanges.setText("delete changes");

        jLabel17.setText("Position");

        TextFieldProfilePosition.setEditable(false);

        javax.swing.GroupLayout TabPaneProfileLayout = new javax.swing.GroupLayout(TabPaneProfile);
        TabPaneProfile.setLayout(TabPaneProfileLayout);
        TabPaneProfileLayout.setHorizontalGroup(
            TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPaneProfileLayout.createSequentialGroup()
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TabPaneProfileLayout.createSequentialGroup()
                            .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextFieldProfileAddress)
                                .addComponent(TextFieldProfileEmail)
                                .addComponent(TextFieldProfilePhone, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                .addComponent(TextFieldProfileDateOfBirth)))
                        .addGroup(TabPaneProfileLayout.createSequentialGroup()
                            .addComponent(BT_SaveChanges)
                            .addGap(18, 18, 18)
                            .addComponent(BT_DeleteChanges)))
                    .addGroup(TabPaneProfileLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldProfilePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabPaneProfileLayout.createSequentialGroup()
                        .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TabPaneProfileLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel2))
                                .addGroup(TabPaneProfileLayout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldProfileEmployeeName, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(TextFieldProfileManagerID)
                            .addComponent(TextFieldProfileEmployeeID))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        TabPaneProfileLayout.setVerticalGroup(
            TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPaneProfileLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldProfileEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldProfileEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldProfileManagerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TextFieldProfilePosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextFieldProfileDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextFieldProfileAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextFieldProfileEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextFieldProfilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_SaveChanges)
                    .addComponent(BT_DeleteChanges))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profile", TabPaneProfile);

        jLabel11.setText("Manager ID");

        jLabel12.setText("Employee ID");

        jLabel13.setText("Employee Name");

        jLabel14.setText("Salary");

        jLabel15.setText("Status");

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel16.setText("Check your salary this month!");

        TextFieldSalaryCheckManagerID.setEditable(false);

        TextFieldSalaryCheckEmployeeID.setEditable(false);

        TextFieldSalaryCheckEmployeeName.setEditable(false);

        TextFieldSalaryCheckSalary.setEditable(false);

        TextFieldSalaryCheckStatus.setEditable(false);

        BT_MoveToBank.setText("Move to my bank account");

        BT_PrintReceipt.setText("print receipt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_PrintReceipt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BT_PrintReceipt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TabPaneSalaryCheckLayout = new javax.swing.GroupLayout(TabPaneSalaryCheck);
        TabPaneSalaryCheck.setLayout(TabPaneSalaryCheckLayout);
        TabPaneSalaryCheckLayout.setHorizontalGroup(
            TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabPaneSalaryCheckLayout.createSequentialGroup()
                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TabPaneSalaryCheckLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BT_MoveToBank))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TabPaneSalaryCheckLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabPaneSalaryCheckLayout.createSequentialGroup()
                                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TabPaneSalaryCheckLayout.createSequentialGroup()
                                        .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(TabPaneSalaryCheckLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldSalaryCheckSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(TextFieldSalaryCheckEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFieldSalaryCheckEmployeeID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFieldSalaryCheckManagerID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFieldSalaryCheckStatus)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(warninglable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(TabPaneSalaryCheckLayout.createSequentialGroup()
                                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE)))))
                .addGap(79, 79, 79))
        );
        TabPaneSalaryCheckLayout.setVerticalGroup(
            TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPaneSalaryCheckLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TextFieldSalaryCheckManagerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TextFieldSalaryCheckEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TextFieldSalaryCheckEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TextFieldSalaryCheckSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TabPaneSalaryCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TextFieldSalaryCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warninglable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BT_MoveToBank)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Salary Check", TabPaneSalaryCheck);

        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel18.setText("This site yet not available. Back soon to see your newest page!");

        javax.swing.GroupLayout TabPaneReferenceLayout = new javax.swing.GroupLayout(TabPaneReference);
        TabPaneReference.setLayout(TabPaneReferenceLayout);
        TabPaneReferenceLayout.setHorizontalGroup(
            TabPaneReferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPaneReferenceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        TabPaneReferenceLayout.setVerticalGroup(
            TabPaneReferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabPaneReferenceLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addContainerGap(430, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reference", TabPaneReference);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldProfileAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldProfileAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldProfileAddressActionPerformed

    private void BT_SaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SaveChangesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_SaveChangesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_ChangePassword;
    private javax.swing.JButton BT_DeleteChanges;
    private javax.swing.JButton BT_Logout;
    private javax.swing.JButton BT_MoveToBank;
    private javax.swing.JButton BT_PrintReceipt;
    private javax.swing.JButton BT_SaveChanges;
    private javax.swing.JPanel TabPaneProfile;
    private javax.swing.JPanel TabPaneReference;
    private javax.swing.JPanel TabPaneSalaryCheck;
    private javax.swing.JTextField TextFieldProfileAddress;
    private javax.swing.JTextField TextFieldProfileDateOfBirth;
    private javax.swing.JTextField TextFieldProfileEmail;
    private javax.swing.JTextField TextFieldProfileEmployeeID;
    private javax.swing.JTextField TextFieldProfileEmployeeName;
    private javax.swing.JTextField TextFieldProfileManagerID;
    private javax.swing.JTextField TextFieldProfilePhone;
    private javax.swing.JTextField TextFieldProfilePosition;
    private javax.swing.JTextField TextFieldSalaryCheckEmployeeID;
    private javax.swing.JTextField TextFieldSalaryCheckEmployeeName;
    private javax.swing.JTextField TextFieldSalaryCheckManagerID;
    private javax.swing.JTextField TextFieldSalaryCheckSalary;
    private javax.swing.JTextField TextFieldSalaryCheckStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel warninglable;
    // End of variables declaration//GEN-END:variables
}
