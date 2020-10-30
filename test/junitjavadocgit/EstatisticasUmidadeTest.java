/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitjavadocgit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ´Gabriel
 */
public class EstatisticasUmidadeTest {
    
    public EstatisticasUmidadeTest() {
    }

    /**
     * Test of setValor method, of class EstatisticasUmidade.
     */
    @Test
    public void testSetValor() {
        // Não há valor de retorno
    }

    /**
     * Test of media method, of class EstatisticasUmidade.
     */
    @Test
    public void testMedia1() {
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        //4,074
        double result = e.media(5);
        assertEquals("Erro no cálculo de todas as amostras", 4.074, result, 0.01);
    }
    
    /**
     * Test of media method, of class EstatisticasUmidade.
     */
    @Test
    public void testMedia2() {
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        //4,074
        double result = e.media(1);
        assertEquals("Erro no cálculo de apenas uma amostra", 5.2, result, 0.01);
    }

    /**
     * Test of desvioPadrao method, of class EstatisticasUmidade.
     */
    @Test
    public void testDesvioPadrao1() {
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        //2,80622
        double result = e.desvioPadrao(5);
        assertEquals("Erro no cálculo de todas as amostras", 2.50996, result, 0.01);        
    }
   
    /**
     * Test of desvioPadrao method, of class EstatisticasUmidade.
     */
    @Test
    public void testDesvioPadrao2() {
        EstatisticasUmidade e = new EstatisticasUmidade();
        e.setValor(5.2);
        e.setValor(7.0);
        e.setValor(1.3);
        e.setValor(6);
        e.setValor(0.87);
        //2,80622
        double result = e.desvioPadrao(1);
        assertEquals("Erro no cálculo de apenas uma amostra", 0, result, 0.01);        
    } 
}
