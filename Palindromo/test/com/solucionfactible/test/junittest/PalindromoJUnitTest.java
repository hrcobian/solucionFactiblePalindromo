/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solucionfactible.test.junittest;

import com.solucionfactible.test.ValidadorPalindromo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author horacio
 */
public class PalindromoJUnitTest {

    private boolean isPalindromoResult;

    public PalindromoJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        isPalindromoResult = false;
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCase1() {
        isPalindromoResult = ValidadorPalindromo.isWordPalindromo("luz azul");
        assertTrue(isPalindromoResult);
    }

    @Test
    public void testCase2() {
        isPalindromoResult = ValidadorPalindromo.isWordPalindromo("Anita lava la tina");
        assertTrue(isPalindromoResult);

    }

    @Test
    public void testCase3() {
        isPalindromoResult = ValidadorPalindromo.isWordPalindromo("no es un palíndromo");
        assertFalse(isPalindromoResult);
    }

    @Test
    public void testCase4() {
        isPalindromoResult = ValidadorPalindromo.isWordPalindromo("Tampoco es un palíndromo");
        assertFalse(isPalindromoResult);
    }

    @Test
    public void testCase5() {
        isPalindromoResult = ValidadorPalindromo.isWordPalindromo("oso ");
         assertTrue(isPalindromoResult);
    }

    @Test
    public void testCase6() {
        isPalindromoResult = ValidadorPalindromo.isWordPalindromo(" no es ");
          assertFalse(isPalindromoResult);

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
