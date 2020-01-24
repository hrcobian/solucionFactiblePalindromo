/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionfactible.test;

import com.solucionfactible.test.interfaces.showdata.OutPutDataUserInterface;
import javax.swing.JOptionPane;

/**
 *
 * @author horacio
 */
public class UserOutPutPalindromoWindow implements OutPutDataUserInterface {

    @Override
    public void showOutPutData(String input) {
        if (input == null) {
            input = "Ninguna frase fue introducida";
        } else if (ValidadorPalindromo.isWordPalindromo(input)) {
            input = input + " es un palíndromo.";
        } else {

            input = input + " No es un palíndromo.";
        }

        JOptionPane.showConfirmDialog(null,input,  "Palindromo", JOptionPane.DEFAULT_OPTION);
    }

}
