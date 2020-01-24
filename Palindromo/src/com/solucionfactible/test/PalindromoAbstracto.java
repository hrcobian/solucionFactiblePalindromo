/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionfactible.test;

import com.solucionfactible.test.interfaces.retrievedata.InputDataUserInterface;
import com.solucionfactible.test.interfaces.showdata.OutPutDataUserInterface;

/**
 *
 * @author horacio
 */
public abstract class PalindromoAbstracto implements OutPutDataUserInterface, InputDataUserInterface {

    public void palindromoRoutine() {

        String inPutWord = inPutDataUser();
        boolean isWordPalindromo = ValidadorPalindromo.isWordPalindromo(inPutWord);

    }

}
