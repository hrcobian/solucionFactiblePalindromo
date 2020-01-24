/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionfactible.test;

import com.solucionfactible.test.interfaces.showdata.OutPutDataUserInterface;

/**
 *
 * @author horacio
 */
public class UserOutPutPalindromoShell implements OutPutDataUserInterface{

    @Override
    public void showOutPutData(String input) {
        
        if (ValidadorPalindromo.isWordPalindromo(input)) {
            System.out.println(input + " es un palíndromo.");
        } else {
            System.out.println(input + " No es un palíndromo.");
        }
        
    }
    
}
