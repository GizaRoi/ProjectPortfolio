

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Controller.VMController;
import Model.VMModel;
import View.MainFrame;

/**
 *
 * @author Roimarc
 */
public class Main {
    public static void main(String args[])
    {
        VMModel model = new VMModel();
        MainFrame mainView = new MainFrame();

        VMController controller = new VMController(mainView, model);
        mainView.setVisible(true);
    }
}
