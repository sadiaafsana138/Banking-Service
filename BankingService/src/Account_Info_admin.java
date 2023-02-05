
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mumu
 */
public class Account_Info_admin extends javax.swing.JFrame {

    /**
     * Creates new form Account_Info
     */
    public Account_Info_admin() {
        initComponents();
        setTitle("Home");
        PhoneLabel.setText("0" + Variables.PhoneNo);
        NameLable.setText(Variables.Name);
        profit();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = 800;
        int y = 600;
        this.setSize(x, y);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SendMoney = new javax.swing.JButton();
        NameLable = new javax.swing.JLabel();
        History = new javax.swing.JButton();
        PhoneLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Return = new javax.swing.JButton();
        New_admin = new javax.swing.JButton();
        Profit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        SendMoney.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SendMoney.setText("SEND MONEY");
        SendMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendMoneyActionPerformed(evt);
            }
        });
        getContentPane().add(SendMoney);
        SendMoney.setBounds(230, 250, 350, 37);

        NameLable.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        NameLable.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NameLable);
        NameLable.setBounds(60, 100, 175, 37);

        History.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        History.setText("HISTORY");
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });
        getContentPane().add(History);
        History.setBounds(230, 410, 350, 35);

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PhoneLabel);
        PhoneLabel.setBounds(52, 109, 175, 0);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL PROFIT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(354, 78, 177, 89);

        Return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Return.setText("BACK");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(Return);
        Return.setBounds(637, 489, 96, 37);

        New_admin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        New_admin.setText("ADD NEW ADMIN");
        New_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_adminActionPerformed(evt);
            }
        });
        getContentPane().add(New_admin);
        New_admin.setBounds(230, 330, 350, 37);

        Profit.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Profit.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Profit);
        Profit.setBounds(591, 100, 153, 46);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin info bg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 800, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendMoneyActionPerformed
        // TODO add your handling code here:
        Send_Money_admin one = new Send_Money_admin();
        one.setVisible(true);
        dispose();

    }//GEN-LAST:event_SendMoneyActionPerformed
    private void profit() {
        Connection connection;
        PreparedStatement pst;
        ResultSet result = null, stockResult;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BankingService", "sa", "123456");

            pst = connection.prepareStatement("select SUM(Ammount) as Profit from ProfitTable");
            result = pst.executeQuery();
            System.out.println("Account_Info_admin.<init>()");
            float profit = 0;
            while (result.next()) {
                profit = result.getFloat("Profit");

            }
            Profit.setText(Float.toString(profit));
        } catch (Exception e) {
            System.out.println("");
        }

    }


    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
        // TODO add your handling code here:
        History_admin three = new History_admin();
        three.setVisible(true);
        dispose();
    }//GEN-LAST:event_HistoryActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        Login_Signup six = new Login_Signup();
        six.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReturnActionPerformed

    private void New_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_adminActionPerformed
        // TODO add your handling code here:
        Reg_admin one = new Reg_admin();
        one.setVisible(true);
        dispose();
    }//GEN-LAST:event_New_adminActionPerformed

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
            java.util.logging.Logger.getLogger(Account_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account_Info_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton History;
    private javax.swing.JLabel NameLable;
    private javax.swing.JButton New_admin;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JLabel Profit;
    private javax.swing.JButton Return;
    private javax.swing.JButton SendMoney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
