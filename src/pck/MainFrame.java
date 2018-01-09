/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Dale
 */
public class MainFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        Start();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        PC = new javax.swing.JMenuItem();
        SalesMenu = new javax.swing.JMenuItem();
        ChangeRate = new javax.swing.JMenu();
        LogoutMenu = new javax.swing.JMenuItem();
        ChangeRateMenu = new javax.swing.JMenuItem();
        ChangePassMenu = new javax.swing.JMenu();
        Admin = new javax.swing.JMenuItem();
        Staff = new javax.swing.JMenuItem();
        ExitMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        dpane.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/1.jpg"))); // NOI18N

        javax.swing.GroupLayout dpaneLayout = new javax.swing.GroupLayout(dpane);
        dpane.setLayout(dpaneLayout);
        dpaneLayout.setHorizontalGroup(
            dpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dpaneLayout.setVerticalGroup(
            dpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dpane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        PC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PC.setText("PC");
        PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCActionPerformed(evt);
            }
        });
        jMenu1.add(PC);

        SalesMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SalesMenu.setText("Sales");
        SalesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesMenuMenuActionPerformed(evt);
            }
        });
        jMenu1.add(SalesMenu);

        jMenuBar2.add(jMenu1);

        ChangeRate.setText("Options");
        ChangeRate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ChangeRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeRateActionPerformed(evt);
            }
        });

        LogoutMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LogoutMenu.setText("Logout");
        LogoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutMenuActionPerformed(evt);
            }
        });
        ChangeRate.add(LogoutMenu);

        ChangeRateMenu.setText("Change Rate");
        ChangeRateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeRateMenuActionPerformed(evt);
            }
        });
        ChangeRate.add(ChangeRateMenu);

        ChangePassMenu.setText("Change Password");
        ChangePassMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Admin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Admin.setText("Admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        ChangePassMenu.add(Admin);

        Staff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Staff.setText("Staff");
        Staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffActionPerformed(evt);
            }
        });
        ChangePassMenu.add(Staff);

        ChangeRate.add(ChangePassMenu);

        ExitMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ExitMenu.setText("Exit");
        ExitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuActionPerformed(evt);
            }
        });
        ChangeRate.add(ExitMenu);

        jMenuBar2.add(ChangeRate);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Start(){
    if(LoginPage.Staff.isSelected()){
            ChangeRateMenu.setVisible(false);
            ChangePassMenu.setVisible(false);
            SalesMenu.setVisible(false);
        }
    
}
PCR pcr = new PCR();
    
    private void PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCActionPerformed
       
        dpane.add(pcr);
        pcr.setLocation(0,0);
        pcr.show();
        PC.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_PCActionPerformed

    private void ExitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuActionPerformed
        int answer;
        if(pcr.isShowing()){
            answer=JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit?","System Message",JOptionPane.YES_NO_OPTION);
            if(answer==JOptionPane.YES_OPTION){
               System.exit(0); 
            }
        }
        else{
        System.exit(0); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_ExitMenuActionPerformed

    private void SalesMenuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesMenuMenuActionPerformed
        Sales x = new Sales();
        dpane.add(x);
        x.setLocation(630,0);
        x.show();
       // TODO add your handling code here:
    }//GEN-LAST:event_SalesMenuMenuActionPerformed

    private void LogoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutMenuActionPerformed
        int answer;
        if(pcr.isShowing()){
            answer=JOptionPane.showConfirmDialog(null, "Are you sure you want to Log Out?","System Message",JOptionPane.YES_NO_OPTION);
            if(answer==JOptionPane.YES_OPTION){
                LoginPage x = new LoginPage();
                x.setVisible(true);
                this.setVisible(false);
            }
        }
        else{
        LoginPage x = new LoginPage();
        x.setVisible(true);
        this.setVisible(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMenuActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        AdminPass x = new AdminPass();
        dpane.add(x);
        x.setLocation(630,340);
        x.show();
            // TODO add your handling code here:
    }//GEN-LAST:event_AdminActionPerformed

    private void StaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffActionPerformed
        StaffPass x = new StaffPass();
        dpane.add(x);
        x.setLocation(630,340);
        x.show();
           // TODO add your handling code here:
    }//GEN-LAST:event_StaffActionPerformed

    private void ChangeRateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeRateMenuActionPerformed
        ChangeRate x = new ChangeRate();
        dpane.add(x);
        x.setLocation(630,175);
        x.show();
       // TODO add your handling code here:
    }//GEN-LAST:event_ChangeRateMenuActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    Start();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void ChangeRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeRateActionPerformed
        Start();
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeRateActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Admin;
    private javax.swing.JMenu ChangePassMenu;
    private javax.swing.JMenu ChangeRate;
    private javax.swing.JMenuItem ChangeRateMenu;
    private javax.swing.JMenuItem ExitMenu;
    private javax.swing.JMenuItem LogoutMenu;
    private javax.swing.JMenuItem PC;
    private javax.swing.JMenuItem SalesMenu;
    private javax.swing.JMenuItem Staff;
    private javax.swing.JDesktopPane dpane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
