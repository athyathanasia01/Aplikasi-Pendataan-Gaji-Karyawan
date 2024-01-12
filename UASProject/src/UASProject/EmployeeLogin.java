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
public class EmployeeLogin extends javax.swing.JPanel {

    public EmployeeInterface employee;
    public int result;
    public int test(){
        return result;
    };
    
    Statement st;
    Connection cn;
    
    /**
     * Creates new form CustLogin
     */
    public EmployeeLogin() {
        initComponents();
        this.cn = connectivity.connected();
    }
    
    public void addEvent (EmployeeInterface event){
        this.employee = event;
    }
    
    public void ClearTextField(){
        TextFieldUsernameEmployee.setText(" ");
        TextFieldTokenEmployee.setText(" ");
        PasswordFieldPasswordEmployee.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldUsernameEmployee = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PasswordFieldPasswordEmployee = new javax.swing.JPasswordField();
        TextFieldTokenEmployee = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JToggleButton();
        warningLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(143, 189, 143));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setText("CV. KARYA BANGSA");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel2.setText("Jl. Persada Agung no. 2, Lemah Abang, Cikarang Utara. Kabupaten Bekasi ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel3.setText("Please login into your account!");

        jLabel5.setText("Use Your Employee ID as Username and manager ID as Token here below!");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel4.setText("Username ");

        TextFieldUsernameEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsernameEmployeeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel6.setText("Password");

        PasswordFieldPasswordEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldPasswordEmployeeActionPerformed(evt);
            }
        });

        TextFieldTokenEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTokenEmployeeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel7.setText("Token ");

        ButtonLogin.setBackground(new java.awt.Color(255, 72, 57));
        ButtonLogin.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        ButtonLogin.setText("Login");
        ButtonLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        warningLabel.setBackground(new java.awt.Color(255, 51, 51));
        warningLabel.setText("\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TextFieldUsernameEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(PasswordFieldPasswordEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(TextFieldTokenEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldUsernameEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PasswordFieldPasswordEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextFieldTokenEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        // TODO add your handling code here:
        employee.EmployeeLogin_BT();
        String username = " ";
        String password = " ";
        String token    = " ";
        String SQL      = "SELECT * FROM employeelogin WHERE EmployeeID = ?";
        
        try{
            try (PreparedStatement pst = cn.prepareStatement(SQL, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)){
               pst.setString(1, TextFieldUsernameEmployee.getText());
               try (ResultSet rs = pst.executeQuery()){
                   if (rs.first()){
                       username = rs.getString(1);
                       token    = rs.getString(2);
                       password = rs.getString(3);
                   }
                   rs.close();
               }
               pst.close();
            }
        }
        catch(SQLException e){
            Logger.getLogger(AdminEditMenu.class.getName()).log(Level.SEVERE, null, e); 
        }
        if (TextFieldUsernameEmployee.getText().equals(username) && PasswordFieldPasswordEmployee.getText().equals(password) && TextFieldTokenEmployee.getText().equals(token)){
            EmployeeMainMenu login = new EmployeeMainMenu(username);
            result = 1;
        }
        else{
            warningLabel.setText("You got wrong input for username, password, or token. Please try again!");
            result = 0;
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void PasswordFieldPasswordEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldPasswordEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldPasswordEmployeeActionPerformed

    private void TextFieldUsernameEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsernameEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsernameEmployeeActionPerformed

    private void TextFieldTokenEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTokenEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTokenEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonLogin;
    private javax.swing.JPasswordField PasswordFieldPasswordEmployee;
    private javax.swing.JTextField TextFieldTokenEmployee;
    private javax.swing.JTextField TextFieldUsernameEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
