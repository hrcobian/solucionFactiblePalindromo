/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionfactible.test;

import com.solucionfactible.test.interfaces.retrievedata.InputDataUserInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author horacio
 */
public class UserInputPalindromoWindow implements InputDataUserInterface {

    @Override
    public String inPutDataUser() {

      return JOptionPane.showInputDialog("Palindromo","Introduce  frase");
      
    }
}
