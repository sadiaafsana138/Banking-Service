
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mumu
 */
public class Reg_admin extends javax.swing.JFrame {

    /**
     * Creates new form UserInfo
     */
    public Reg_admin() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=800;
        int y=600;
        this.setSize(x,y);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PhoneNo = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        MiddleName = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        NationalId = new javax.swing.JTextField();
        BirthCertificateNo = new javax.swing.JTextField();
        PresentAddress = new javax.swing.JTextField();
        PermanentAddress = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        ReferanceId = new javax.swing.JTextField();
        SignUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PHONE NUMBER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 200, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("FIRST NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 42, 200, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("LAST NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("MIDDLE NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DATE OF BIRTH");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 170, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("NATIONAL ID NO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 212, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("BIRTH CERTIFICATE NO");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 250, 220, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("PRESENT ADDRESS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 290, 190, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("PERMANENT ADDRESS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 330, 210, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("PASSWORD");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 370, 160, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("REFERANCE ID");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 410, 170, 30);

        PhoneNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(PhoneNo);
        PhoneNo.setBounds(240, 10, 500, 30);

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(FirstName);
        FirstName.setBounds(240, 50, 500, 30);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(LastName);
        LastName.setBounds(240, 130, 500, 30);

        MiddleName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(MiddleName);
        MiddleName.setBounds(240, 90, 500, 30);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(DOB);
        DOB.setBounds(240, 170, 500, 30);

        NationalId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(NationalId);
        NationalId.setBounds(240, 210, 500, 30);

        BirthCertificateNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(BirthCertificateNo);
        BirthCertificateNo.setBounds(240, 250, 500, 30);

        PresentAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(PresentAddress);
        PresentAddress.setBounds(240, 290, 500, 30);

        PermanentAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(PermanentAddress);
        PermanentAddress.setBounds(240, 330, 500, 30);

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Password);
        Password.setBounds(240, 370, 500, 30);

        ReferanceId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(ReferanceId);
        ReferanceId.setBounds(240, 410, 500, 30);

        SignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SignUp.setText("SIGN UP");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp);
        SignUp.setBounds(410, 470, 180, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 520, 90, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reg admin.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        
    Connection connection;
    PreparedStatement pst;
    ResultSet result = null, stockResult;
  try {
   
   //connection Establishment
   connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BankingService","sa","123456");
   pst=connection.prepareStatement("insert into UserInfo values(?,?,?,?,?,?,?,?,?,?,?,?)");
   pst.setInt(1,Integer.parseInt(PhoneNo.getText()));
   int phone = Integer.parseInt(PhoneNo.getText());
   pst.setString(2, FirstName.getText());
   pst.setString(3, LastName.getText());
   pst.setString(4, MiddleName.getText());
   pst.setString(5, DOB.getText());
   pst.setString(6, NationalId.getText());
   pst.setString(7, BirthCertificateNo.getText());
   pst.setString(8, PresentAddress.getText());
   pst.setString(9, PermanentAddress.getText());
   pst.setString(10, Password.getText());
   pst.setString(11, ReferanceId.getText());
   pst.setInt(12,3);
  
   pst.executeUpdate();
   
   PhoneNo.setText(" ");
   FirstName.setText(" ");
   FirstName.setText(" ");
   LastName.setText(" ");
   MiddleName.setText(" ");
   DOB.setText(" ");
   NationalId.setText(" ");
   BirthCertificateNo.setText(" ");
   PresentAddress.setText(" ");
   PermanentAddress.setText(" ");
   Password.setText(" ");
   ReferanceId.setText(" ");
   
      
      JOptionPane.showMessageDialog(null, "Registration successful");
   

  }
  catch(SQLException e) {
   JOptionPane.showMessageDialog(null, "Registration not successful");
  } 
        
    }//GEN-LAST:event_SignUpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Account_Info_admin one =new Account_Info_admin();
        one.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BirthCertificateNo;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField MiddleName;
    private javax.swing.JTextField NationalId;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField PermanentAddress;
    private javax.swing.JTextField PhoneNo;
    private javax.swing.JTextField PresentAddress;
    private javax.swing.JTextField ReferanceId;
    private javax.swing.JButton SignUp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
