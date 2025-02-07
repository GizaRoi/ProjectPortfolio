/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

/**
 *
 * @author Roimarc
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NoVMError = new javax.swing.JDialog();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        testBtn = new javax.swing.JButton();
        VMNameType = new javax.swing.JLabel();
        maintenanceBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("CREATE A VENDING MACHINE FIRST!");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NoVMErrorLayout = new javax.swing.GroupLayout(NoVMError.getContentPane());
        NoVMError.getContentPane().setLayout(NoVMErrorLayout);
        NoVMErrorLayout.setHorizontalGroup(
            NoVMErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoVMErrorLayout.createSequentialGroup()
                .addGroup(NoVMErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NoVMErrorLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton1))
                    .addGroup(NoVMErrorLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        NoVMErrorLayout.setVerticalGroup(
            NoVMErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoVMErrorLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Vending Machine Tycoon");

        createBtn.setText("Create Vending Machine");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        testBtn.setText("Test Vending Machine");
        testBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testBtnActionPerformed(evt);
            }
        });

        VMNameType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        maintenanceBtn.setText("Maintenance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(VMNameType, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maintenanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(testBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(exitBtn)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VMNameType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(testBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maintenanceBtn)
                .addGap(18, 18, 18)
                .addComponent(exitBtn)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createBtnActionPerformed

    private void testBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_testBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.NoVMError.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setMaintenanceBtnListener(ActionListener listener)
    {
        this.maintenanceBtn.addActionListener(listener);
    }
    
    public void setCreateBtnListener(ActionListener actionListener)
    {
        this.createBtn.addActionListener(actionListener);
    }
    
    public void setTestBtnListener(ActionListener actionListener)
    {
        this.testBtn.addActionListener(actionListener);
    }
    
    public void setExitBtnListener(ActionListener actionListener)
    {
        this.exitBtn.addActionListener(actionListener);
    }
    
    public void setVMNameType(String name, String type)
    {
        this.VMNameType.setText("Name: "+name+" | Type: "+type);
    }
    
    public JDialog getNoVMError()
    {
        return this.NoVMError;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog NoVMError;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel VMNameType;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton maintenanceBtn;
    private javax.swing.JButton testBtn;
    // End of variables declaration//GEN-END:variables
}
