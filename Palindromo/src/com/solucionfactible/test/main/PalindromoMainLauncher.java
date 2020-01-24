/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionfactible.test.main;

import com.solucionfactible.test.UserInputPalindromoShell;
import com.solucionfactible.test.UserInputPalindromoWindow;
import com.solucionfactible.test.UserOutPutPalindromoShell;
import com.solucionfactible.test.UserOutPutPalindromoWindow;
import com.solucionfactible.test.ValidadorPalindromo;
import com.solucionfactible.test.interfaces.retrievedata.InputDataUserInterface;
import com.solucionfactible.test.interfaces.showdata.OutPutDataUserInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author horacio
 */
public class PalindromoMainLauncher {

    public static void main(String args[]) {

        palindromoExecution(new UserInputPalindromoShell(), new UserOutPutPalindromoShell());

        palindromoExecution(new UserInputPalindromoWindow(), new UserOutPutPalindromoWindow());

    }

    public static void palindromoExecution(InputDataUserInterface idui, OutPutDataUserInterface outPutData) {

        String inputWord = idui.inPutDataUser();

        outPutData.showOutPutData(inputWord);

    }
}
