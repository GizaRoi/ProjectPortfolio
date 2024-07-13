/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Model.VMModel;
import View.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Roimarc
 */
public class VMController {
    private MainFrame mainView;
    private CreateFrame createView = new CreateFrame();
    private VendingMachineFrame VMView = new VendingMachineFrame();
    private MaintenanceFrame maintView = new MaintenanceFrame();
    private VMModel model;
    private int VMType;

    
    public VMController(MainFrame mainView, VMModel model)
    {
        this.mainView = mainView;
        this.model = model;
        
        this.mainView.setCreateBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mainView.setVisible(false);
                createView.setVisible(true);
            }  
        });
        
        this.mainView.setTestBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(model.getRegVM() == null && model.getSpecVM() == null)
                {
                    mainView.getNoVMError().setSize(400,300);
                    mainView.getNoVMError().setVisible(true);
                }
                else
                {
                mainView.setVisible(false);
                if(model.getSpecVM() == null)
                    {
                        VMView.getVMName().setText(model.getRegVM().getName() + " Vending Machine");
                        VMView.getItem1Name().setText(model.getRegVM().getItemSlot(0).getItemName());
                        VMView.getItem1Price().setText("Price: "+model.getRegVM().getItemSlot(0).getItemPrice());
                        VMView.getItem1Cal().setText("Cal: "+model.getRegVM().getItemSlot(0).getItemCal());
                        VMView.getItem2Name().setText(model.getRegVM().getItemSlot(1).getItemName());
                        VMView.getItem2Price().setText("Price: "+model.getRegVM().getItemSlot(1).getItemPrice());
                        VMView.getItem2Cal().setText("Cal: "+model.getRegVM().getItemSlot(1).getItemCal());
                        VMView.getItem3Name().setText(model.getRegVM().getItemSlot(2).getItemName());
                        VMView.getItem3Price().setText("Price: "+model.getRegVM().getItemSlot(2).getItemPrice());
                        VMView.getItem3Cal().setText("Cal: "+model.getRegVM().getItemSlot(2).getItemCal());
                        VMView.getItem4Name().setText(model.getRegVM().getItemSlot(3).getItemName());
                        VMView.getItem4Price().setText("Price: "+model.getRegVM().getItemSlot(3).getItemPrice());
                        VMView.getItem4Cal().setText("Cal: "+model.getRegVM().getItemSlot(3).getItemCal());
                        VMView.getItem5Name().setText(model.getRegVM().getItemSlot(4).getItemName());
                        VMView.getItem5Price().setText("Price: "+model.getRegVM().getItemSlot(4).getItemPrice());
                        VMView.getItem5Cal().setText("Cal: "+model.getRegVM().getItemSlot(4).getItemCal());
                        VMView.getItem6Name().setText(model.getRegVM().getItemSlot(5).getItemName());
                        VMView.getItem6Price().setText("Price: "+model.getRegVM().getItemSlot(5).getItemPrice());
                        VMView.getItem6Cal().setText("Cal: "+model.getRegVM().getItemSlot(5).getItemCal());
                        VMView.getItem7Name().setText(model.getRegVM().getItemSlot(6).getItemName());
                        VMView.getItem7Price().setText("Price: "+model.getRegVM().getItemSlot(6).getItemPrice());
                        VMView.getItem7Cal().setText("Cal: "+model.getRegVM().getItemSlot(6).getItemCal());
                        VMView.getItem8Name().setText(model.getRegVM().getItemSlot(7).getItemName());
                        VMView.getItem8Price().setText("Price: "+model.getRegVM().getItemSlot(7).getItemPrice());
                        VMView.getItem8Cal().setText("Cal: "+model.getRegVM().getItemSlot(7).getItemCal());
                        if(model.getRegVM().getItemSlot(0).getItemAmt() <= 0)
                            VMView.getBuy1().setText("X");
                        else
                            VMView.getBuy1().setText("BUY");
                        if(model.getRegVM().getItemSlot(1).getItemAmt() <= 0)
                            VMView.getBuy2().setText("X");
                        else
                            VMView.getBuy2().setText("BUY");
                        if(model.getRegVM().getItemSlot(2).getItemAmt() <= 0)
                            VMView.getBuy3().setText("X");
                        else
                            VMView.getBuy3().setText("BUY");
                        if(model.getRegVM().getItemSlot(3).getItemAmt() <= 0)
                            VMView.getBuy4().setText("X");
                        else
                            VMView.getBuy4().setText("BUY");
                        if(model.getRegVM().getItemSlot(4).getItemAmt() <= 0)
                            VMView.getBuy5().setText("X");
                        else
                            VMView.getBuy5().setText("BUY");
                        if(model.getRegVM().getItemSlot(5).getItemAmt() <= 0)
                            VMView.getBuy6().setText("X");
                        else
                            VMView.getBuy6().setText("BUY");
                        if(model.getRegVM().getItemSlot(6).getItemAmt() <= 0)
                            VMView.getBuy7().setText("X");
                        else
                            VMView.getBuy7().setText("BUY");
                        if(model.getRegVM().getItemSlot(7).getItemAmt() <= 0)
                            VMView.getBuy8().setText("X");  
                        else
                            VMView.getBuy8().setText("BUY");
                    }
                    else if(model.getRegVM() == null)
                    {
                        VMView.getVMName().setText(model.getSpecVM().getName() + " Pizzeria");
                        VMView.getItem1Name().setText(model.getSpecVM().getItemSlot(0).getItemName());
                        VMView.getItem1Price().setText("Price: "+model.getSpecVM().getItemSlot(0).getItemPrice());
                        VMView.getItem1Cal().setText("Cal: "+model.getSpecVM().getItemSlot(0).getItemCal());
                        VMView.getItem2Name().setText(model.getSpecVM().getItemSlot(1).getItemName());
                        VMView.getItem2Price().setText("Price: "+model.getSpecVM().getItemSlot(1).getItemPrice());
                        VMView.getItem2Cal().setText("Cal: "+model.getSpecVM().getItemSlot(1).getItemCal());
                        VMView.getItem3Name().setText(model.getSpecVM().getItemSlot(2).getItemName());
                        VMView.getItem3Price().setText("Price: "+model.getSpecVM().getItemSlot(2).getItemPrice());
                        VMView.getItem3Cal().setText("Cal: "+model.getSpecVM().getItemSlot(2).getItemCal());
                        VMView.getItem4Name().setText(model.getSpecVM().getItemSlot(3).getItemName());
                        VMView.getItem4Price().setText("Price: "+model.getSpecVM().getItemSlot(3).getItemPrice());
                        VMView.getItem4Cal().setText("Cal: "+model.getSpecVM().getItemSlot(3).getItemCal());
                        VMView.getItem5Name().setText(model.getSpecVM().getItemSlot(4).getItemName());
                        VMView.getItem5Price().setText("Price: "+model.getSpecVM().getItemSlot(4).getItemPrice());
                        VMView.getItem5Cal().setText("Cal: "+model.getSpecVM().getItemSlot(4).getItemCal());
                        VMView.getItem6Name().setText(model.getSpecVM().getItemSlot(5).getItemName());
                        VMView.getItem6Price().setText("Price: "+model.getSpecVM().getItemSlot(5).getItemPrice());
                        VMView.getItem6Cal().setText("Cal: "+model.getSpecVM().getItemSlot(5).getItemCal());
                        VMView.getItem7Name().setText(model.getSpecVM().getItemSlot(6).getItemName());
                        VMView.getItem7Price().setText("Price: "+model.getSpecVM().getItemSlot(6).getItemPrice());
                        VMView.getItem7Cal().setText("Cal: "+model.getSpecVM().getItemSlot(6).getItemCal());
                        VMView.getItem8Name().setText(model.getSpecVM().getItemSlot(7).getItemName());
                        VMView.getItem8Price().setText("Price: "+model.getSpecVM().getItemSlot(7).getItemPrice());
                        VMView.getItem8Cal().setText("Cal: "+model.getSpecVM().getItemSlot(7).getItemCal());
                         if(model.getSpecVM().getItemSlot(0).getItemAmt() <= 0)
                            VMView.getBuy1().setText("X");
                         else
                             VMView.getBuy1().setText("BUY");
                        if(model.getSpecVM().getItemSlot(1).getItemAmt() <= 0)
                            VMView.getBuy2().setText("X");
                        else
                            VMView.getBuy2().setText("BUY");
                        if(model.getSpecVM().getItemSlot(2).getItemAmt() <= 0)
                            VMView.getBuy3().setText("X");
                        else
                            VMView.getBuy3().setText("BUY");
                        if(model.getSpecVM().getItemSlot(3).getItemAmt() <= 0)
                            VMView.getBuy4().setText("X");
                        else
                            VMView.getBuy4().setText("BUY");
                        if(model.getSpecVM().getItemSlot(4).getItemAmt() <= 0)
                            VMView.getBuy5().setText("X");
                        else
                            VMView.getBuy5().setText("BUY");
                        if(model.getSpecVM().getItemSlot(5).getItemAmt() <= 0)
                            VMView.getBuy6().setText("X");
                        else
                            VMView.getBuy6().setText("BUY");
                        if(model.getSpecVM().getItemSlot(6).getItemAmt() <= 0)
                            VMView.getBuy7().setText("X");
                        else
                            VMView.getBuy7().setText("BUY");
                        if(model.getSpecVM().getItemSlot(7).getItemAmt() <= 0)
                            VMView.getBuy8().setText("X"); 
                        else
                            VMView.getBuy8().setText("BUY");
                    }
                VMView.setVisible(true);
                }
            }
        });
        
        this.mainView.setMaintenanceBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               if(model.getRegVM() == null && model.getSpecVM() == null)
                {
                    mainView.getNoVMError().setSize(400,300);
                    mainView.getNoVMError().setVisible(true);
                }
                else
                {
                mainView.setVisible(false);
                maintView.setVisible(true);
                }
            }
            
        });
        
        this.mainView.setExitBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.createView.setBackBtnListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                createView.setVisible(false);
                mainView.setVisible(true);
            }
        });
        
        this.createView.setConfirmBtnListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e)
            {
                VMType = createView.getVMIndex();
                if(VMType == 0 && createView.getVMName().isBlank() == true)
                {
                    createView.getNoValueError().setSize(400, 300);
                    createView.getNoValueError().setVisible(true);
                }
                else if(VMType == 0)
                {
                    createView.getNoTypeError().setSize(400, 300);
                    createView.getNoTypeError().setVisible(true);
                }
                else if(createView.getVMName().isBlank() == true)
                {
                    createView.getNoNameError().setSize(400,300);
                    createView.getNoNameError().setVisible(true);
                }
                else{
                    model.setActiveVM(VMType, createView.getVMName());
                    mainView.setVMNameType(createView.getVMName(), createView.getVMType());
                    if(model.getSpecVM() == null)
                    {
                        VMView.getVMName().setText(model.getRegVM().getName() + " Vending Machine");
                        VMView.getItem1Name().setText(model.getRegVM().getItemSlot(0).getItemName());
                        VMView.getItem1Price().setText("Price: "+model.getRegVM().getItemSlot(0).getItemPrice());
                        VMView.getItem1Cal().setText("Cal: "+model.getRegVM().getItemSlot(0).getItemCal());
                        VMView.getItem2Name().setText(model.getRegVM().getItemSlot(1).getItemName());
                        VMView.getItem2Price().setText("Price: "+model.getRegVM().getItemSlot(1).getItemPrice());
                        VMView.getItem2Cal().setText("Cal: "+model.getRegVM().getItemSlot(1).getItemCal());
                        VMView.getItem3Name().setText(model.getRegVM().getItemSlot(2).getItemName());
                        VMView.getItem3Price().setText("Price: "+model.getRegVM().getItemSlot(2).getItemPrice());
                        VMView.getItem3Cal().setText("Cal: "+model.getRegVM().getItemSlot(2).getItemCal());
                        VMView.getItem4Name().setText(model.getRegVM().getItemSlot(3).getItemName());
                        VMView.getItem4Price().setText("Price: "+model.getRegVM().getItemSlot(3).getItemPrice());
                        VMView.getItem4Cal().setText("Cal: "+model.getRegVM().getItemSlot(3).getItemCal());
                        VMView.getItem5Name().setText(model.getRegVM().getItemSlot(4).getItemName());
                        VMView.getItem5Price().setText("Price: "+model.getRegVM().getItemSlot(4).getItemPrice());
                        VMView.getItem5Cal().setText("Cal: "+model.getRegVM().getItemSlot(4).getItemCal());
                        VMView.getItem6Name().setText(model.getRegVM().getItemSlot(5).getItemName());
                        VMView.getItem6Price().setText("Price: "+model.getRegVM().getItemSlot(5).getItemPrice());
                        VMView.getItem6Cal().setText("Cal: "+model.getRegVM().getItemSlot(5).getItemCal());
                        VMView.getItem7Name().setText(model.getRegVM().getItemSlot(6).getItemName());
                        VMView.getItem7Price().setText("Price: "+model.getRegVM().getItemSlot(6).getItemPrice());
                        VMView.getItem7Cal().setText("Cal: "+model.getRegVM().getItemSlot(6).getItemCal());
                        VMView.getItem8Name().setText(model.getRegVM().getItemSlot(7).getItemName());
                        VMView.getItem8Price().setText("Price: "+model.getRegVM().getItemSlot(7).getItemPrice());
                        VMView.getItem8Cal().setText("Cal: "+model.getRegVM().getItemSlot(7).getItemCal());
                        if(model.getRegVM().getItemSlot(0).getItemAmt() <= 0)
                            VMView.getBuy1().setText("X");
                        else
                            VMView.getBuy1().setText("BUY");
                        if(model.getRegVM().getItemSlot(1).getItemAmt() <= 0)
                            VMView.getBuy2().setText("X");
                        else
                            VMView.getBuy2().setText("BUY");
                        if(model.getRegVM().getItemSlot(2).getItemAmt() <= 0)
                            VMView.getBuy3().setText("X");
                        else
                            VMView.getBuy3().setText("BUY");
                        if(model.getRegVM().getItemSlot(3).getItemAmt() <= 0)
                            VMView.getBuy4().setText("X");
                        else
                            VMView.getBuy4().setText("BUY");
                        if(model.getRegVM().getItemSlot(4).getItemAmt() <= 0)
                            VMView.getBuy5().setText("X");
                        else
                            VMView.getBuy5().setText("BUY");
                        if(model.getRegVM().getItemSlot(5).getItemAmt() <= 0)
                            VMView.getBuy6().setText("X");
                        else
                            VMView.getBuy6().setText("BUY");
                        if(model.getRegVM().getItemSlot(6).getItemAmt() <= 0)
                            VMView.getBuy7().setText("X");
                        else
                            VMView.getBuy7().setText("BUY");
                        if(model.getRegVM().getItemSlot(7).getItemAmt() <= 0)
                            VMView.getBuy8().setText("X");  
                        else
                            VMView.getBuy8().setText("BUY");
                    }
                    else if(model.getRegVM() == null)
                    {
                        VMView.getVMName().setText(model.getSpecVM().getName() + " Pizzeria");
                        VMView.getItem1Name().setText(model.getSpecVM().getItemSlot(0).getItemName());
                        VMView.getItem1Price().setText("Price: "+model.getSpecVM().getItemSlot(0).getItemPrice());
                        VMView.getItem1Cal().setText("Cal: "+model.getSpecVM().getItemSlot(0).getItemCal());
                        VMView.getItem2Name().setText(model.getSpecVM().getItemSlot(1).getItemName());
                        VMView.getItem2Price().setText("Price: "+model.getSpecVM().getItemSlot(1).getItemPrice());
                        VMView.getItem2Cal().setText("Cal: "+model.getSpecVM().getItemSlot(1).getItemCal());
                        VMView.getItem3Name().setText(model.getSpecVM().getItemSlot(2).getItemName());
                        VMView.getItem3Price().setText("Price: "+model.getSpecVM().getItemSlot(2).getItemPrice());
                        VMView.getItem3Cal().setText("Cal: "+model.getSpecVM().getItemSlot(2).getItemCal());
                        VMView.getItem4Name().setText(model.getSpecVM().getItemSlot(3).getItemName());
                        VMView.getItem4Price().setText("Price: "+model.getSpecVM().getItemSlot(3).getItemPrice());
                        VMView.getItem4Cal().setText("Cal: "+model.getSpecVM().getItemSlot(3).getItemCal());
                        VMView.getItem5Name().setText(model.getSpecVM().getItemSlot(4).getItemName());
                        VMView.getItem5Price().setText("Price: "+model.getSpecVM().getItemSlot(4).getItemPrice());
                        VMView.getItem5Cal().setText("Cal: "+model.getSpecVM().getItemSlot(4).getItemCal());
                        VMView.getItem6Name().setText(model.getSpecVM().getItemSlot(5).getItemName());
                        VMView.getItem6Price().setText("Price: "+model.getSpecVM().getItemSlot(5).getItemPrice());
                        VMView.getItem6Cal().setText("Cal: "+model.getSpecVM().getItemSlot(5).getItemCal());
                        VMView.getItem7Name().setText(model.getSpecVM().getItemSlot(6).getItemName());
                        VMView.getItem7Price().setText("Price: "+model.getSpecVM().getItemSlot(6).getItemPrice());
                        VMView.getItem7Cal().setText("Cal: "+model.getSpecVM().getItemSlot(6).getItemCal());
                        VMView.getItem8Name().setText(model.getSpecVM().getItemSlot(7).getItemName());
                        VMView.getItem8Price().setText("Price: "+model.getSpecVM().getItemSlot(7).getItemPrice());
                        VMView.getItem8Cal().setText("Cal: "+model.getSpecVM().getItemSlot(7).getItemCal());
                         if(model.getSpecVM().getItemSlot(0).getItemAmt() <= 0)
                            VMView.getBuy1().setText("X");
                         else
                             VMView.getBuy1().setText("BUY");
                        if(model.getSpecVM().getItemSlot(1).getItemAmt() <= 0)
                            VMView.getBuy2().setText("X");
                        else
                            VMView.getBuy2().setText("BUY");
                        if(model.getSpecVM().getItemSlot(2).getItemAmt() <= 0)
                            VMView.getBuy3().setText("X");
                        else
                            VMView.getBuy3().setText("BUY");
                        if(model.getSpecVM().getItemSlot(3).getItemAmt() <= 0)
                            VMView.getBuy4().setText("X");
                        else
                            VMView.getBuy4().setText("BUY");
                        if(model.getSpecVM().getItemSlot(4).getItemAmt() <= 0)
                            VMView.getBuy5().setText("X");
                        else
                            VMView.getBuy5().setText("BUY");
                        if(model.getSpecVM().getItemSlot(5).getItemAmt() <= 0)
                            VMView.getBuy6().setText("X");
                        else
                            VMView.getBuy6().setText("BUY");
                        if(model.getSpecVM().getItemSlot(6).getItemAmt() <= 0)
                            VMView.getBuy7().setText("X");
                        else
                            VMView.getBuy7().setText("BUY");
                        if(model.getSpecVM().getItemSlot(7).getItemAmt() <= 0)
                            VMView.getBuy8().setText("X"); 
                        else
                            VMView.getBuy8().setText("BUY");
                    }
                    mainView.setVisible(true);
                    createView.setVisible(false);
                }
            }
        });
        
        this.VMView.setPeso1Spinner(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                int nPayment = 1 * (Integer) VMView.getPeso1Spn().getValue() + 5 * (Integer) VMView.getPeso5Spn().getValue() +
                        20 * (Integer) VMView.getPeso20Spn().getValue() + 50 * (Integer) VMView.getPeso50Spn().getValue() 
                        + 100 * (Integer) VMView.getPeso100Spn().getValue() + 500 * (Integer) VMView.getPeso500Spn().getValue()
                        + 1000 * (Integer) VMView.getPeso1000Spn().getValue();
                model.setPayment(nPayment);
                VMView.getTotalPaymentLbl().setText("PAYMENT: "+nPayment);
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso1(model.getRegVM().getBalance().getPeso1() + (int) VMView.getPeso1Spn().getValue());
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso1(model.getSpecVM().getBalance().getPeso1() + (int) VMView.getPeso1Spn().getValue());
                }
            }
        });
        
        this.VMView.setPeso5Spinner(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                int nPayment = 1 * (Integer) VMView.getPeso1Spn().getValue() + 5 * (Integer) VMView.getPeso5Spn().getValue() +
                        20 * (Integer) VMView.getPeso20Spn().getValue() + 50 * (Integer) VMView.getPeso50Spn().getValue() 
                        + 100 * (Integer) VMView.getPeso100Spn().getValue() + 500 * (Integer) VMView.getPeso500Spn().getValue()
                        + 1000 * (Integer) VMView.getPeso1000Spn().getValue();
                model.setPayment(nPayment);
                VMView.getTotalPaymentLbl().setText("PAYMENT: "+nPayment);
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso5(model.getRegVM().getBalance().getPeso5() + (int) VMView.getPeso5Spn().getValue());
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso5(model.getSpecVM().getBalance().getPeso5() + (int) VMView.getPeso5Spn().getValue());
                }
            }
        });
        
        this.VMView.setPeso20Spinner(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                int nPayment = 1 * (Integer) VMView.getPeso1Spn().getValue() + 5 * (Integer) VMView.getPeso5Spn().getValue() +
                        20 * (Integer) VMView.getPeso20Spn().getValue() + 50 * (Integer) VMView.getPeso50Spn().getValue() 
                        + 100 * (Integer) VMView.getPeso100Spn().getValue() + 500 * (Integer) VMView.getPeso500Spn().getValue()
                        + 1000 * (Integer) VMView.getPeso1000Spn().getValue();
                model.setPayment(nPayment);
                VMView.getTotalPaymentLbl().setText("PAYMENT: "+nPayment);
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso20(model.getRegVM().getBalance().getPeso20() + (int) VMView.getPeso20Spn().getValue());
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso20(model.getSpecVM().getBalance().getPeso20() + (int) VMView.getPeso20Spn().getValue());
                }
            }
        });
        
        this.VMView.setPeso50Spinner(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
               int nPayment = 1 * (Integer) VMView.getPeso1Spn().getValue() + 5 * (Integer) VMView.getPeso5Spn().getValue() +
                        20 * (Integer) VMView.getPeso20Spn().getValue() + 50 * (Integer) VMView.getPeso50Spn().getValue() 
                        + 100 * (Integer) VMView.getPeso100Spn().getValue() + 500 * (Integer) VMView.getPeso500Spn().getValue()
                        + 1000 * (Integer) VMView.getPeso1000Spn().getValue();
                model.setPayment(nPayment);
                VMView.getTotalPaymentLbl().setText("PAYMENT: "+nPayment);
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso50(model.getRegVM().getBalance().getPeso50() + (int) VMView.getPeso50Spn().getValue());
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso50(model.getSpecVM().getBalance().getPeso50() + (int) VMView.getPeso50Spn().getValue());
                }
            }
        });
        
        this.VMView.setPeso100Spinner(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                int nPayment = 1 * (Integer) VMView.getPeso1Spn().getValue() + 5 * (Integer) VMView.getPeso5Spn().getValue() +
                        20 * (Integer) VMView.getPeso20Spn().getValue() + 50 * (Integer) VMView.getPeso50Spn().getValue() 
                        + 100 * (Integer) VMView.getPeso100Spn().getValue() + 500 * (Integer) VMView.getPeso500Spn().getValue()
                        + 1000 * (Integer) VMView.getPeso1000Spn().getValue();
                model.setPayment(nPayment);
                VMView.getTotalPaymentLbl().setText("PAYMENT: "+nPayment);
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso100(model.getRegVM().getBalance().getPeso100() + (int) VMView.getPeso100Spn().getValue());
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso100(model.getSpecVM().getBalance().getPeso100() + (int) VMView.getPeso100Spn().getValue());
                }
            }
        });
        
        this.VMView.setPeso500Spinner(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                int nPayment = 1 * (Integer) VMView.getPeso1Spn().getValue() + 5 * (Integer) VMView.getPeso5Spn().getValue() +
                        20 * (Integer) VMView.getPeso20Spn().getValue() + 50 * (Integer) VMView.getPeso50Spn().getValue() 
                        + 100 * (Integer) VMView.getPeso100Spn().getValue() + 500 * (Integer) VMView.getPeso500Spn().getValue()
                        + 1000 * (Integer) VMView.getPeso1000Spn().getValue();
                model.setPayment(nPayment);
                VMView.getTotalPaymentLbl().setText("PAYMENT: "+nPayment);
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso500(model.getRegVM().getBalance().getPeso500() + (int) VMView.getPeso500Spn().getValue());
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso500(model.getSpecVM().getBalance().getPeso500() + (int) VMView.getPeso500Spn().getValue());
                }
            }
        });
        
        this.VMView.setPeso1000Spinner(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                int nPayment = 1 * (Integer) VMView.getPeso1Spn().getValue() + 5 * (Integer) VMView.getPeso5Spn().getValue() +
                        20 * (Integer) VMView.getPeso20Spn().getValue() + 50 * (Integer) VMView.getPeso50Spn().getValue() 
                        + 100 * (Integer) VMView.getPeso100Spn().getValue() + 500 * (Integer) VMView.getPeso500Spn().getValue()
                        + 1000 * (Integer) VMView.getPeso1000Spn().getValue();
                model.setPayment(nPayment);
                VMView.getTotalPaymentLbl().setText("PAYMENT: "+nPayment);
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso1000(model.getRegVM().getBalance().getPeso1000() + (int) VMView.getPeso1000Spn().getValue());
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso1000(model.getSpecVM().getBalance().getPeso1000() + (int) VMView.getPeso1000Spn().getValue());;
                }
            }
        });
     
        this.VMView.setBuy1Listener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(model.getSpecVM() == null)
                {
                    if(model.getRegVM().getItemSlot(0).getItemAmt() > 0)
                    {
                        model.getRegVM().getTransaction().addItem(model.getRegVM().getItemSlot(0), 1);
                        model.getRegVM().getItemSlot(0).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getRegVM().getItemSlot(0).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getRegVM().getTransaction().displayTransaction());
                        if(model.getRegVM().getItemSlot(0).getItemAmt() <= 0)
                            VMView.getBuy1().setText("X");
                        VMView.closeBuyButtons();
                        VMView.getOrderLbl().setText("ORDER: "+model.getRegVM().getItemSlot(0).getItemName());
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
                else if (model.getRegVM() == null)
                {
                    if(model.getSpecVM().getItemSlot(0).getItemAmt() > 0)
                    {
                        model.getSpecVM().getTransaction().addItem(model.getSpecVM().getItemSlot(0), 1, 0);
                        model.getSpecVM().getItemSlot(0).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getSpecVM().getItemSlot(0).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getSpecVM().getTransaction().displayTransaction());
                        if(model.getSpecVM().getItemSlot(0).getItemAmt() <= 0)
                            VMView.getBuy1().setText("X");
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
            }
        });
        
        this.VMView.setBuy2Listener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(model.getSpecVM() == null)
                {
                    if(model.getRegVM().getItemSlot(1).getItemAmt() > 0)
                    {
                        model.getRegVM().getTransaction().addItem(model.getRegVM().getItemSlot(1), 1, 1);
                        model.getRegVM().getItemSlot(1).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getRegVM().getItemSlot(1).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getRegVM().getTransaction().displayTransaction());
                        if(model.getRegVM().getItemSlot(1).getItemAmt() <= 0)
                            VMView.getBuy2().setText("X");
                        VMView.closeBuyButtons();
                        VMView.getOrderLbl().setText("ORDER: "+model.getRegVM().getItemSlot(1).getItemName());
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
                else if (model.getRegVM() == null)
                {
                    if(model.getSpecVM().getItemSlot(1).getItemAmt() > 0)
                    {
                        model.getSpecVM().getTransaction().addItem(model.getSpecVM().getItemSlot(1), 1, 1);
                        model.getSpecVM().getItemSlot(1).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getSpecVM().getItemSlot(1).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText(model.getSpecVM().getTransaction().displayTransaction());
                        if(model.getSpecVM().getItemSlot(1).getItemAmt() <= 0)
                            VMView.getBuy2().setText("X");
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
            }
        });
        
        this.VMView.setBuy3Listener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(model.getSpecVM() == null)
                {
                    if(model.getRegVM().getItemSlot(2).getItemAmt() > 0)
                    {
                        model.getRegVM().getTransaction().addItem(model.getRegVM().getItemSlot(2), 1, 2);
                        model.getRegVM().getItemSlot(2).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getRegVM().getItemSlot(2).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getRegVM().getTransaction().displayTransaction());
                        if(model.getRegVM().getItemSlot(2).getItemAmt() <= 0)
                            VMView.getBuy3().setText("X");
                        VMView.closeBuyButtons();
                        VMView.getOrderLbl().setText("ORDER: "+model.getRegVM().getItemSlot(2).getItemName());
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
                else if (model.getRegVM() == null)
                {
                    if(model.getSpecVM().getItemSlot(2).getItemAmt() > 0)
                    {
                        model.getSpecVM().getTransaction().addItem(model.getSpecVM().getItemSlot(2), 1,2);
                        model.getSpecVM().getItemSlot(2).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getSpecVM().getItemSlot(2).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText(model.getSpecVM().getTransaction().displayTransaction());
                        if(model.getSpecVM().getItemSlot(2).getItemAmt() <= 0)
                            VMView.getBuy3().setText("X");
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
            }
        });
        
        this.VMView.setBuy4Listener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(model.getSpecVM() == null)
                {
                    if(model.getRegVM().getItemSlot(3).getItemAmt() > 0)
                    {
                        model.getRegVM().getTransaction().addItem(model.getRegVM().getItemSlot(3), 1, 3);
                        model.getRegVM().getItemSlot(3).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getRegVM().getItemSlot(3).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getRegVM().getTransaction().displayTransaction());
                        if(model.getRegVM().getItemSlot(3).getItemAmt() <= 0)
                            VMView.getBuy4().setText("X");
                        VMView.closeBuyButtons();
                        VMView.getOrderLbl().setText("ORDER: "+model.getRegVM().getItemSlot(3).getItemName());
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
                else if (model.getRegVM() == null)
                {
                    if(model.getSpecVM().getItemSlot(3).getItemAmt() > 0)
                    {
                        model.getSpecVM().getTransaction().addItem(model.getSpecVM().getItemSlot(3), 1,3);
                        model.getSpecVM().getItemSlot(3).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getSpecVM().getItemSlot(3).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText(model.getSpecVM().getTransaction().displayTransaction());
                        if(model.getSpecVM().getItemSlot(3).getItemAmt() <= 0)
                            VMView.getBuy4().setText("X");
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
            }
        });
        
        this.VMView.setBuy5Listener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(model.getSpecVM() == null)
                {
                    if(model.getRegVM().getItemSlot(4).getItemAmt() > 0)
                    {
                        model.getRegVM().getTransaction().addItem(model.getRegVM().getItemSlot(4), 1, 4);
                        model.getRegVM().getItemSlot(4).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getRegVM().getItemSlot(4).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getRegVM().getTransaction().displayTransaction());
                        if(model.getRegVM().getItemSlot(4).getItemAmt() <= 0)
                            VMView.getBuy5().setText("X");
                        VMView.closeBuyButtons();
                        VMView.getOrderLbl().setText("ORDER: "+model.getRegVM().getItemSlot(4).getItemName());
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
                else if (model.getRegVM() == null)
                {
                    if(model.getSpecVM().getItemSlot(4).getItemAmt() > 0)
                    {
                        model.getSpecVM().getTransaction().addItem(model.getSpecVM().getItemSlot(4), 1,4);
                        model.getSpecVM().getItemSlot(4).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getSpecVM().getItemSlot(4).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText(model.getSpecVM().getTransaction().displayTransaction());
                        if(model.getSpecVM().getItemSlot(4).getItemAmt() <= 0)
                            VMView.getBuy5().setText("X");
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
            }
        });
        
        this.VMView.setBuy6Listener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(model.getSpecVM() == null)
                {
                    if(model.getRegVM().getItemSlot(5).getItemAmt() > 0)
                    {
                        model.getRegVM().getTransaction().addItem(model.getRegVM().getItemSlot(5), 1,5 );
                        model.getRegVM().getItemSlot(5).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getRegVM().getItemSlot(5).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getRegVM().getTransaction().displayTransaction());
                        if(model.getRegVM().getItemSlot(5).getItemAmt() <= 0)
                            VMView.getBuy6().setText("X");
                        VMView.closeBuyButtons();
                        VMView.getOrderLbl().setText("ORDER: "+model.getRegVM().getItemSlot(5).getItemName());
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
                else if (model.getRegVM() == null)
                {
                    if(model.getSpecVM().getItemSlot(5).getItemAmt() > 0)
                    {
                        model.getSpecVM().getTransaction().addItem(model.getSpecVM().getItemSlot(5), 1,5);
                        model.getSpecVM().getItemSlot(5).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getSpecVM().getItemSlot(5).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText(model.getSpecVM().getTransaction().displayTransaction());
                        if(model.getSpecVM().getItemSlot(5).getItemAmt() <= 0)
                            VMView.getBuy6().setText("X");
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
            }
        });
        
        this.VMView.setBuy7Listener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(model.getSpecVM() == null)
                {
                    if(model.getRegVM().getItemSlot(6).getItemAmt() > 0)
                    {
                        model.getRegVM().getTransaction().addItem(model.getRegVM().getItemSlot(6), 1, 6);
                        model.getRegVM().getItemSlot(6).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getRegVM().getItemSlot(6).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getRegVM().getTransaction().displayTransaction());
                        if(model.getRegVM().getItemSlot(6).getItemAmt() <= 0)
                            VMView.getBuy7().setText("X");
                        VMView.closeBuyButtons();
                        VMView.getOrderLbl().setText("ORDER: "+model.getRegVM().getItemSlot(6).getItemName());
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
                else if (model.getRegVM() == null)
                {
                    if(model.getSpecVM().getItemSlot(6).getItemAmt() > 0)
                    {
                        model.getSpecVM().getTransaction().addItem(model.getSpecVM().getItemSlot(6), 1,6);
                        model.getSpecVM().getItemSlot(6).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getSpecVM().getItemSlot(6).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText(model.getSpecVM().getTransaction().displayTransaction());
                        if(model.getSpecVM().getItemSlot(6).getItemAmt() <= 0)
                            VMView.getBuy7().setText("X");
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
            }
        });
        
        this.VMView.setBuy8Listener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(model.getSpecVM() == null)
                {
                    if(model.getRegVM().getItemSlot(7).getItemAmt() > 0)
                    {
                        model.getRegVM().getTransaction().addItem(model.getRegVM().getItemSlot(7), 1, 7);
                        model.getRegVM().getItemSlot(7).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getRegVM().getItemSlot(7).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText("");
                        VMView.getOrderHistory().setText(model.getRegVM().getTransaction().displayTransaction());
                        if(model.getRegVM().getItemSlot(7).getItemAmt() <= 0)
                            VMView.getBuy8().setText("X");
                        VMView.closeBuyButtons();
                        VMView.getOrderLbl().setText("ORDER: "+model.getRegVM().getItemSlot(7).getItemName());
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
                else if (model.getRegVM() == null)
                {
                    if(model.getSpecVM().getItemSlot(7).getItemAmt() > 0)
                    {
                        model.getSpecVM().getTransaction().addItem(model.getSpecVM().getItemSlot(7), 1,7);
                        model.getSpecVM().getItemSlot(7).sellItem();
                        int nCost = model.getCost();
                        nCost += model.getSpecVM().getItemSlot(7).getItemPrice();
                        model.setCost(nCost);
                        VMView.getTotalCostLbl().setText("COST: "+nCost);
                        VMView.getOrderHistory().setText(model.getSpecVM().getTransaction().displayTransaction());
                        if(model.getSpecVM().getItemSlot(7).getItemAmt() <= 0)
                            VMView.getBuy8().setText("X");
                        VMView.getCancelButton().setEnabled(true);
                    }
                }
            }
        });
        
        this.VMView.setConfirmListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(model.getCost() > model.getPayment())
                {
                    VMView.getNotEnoughPaymentError().setSize(400,300);
                    VMView.getNotEnoughPaymentError().setVisible(true);
                }
                else
                {
                    if(model.getSpecVM() == null)
                    {
                       boolean isEnoughChange = model.getRegVM().getBalance().isEnoughChange(model.getCost(), model.getPayment());
                       if(isEnoughChange)
                       {
                          int index = model.searchRegItem(VMView.getOrderLbl().getText());
                          model.getRegVM().getBalance().giveChange(model.getCost(), model.getPayment());
                          VMView.getReceiptLbl().setText(model.printRegReceipt(index));
                          VMView.getItemDispensedMsg().setSize(400,300);
                          VMView.getItemDispensedMsg().setVisible(true);
                          model.getRegVM().getRecord().addItem(model.getRegVM().getItemSlot(index), 1);
                          VMView.dispose();
                          VMView.setVisible(true);
                          VMView.openBuyButtons();
                          VMView.resetMoneySpinners();
                          model.setCost(0); model.setPayment(0);
                          model.getRegVM().getTransaction().resetInventory();
                          model.getRegVM().getTransaction().resetEarnings();
                       }
                       else
                       {
                          int index = model.searchRegItem(VMView.getOrderLbl().getText());
                          model.getRegVM().getItemSlot(index).setItemAmt(model.getRegVM().getItemSlot(index).getItemAmt() + 1);
                          VMView.getNoChangeError().setSize(400,300);
                          VMView.getNoChangeError().setVisible(true);
                       }
                    }
                    if(model.getRegVM() == null)
                    {
                       boolean isEnoughChange = model.getSpecVM().getBalance().isEnoughChange(model.getCost(), model.getPayment());
                       if(isEnoughChange)
                       {
                           int index = model.getSpecVM().getTransaction().findItem();
                          if(model.getSpecVM().getTransaction().countItemAmt() == 1 && model.getSpecVM().getTransaction().getItemSlot(index).getExclusive() == true)
                          {
                            model.getSpecVM().getBalance().giveChange(model.getCost(), model.getPayment());
                            VMView.getReceiptLbl().setText(model.printRegReceipt(index));
                            VMView.getItemDispensedMsg().setSize(400,300);
                            VMView.getItemDispensedMsg().setVisible(true);
                            VMView.getTotalCalLbl().setText("TOTAL CALORIES: "+Integer.toString(model.getSpecVM().getTransaction().getTotalCal()));
                            model.getSpecVM().getRecord().addItem(model.getSpecVM().getItemSlot(index), 1);
                            model.setCost(0); model.setPayment(0);
                          }
                          else if(model.getSpecVM().isDispensable(model.getSpecVM().getTransaction()))
                          {
                            model.getSpecVM().getBalance().giveChange(model.getCost(), model.getPayment());
                            VMView.getReceiptLbl().setText(model.getSpecVM().displayProcess(model.getSpecVM().getTransaction()) + "<br/><br/>COST: "+model.getCost()+"<br/>PAYMENT: "
                                    +model.getPayment()+"<br/>CHANGE: "+(model.getPayment()-model.getCost())+"</html>");
                            VMView.getItemDispensedMsg().setSize(400,300);
                            VMView.getItemDispensedMsg().setVisible(true);
                            VMView.getTotalCalLbl().setText("TOTAL CALORIES: "+Integer.toString(model.getSpecVM().getTransaction().getTotalCal()));
                            model.getSpecVM().getRecord().transferSpecItems(model.getSpecVM().getRecord(), model.getSpecVM().getTransaction());
                            model.getSpecVM().getTransaction().resetInventory();
                            model.getSpecVM().getTransaction().resetEarnings();
                            model.setCost(0); model.setPayment(0);
                          }
                       }
                       else
                       {
                          int index = model.searchSpecItem(VMView.getOrderLbl().getText());
                          model.getSpecVM().bringBackItems(model.getSpecVM().getTransaction());
                           model.getSpecVM().getTransaction().resetInventory();
                       }
                    }         
                }
            }
        });
        
        this.VMView.setCancelListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VMView.dispose();
                VMView.openBuyButtons();
                VMView.resetMoneySpinners();
                model.setCost(0); model.setPayment(0);
                VMView.getOrderHistory().setText("");
                if(model.getSpecVM() == null)
                {
                    int index = model.searchRegItem(VMView.getOrderLbl().getText());
                          model.getRegVM().getItemSlot(index).setItemAmt(model.getRegVM().getItemSlot(index).getItemAmt() + 1);
                    model.getRegVM().getTransaction().resetInventory(); 
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().bringBackItems(model.getSpecVM().getTransaction());
                    model.getSpecVM().getTransaction().resetInventory();
                }
                if(model.getSpecVM() == null)
                    {
                        VMView.getVMName().setText(model.getRegVM().getName() + " Vending Machine");
                        VMView.getItem1Name().setText(model.getRegVM().getItemSlot(0).getItemName());
                        VMView.getItem1Price().setText("Price: "+model.getRegVM().getItemSlot(0).getItemPrice());
                        VMView.getItem1Cal().setText("Cal: "+model.getRegVM().getItemSlot(0).getItemCal());
                        VMView.getItem2Name().setText(model.getRegVM().getItemSlot(1).getItemName());
                        VMView.getItem2Price().setText("Price: "+model.getRegVM().getItemSlot(1).getItemPrice());
                        VMView.getItem2Cal().setText("Cal: "+model.getRegVM().getItemSlot(1).getItemCal());
                        VMView.getItem3Name().setText(model.getRegVM().getItemSlot(2).getItemName());
                        VMView.getItem3Price().setText("Price: "+model.getRegVM().getItemSlot(2).getItemPrice());
                        VMView.getItem3Cal().setText("Cal: "+model.getRegVM().getItemSlot(2).getItemCal());
                        VMView.getItem4Name().setText(model.getRegVM().getItemSlot(3).getItemName());
                        VMView.getItem4Price().setText("Price: "+model.getRegVM().getItemSlot(3).getItemPrice());
                        VMView.getItem4Cal().setText("Cal: "+model.getRegVM().getItemSlot(3).getItemCal());
                        VMView.getItem5Name().setText(model.getRegVM().getItemSlot(4).getItemName());
                        VMView.getItem5Price().setText("Price: "+model.getRegVM().getItemSlot(4).getItemPrice());
                        VMView.getItem5Cal().setText("Cal: "+model.getRegVM().getItemSlot(4).getItemCal());
                        VMView.getItem6Name().setText(model.getRegVM().getItemSlot(5).getItemName());
                        VMView.getItem6Price().setText("Price: "+model.getRegVM().getItemSlot(5).getItemPrice());
                        VMView.getItem6Cal().setText("Cal: "+model.getRegVM().getItemSlot(5).getItemCal());
                        VMView.getItem7Name().setText(model.getRegVM().getItemSlot(6).getItemName());
                        VMView.getItem7Price().setText("Price: "+model.getRegVM().getItemSlot(6).getItemPrice());
                        VMView.getItem7Cal().setText("Cal: "+model.getRegVM().getItemSlot(6).getItemCal());
                        VMView.getItem8Name().setText(model.getRegVM().getItemSlot(7).getItemName());
                        VMView.getItem8Price().setText("Price: "+model.getRegVM().getItemSlot(7).getItemPrice());
                        VMView.getItem8Cal().setText("Cal: "+model.getRegVM().getItemSlot(7).getItemCal());
                        if(model.getRegVM().getItemSlot(0).getItemAmt() <= 0)
                            VMView.getBuy1().setText("X");
                        else
                            VMView.getBuy1().setText("BUY");
                        if(model.getRegVM().getItemSlot(1).getItemAmt() <= 0)
                            VMView.getBuy2().setText("X");
                        else
                            VMView.getBuy2().setText("BUY");
                        if(model.getRegVM().getItemSlot(2).getItemAmt() <= 0)
                            VMView.getBuy3().setText("X");
                        else
                            VMView.getBuy3().setText("BUY");
                        if(model.getRegVM().getItemSlot(3).getItemAmt() <= 0)
                            VMView.getBuy4().setText("X");
                        else
                            VMView.getBuy4().setText("BUY");
                        if(model.getRegVM().getItemSlot(4).getItemAmt() <= 0)
                            VMView.getBuy5().setText("X");
                        else
                            VMView.getBuy5().setText("BUY");
                        if(model.getRegVM().getItemSlot(5).getItemAmt() <= 0)
                            VMView.getBuy6().setText("X");
                        else
                            VMView.getBuy6().setText("BUY");
                        if(model.getRegVM().getItemSlot(6).getItemAmt() <= 0)
                            VMView.getBuy7().setText("X");
                        else
                            VMView.getBuy7().setText("BUY");
                        if(model.getRegVM().getItemSlot(7).getItemAmt() <= 0)
                            VMView.getBuy8().setText("X");  
                        else
                            VMView.getBuy8().setText("BUY");
                    }
                    else if(model.getRegVM() == null)
                    {
                        VMView.getVMName().setText(model.getSpecVM().getName() + " Pizzeria");
                        VMView.getItem1Name().setText(model.getSpecVM().getItemSlot(0).getItemName());
                        VMView.getItem1Price().setText("Price: "+model.getSpecVM().getItemSlot(0).getItemPrice());
                        VMView.getItem1Cal().setText("Cal: "+model.getSpecVM().getItemSlot(0).getItemCal());
                        VMView.getItem2Name().setText(model.getSpecVM().getItemSlot(1).getItemName());
                        VMView.getItem2Price().setText("Price: "+model.getSpecVM().getItemSlot(1).getItemPrice());
                        VMView.getItem2Cal().setText("Cal: "+model.getSpecVM().getItemSlot(1).getItemCal());
                        VMView.getItem3Name().setText(model.getSpecVM().getItemSlot(2).getItemName());
                        VMView.getItem3Price().setText("Price: "+model.getSpecVM().getItemSlot(2).getItemPrice());
                        VMView.getItem3Cal().setText("Cal: "+model.getSpecVM().getItemSlot(2).getItemCal());
                        VMView.getItem4Name().setText(model.getSpecVM().getItemSlot(3).getItemName());
                        VMView.getItem4Price().setText("Price: "+model.getSpecVM().getItemSlot(3).getItemPrice());
                        VMView.getItem4Cal().setText("Cal: "+model.getSpecVM().getItemSlot(3).getItemCal());
                        VMView.getItem5Name().setText(model.getSpecVM().getItemSlot(4).getItemName());
                        VMView.getItem5Price().setText("Price: "+model.getSpecVM().getItemSlot(4).getItemPrice());
                        VMView.getItem5Cal().setText("Cal: "+model.getSpecVM().getItemSlot(4).getItemCal());
                        VMView.getItem6Name().setText(model.getSpecVM().getItemSlot(5).getItemName());
                        VMView.getItem6Price().setText("Price: "+model.getSpecVM().getItemSlot(5).getItemPrice());
                        VMView.getItem6Cal().setText("Cal: "+model.getSpecVM().getItemSlot(5).getItemCal());
                        VMView.getItem7Name().setText(model.getSpecVM().getItemSlot(6).getItemName());
                        VMView.getItem7Price().setText("Price: "+model.getSpecVM().getItemSlot(6).getItemPrice());
                        VMView.getItem7Cal().setText("Cal: "+model.getSpecVM().getItemSlot(6).getItemCal());
                        VMView.getItem8Name().setText(model.getSpecVM().getItemSlot(7).getItemName());
                        VMView.getItem8Price().setText("Price: "+model.getSpecVM().getItemSlot(7).getItemPrice());
                        VMView.getItem8Cal().setText("Cal: "+model.getSpecVM().getItemSlot(7).getItemCal());
                         if(model.getSpecVM().getItemSlot(0).getItemAmt() <= 0)
                            VMView.getBuy1().setText("X");
                         else
                             VMView.getBuy1().setText("BUY");
                        if(model.getSpecVM().getItemSlot(1).getItemAmt() <= 0)
                            VMView.getBuy2().setText("X");
                        else
                            VMView.getBuy2().setText("BUY");
                        if(model.getSpecVM().getItemSlot(2).getItemAmt() <= 0)
                            VMView.getBuy3().setText("X");
                        else
                            VMView.getBuy3().setText("BUY");
                        if(model.getSpecVM().getItemSlot(3).getItemAmt() <= 0)
                            VMView.getBuy4().setText("X");
                        else
                            VMView.getBuy4().setText("BUY");
                        if(model.getSpecVM().getItemSlot(4).getItemAmt() <= 0)
                            VMView.getBuy5().setText("X");
                        else
                            VMView.getBuy5().setText("BUY");
                        if(model.getSpecVM().getItemSlot(5).getItemAmt() <= 0)
                            VMView.getBuy6().setText("X");
                        else
                            VMView.getBuy6().setText("BUY");
                        if(model.getSpecVM().getItemSlot(6).getItemAmt() <= 0)
                            VMView.getBuy7().setText("X");
                        else
                            VMView.getBuy7().setText("BUY");
                        if(model.getSpecVM().getItemSlot(7).getItemAmt() <= 0)
                            VMView.getBuy8().setText("X"); 
                        else
                            VMView.getBuy8().setText("BUY");
                    }
                VMView.setVisible(true);
            }
        });
        
        this.VMView.setBackButtonListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VMView.dispose();
                mainView.setVisible(true);
            }
        });
        
        this.maintView.setRestockItem(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model.getSpecVM() == null)
                {
                    maintView.getRestockItem().setSize(600,300);
                    maintView.getRestockItem().setVisible(true);
                    maintView.getNecessary().setVisible(false);
                    maintView.getExclusive().setVisible(false);
                    maintView.getActionTxtFld().setVisible(false);
                }
                else if(model.getRegVM() == null)
                {
                    maintView.getRestockItem().setSize(600,300);
                    maintView.getRestockItem().setVisible(true);
                }
            }
        });
        
        this.maintView.setRestockChange(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model.getSpecVM() == null)
                {
                    
                }
                else if(model.getRegVM() == null)
                {
                    
                }
            }
        });
        
        this.maintView.setCollectEarnings(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model.getSpecVM() == null)
                {
                    
                }
                else if(model.getRegVM() == null)
                {
                    
                }
            }
        });
        
        
        this.maintView.setItemSlotListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
             if (model.getSpecVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                     maintView.getItem1().setText(model.getRegVM().getItemSlot(index).getItemName());
                     maintView.getStock1().setValue(model.getRegVM().getItemSlot(index).getItemAmt());
                     maintView.getPrice1().setValue((model.getRegVM().getItemSlot(index).getItemPrice()));
                     maintView.getCal1().setValue((model.getRegVM().getItemSlot(index).getItemCal()));
                }
                else if(model.getRegVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    maintView.getItem1().setText(model.getSpecVM().getItemSlot(index).getItemName());
                    maintView.getStock1().setValue(model.getSpecVM().getItemSlot(index).getItemAmt());
                    maintView.getPrice1().setValue((model.getSpecVM().getItemSlot(index).getItemPrice()));
                    maintView.getCal1().setValue((model.getSpecVM().getItemSlot(index).getItemCal()));
                }
            }
        
        });
        
        this.maintView.setItemNameListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model.getSpecVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    if(maintView.getItem1().getText().isBlank() == true)
                    {
                        model.getRegVM().getItemSlot(index).setItemName("<Empty>");
                        model.getRegVM().getItemSlot(index).setItemPrice(0);
                        model.getRegVM().getItemSlot(index).setItemAmt(-1);
                        model.getRegVM().getItemSlot(index).setItemCal(0);
                    }
                    else
                    {
                        model.getRegVM().getItemSlot(index).setItemName(maintView.getItem1().getText());
                    }
                }
                else if(model.getRegVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    if(maintView.getItem1().getText().isBlank() == true)
                    {
                        model.getSpecVM().getItemSlot(index).setItemName("<Empty>");
                        model.getSpecVM().getItemSlot(index).setItemPrice(0);
                        model.getSpecVM().getItemSlot(index).setItemAmt(-1);
                        model.getSpecVM().getItemSlot(index).setItemCal(0);
                    }
                    else
                    {
                        model.getSpecVM().getItemSlot(index).setItemName(maintView.getItem1().getText());
                    }
                }
            }
        });
        
        this.maintView.setItemActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                if(maintView.getItem1().getText() == "")
                {
                    model.getSpecVM().getItemSlot(index).setItemName(null);
                }
                else
                {
                    model.getSpecVM().getItemSlot(index).setItemName(maintView.getItem1().getText());
                }
            }
        });
        
        this.maintView.setStockListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if (model.getSpecVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    model.getRegVM().getItemSlot(index).setItemAmt((Integer) maintView.getStock1().getValue());
                }
                else if(model.getRegVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    model.getSpecVM().getItemSlot(index).setItemAmt((Integer) maintView.getStock1().getValue());
                }
            }
        });
        
        this.maintView.setPriceListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if (model.getSpecVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    model.getRegVM().getItemSlot(index).setItemPrice((Integer) maintView.getPrice1().getValue());
                    
                }
                else if(model.getRegVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    model.getSpecVM().getItemSlot(index).setItemPrice((Integer) maintView.getPrice1().getValue());
                }
            }
        });
        
        this.maintView.setCalListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
              if (model.getSpecVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    model.getRegVM().getItemSlot(index).setItemCal((Integer) maintView.getCal1().getValue());
                    
                }
                else if(model.getRegVM() == null)
                {
                    int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                    model.getSpecVM().getItemSlot(index).setItemCal((Integer) maintView.getCal1().getValue());
                }
            }
        });
        
        this.maintView.setExclusiveListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                model.getSpecVM().getItemSlot(index).setExclusive(maintView.getExclusive().isEnabled());
            }
        });
        
        this.maintView.setNecessaryListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = (Integer) maintView.getSlotSpn().getValue() - 1;
                model.getSpecVM().getItemSlot(index).setNecessary(maintView.getNecessary().isEnabled());
            }
        });
        
        this.maintView.setBackButton(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               maintView.setVisible(false);
               mainView.setVisible(true);
            }
        });
        
        this.maintView.setDoneListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model.getSpecVM() == null)
                {
                    maintView.getRestockItem().setVisible(false);
                    maintView.setVisible(true);
                    model.getRegVM().getRecord().resetInventory();
                }
                else if(model.getRegVM() == null)
                {
                    maintView.getRestockItem().setVisible(false);
                    maintView.setVisible(true);
                    model.getSpecVM().getRecord().resetInventory();
                }
            }
        });
        
        this.maintView.setRestockChange(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                maintView.setVisible(false);
                maintView.getRestockChange().setSize(230,450);
                maintView.getRestockChange().setVisible(true);
                if(model.getSpecVM() == null)
                {
                    maintView.getPeso1Spn().setValue(model.getRegVM().getBalance().getPeso1());
                    maintView.getPeso5Spn().setValue(model.getRegVM().getBalance().getPeso5());
                    maintView.getPeso20Spn().setValue(model.getRegVM().getBalance().getPeso20());
                    maintView.getPeso50Spn().setValue(model.getRegVM().getBalance().getPeso50());
                    maintView.getPeso100Spn().setValue(model.getRegVM().getBalance().getPeso100());
                    maintView.getPeso500Spn().setValue(model.getRegVM().getBalance().getPeso500());
                    maintView.getPeso1000Spn().setValue(model.getRegVM().getBalance().getPeso1000());
                    maintView.getTotalChange().setText(Integer.toString(model.getRegVM().getBalance().getTotal()));
                }
                else if(model.getRegVM() == null)
                {
                    maintView.getPeso1Spn().setValue(model.getSpecVM().getBalance().getPeso1());
                    maintView.getPeso5Spn().setValue(model.getSpecVM().getBalance().getPeso5());
                    maintView.getPeso20Spn().setValue(model.getSpecVM().getBalance().getPeso20());
                    maintView.getPeso50Spn().setValue(model.getSpecVM().getBalance().getPeso50());
                    maintView.getPeso100Spn().setValue(model.getSpecVM().getBalance().getPeso100());
                    maintView.getPeso500Spn().setValue(model.getSpecVM().getBalance().getPeso500());
                    maintView.getPeso1000Spn().setValue(model.getSpecVM().getBalance().getPeso1000());
                    maintView.getTotalChange().setText(Integer.toString(model.getSpecVM().getBalance().getTotal()));
                }
            }
        });
        
        this.maintView.setCollectEarnings(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().giveChange(model.getRegVM().getRecord().getEarnings(), model.getRegVM().getRecord().getEarnings());
                    maintView.getStatus().setText("<html>EARNINGS COLLECTED: "+model.getRegVM().getRecord().getEarnings()+"<br/>"+model.getRegVM().getBalance().displayMoney());
                    model.getRegVM().getRecord().resetEarnings();
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().giveChange(model.getSpecVM().getRecord().getEarnings(), model.getSpecVM().getRecord().getEarnings());
                    maintView.getStatus().setText("<html>EARNINGS COLLECTED: "+model.getSpecVM().getRecord().getEarnings()+"<br/>"+model.getSpecVM().getBalance().displayMoney());
                    model.getSpecVM().getRecord().resetEarnings();
                }
            }
        });
        
        this.maintView.setPrintStats(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(model.getSpecVM() == null)
                {
                    maintView.getStatus().setText(model.getRegVM().getRecord().displayRecord());
                }
                else if(model.getRegVM() == null)
                {
                    maintView.getStatus().setText(model.getSpecVM().getRecord().displayRecord());
                }
            }
        });
        
        
        this.maintView.setPeso1Listener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso1((Integer) maintView.getPeso1Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getRegVM().getBalance().getTotal()));
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso1((Integer) maintView.getPeso1Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getSpecVM().getBalance().getTotal()));
                }
            }
        });
        
        this.maintView.setPeso5Listener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso5((Integer) maintView.getPeso5Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getRegVM().getBalance().getTotal()));
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso5((Integer) maintView.getPeso5Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getSpecVM().getBalance().getTotal()));
                }
            }
        });
        
        this.maintView.setPeso20Listener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso20((Integer) maintView.getPeso20Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getRegVM().getBalance().getTotal()));
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso20((Integer) maintView.getPeso20Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getSpecVM().getBalance().getTotal()));
                }
            }
        });
        
        this.maintView.setPeso50Listener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso50((Integer) maintView.getPeso50Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getRegVM().getBalance().getTotal()));
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso50((Integer) maintView.getPeso50Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getSpecVM().getBalance().getTotal()));
                }
            }
        });
        
        this.maintView.setPeso100Listener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso100((Integer) maintView.getPeso100Spn().getValue());
                   maintView.getTotalChange().setText(Integer.toString(model.getRegVM().getBalance().getTotal()));
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso100((Integer) maintView.getPeso100Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getSpecVM().getBalance().getTotal()));
                }
            }
        });
        
        this.maintView.setPeso500Listener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso500((Integer) maintView.getPeso500Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getRegVM().getBalance().getTotal()));
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso500((Integer) maintView.getPeso500Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getSpecVM().getBalance().getTotal()));
                }
            }
        });
        
        this.maintView.setPeso1000Listener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                if(model.getSpecVM() == null)
                {
                    model.getRegVM().getBalance().addPeso1000((Integer) maintView.getPeso1000Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getRegVM().getBalance().getTotal()));
                }
                else if(model.getRegVM() == null)
                {
                    model.getSpecVM().getBalance().addPeso1000((Integer) maintView.getPeso1000Spn().getValue());
                    maintView.getTotalChange().setText(Integer.toString(model.getSpecVM().getBalance().getTotal()));
                }
            }
        });
        
        this.maintView.setDoneChangeListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                maintView.getRestockChange().setVisible(false);
                maintView.setVisible(true);
            }
        });
    }
}
