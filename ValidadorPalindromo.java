/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionfactible.test;

/**
 *
 * @author horacio rodriguez Cobian
 */
public class ValidadorPalindromo {
    
    
      public static boolean isWordPalindromo(String input) {
        input = input.toLowerCase().trim();
        input = input.replaceAll(" ", "");

        int backwards = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != input.charAt(backwards)) {
                return false;

            }

            if (i == backwards) {
                break;
            }

            backwards--;

        }

        return true;

    }
    
}
