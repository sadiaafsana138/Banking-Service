
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Mobile_Recharge extends javax.swing.JFrame {

    /**
     * Creates new form Mobile_Recharge
     */
    public Mobile_Recharge() {
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

        Number = new javax.swing.JTextField();
        Ammount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Number.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(Number);
        Number.setBounds(160, 180, 530, 50);

        Ammount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Ammount);
        Ammount.setBounds(160, 300, 530, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("RECHARGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 390, 150, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(630, 490, 110, 38);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ENTER NUMBER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 120, 246, 52);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ENTER AMOUNT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 240, 265, 42);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user mble rechrge.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Account_Info one = new Account_Info();
        one.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection connection;
        PreparedStatement pst;
        ResultSet result = null, stockResult;
         int uname = Integer.parseInt(Number.getText());
        String RNumber = Integer.toString(uname);
        int flag=0;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BankingService", "sa", "123456");
            pst = connection.prepareStatement("SELECT * FROM UserInfo where PhoneNo = " + RNumber);
            result = pst.executeQuery();
            int money = Integer.parseInt(Ammount.getText());
            if (Variables.Blance>money) {
               while (result.next()) {
                if (result.getString("PhoneNo").equals(RNumber)) {
                    pst = connection.prepareStatement("insert into TransTable values(?,?,?,?,?,?)");
                    pst.setInt(1, Variables.UserId);
                    pst.setString(2, Variables.PhoneNo);
                    pst.setString(3, RNumber);
                    pst.setString(4, "Mobile_Recharge");
                    pst.setString(5, Ammount.getText());
                    int reciverID= result.getInt("UserId");

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                    Date date = new Date();
                    //System.out.println(date.toString()); //2016/11/16 12:08:43
                    pst.setString(6, dateFormat.format(date));

                    pst.executeUpdate();
                   
                    Variables.Blance=Variables.Blance-money;
                    pst=connection.prepareStatement("UPDATE BlanceTable SET CurrentBlance = ?  where UserId ="+Variables.UserId);
                    pst.setFloat(1, Variables.Blance );
                     pst.executeUpdate();
                     
                     pst = connection.prepareStatement("SELECT * FROM BlanceTable where UserId = " +reciverID);
                     result = pst.executeQuery();
                     while (result.next()) { 
                         int reciverBalnce= result.getInt("CurrentBlance");
                         reciverBalnce=reciverBalnce+money;
                         pst=connection.prepareStatement("UPDATE BlanceTable SET CurrentBlance = ?  where UserId ="+reciverID);
                         pst.setInt(1, reciverBalnce );
                         pst.executeUpdate();
                         
                        
                    }
                     
                    JOptionPane.showMessageDialog(null, "Mobile Recharge "+money+" Successful Charge ");
                    Number.setText(" ");
                    Ammount.setText(" ");

                } 
            }
                if (!result.next() && flag!=0) {
                    JOptionPane.showMessageDialog(null, "User Not Found");
                }
            }
            else{
                 JOptionPane.showMessageDialog(null, "You DO Not Have Sufficient Money");
            }
          

        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Mobile_Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobile_Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobile_Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobile_Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mobile_Recharge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ammount;
    private javax.swing.JTextField Number;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
