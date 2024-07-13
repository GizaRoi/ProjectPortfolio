/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JDialog;

/**
 *
 * @author Roimarc
 */
public class CreateFrame extends javax.swing.JFrame {

    /**
     * Creates new form CreateFrame
     */
    public CreateFrame() {
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

        NoTypeError = new javax.swing.JDialog();
        exitNoType = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NoNameError = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        exitNoName = new javax.swing.JButton();
        NoValueError = new javax.swing.JDialog();
        exitNoValue = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vmTypeCmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        NoTypeError.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        NoTypeError.setResizable(false);

        exitNoType.setText("OK");
        exitNoType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitNoTypeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("PLEASE CHOOSE A VENDING MACHINE TYPE");

        javax.swing.GroupLayout NoTypeErrorLayout = new javax.swing.GroupLayout(NoTypeError.getContentPane());
        NoTypeError.getContentPane().setLayout(NoTypeErrorLayout);
        NoTypeErrorLayout.setHorizontalGroup(
            NoTypeErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoTypeErrorLayout.createSequentialGroup()
                .addGroup(NoTypeErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NoTypeErrorLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(exitNoType))
                    .addGroup(NoTypeErrorLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        NoTypeErrorLayout.setVerticalGroup(
            NoTypeErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoTypeErrorLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(exitNoType)
                .addGap(110, 110, 110))
        );

        NoNameError.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        NoNameError.setResizable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("PLEASE INPUT A VENDING MACHINE NAME!!!");

        exitNoName.setText("OK");
        exitNoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitNoNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NoNameErrorLayout = new javax.swing.GroupLayout(NoNameError.getContentPane());
        NoNameError.getContentPane().setLayout(NoNameErrorLayout);
        NoNameErrorLayout.setHorizontalGroup(
            NoNameErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoNameErrorLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoNameErrorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitNoName)
                .addGap(158, 158, 158))
        );
        NoNameErrorLayout.setVerticalGroup(
            NoNameErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoNameErrorLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(exitNoName)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        NoValueError.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        NoValueError.setResizable(false);

        exitNoValue.setText("OK");
        exitNoValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitNoValueActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("PLEASE INPUT NECESSARY VALUES!!!");

        javax.swing.GroupLayout NoValueErrorLayout = new javax.swing.GroupLayout(NoValueError.getContentPane());
        NoValueError.getContentPane().setLayout(NoValueErrorLayout);
        NoValueErrorLayout.setHorizontalGroup(
            NoValueErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoValueErrorLayout.createSequentialGroup()
                .addGroup(NoValueErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NoValueErrorLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(exitNoValue))
                    .addGroup(NoValueErrorLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel6)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        NoValueErrorLayout.setVerticalGroup(
            NoValueErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoValueErrorLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(exitNoValue)
                .addGap(110, 110, 110))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Vending Machine Creation");

        vmTypeCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose VM Type", "Regular", "Special" }));
        vmTypeCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vmTypeCmbActionPerformed(evt);
            }
        });

        jLabel2.setText("VM Type:");

        jLabel3.setText("Name:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        confirmBtn.setText("CONFIRM");

        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vmTypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vmTypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn)
                    .addComponent(backBtn))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vmTypeCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vmTypeCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vmTypeCmbActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitNoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitNoNameActionPerformed
        // TODO add your handling code here:
        NoNameError.setVisible(false);
    }//GEN-LAST:event_exitNoNameActionPerformed

    private void exitNoTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitNoTypeActionPerformed
        // TODO add your handling code here:
        NoTypeError.setVisible(false);
    }//GEN-LAST:event_exitNoTypeActionPerformed

    private void exitNoValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitNoValueActionPerformed
        // TODO add your handling code here:
        NoValueError.setVisible(false);
    }//GEN-LAST:event_exitNoValueActionPerformed
   
    public void setConfirmBtnListener(ActionListener actionListener)
    {
        this.confirmBtn.addActionListener(actionListener);
    }
    
    public void setBackBtnListener(ActionListener actionListener)
    {
        this.backBtn.addActionListener(actionListener);
    }

    public String getVMName()
    {
        return this.nameField.getText();
    }
    
    public int getVMIndex()
    {
        return this.vmTypeCmb.getSelectedIndex();
    }
    
    public String getVMType()
    {
        return this.vmTypeCmb.getItemAt(getVMIndex());
    }
    
    public JDialog getNoTypeError()
    {       
        return this.NoTypeError;
    }
    
    public JDialog getNoNameError()
    {
        return this.NoNameError;
    }
    
    public JDialog getNoValueError()
    {
        return this.NoValueError;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog NoNameError;
    private javax.swing.JDialog NoTypeError;
    private javax.swing.JDialog NoValueError;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton exitNoName;
    private javax.swing.JButton exitNoType;
    private javax.swing.JButton exitNoValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> vmTypeCmb;
    // End of variables declaration//GEN-END:variables
}
