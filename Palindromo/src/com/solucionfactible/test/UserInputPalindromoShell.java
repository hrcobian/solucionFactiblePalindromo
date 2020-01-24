/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionfactible.test;

import com.solucionfactible.test.interfaces.retrievedata.InputDataUserInterface;
import java.util.Scanner;

/**
 *
 * @author horacio
 */
public class UserInputPalindromoShell implements InputDataUserInterface {

    @Override
    public String inPutDataUser() {
         System.out.println("Palindromo - Shell");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la cadena.....");
        return scan.nextLine();
    }

}
