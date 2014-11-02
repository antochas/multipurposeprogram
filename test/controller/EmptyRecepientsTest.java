/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exceptions.NoRecepients;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a
 */
public class EmptyRecepientsTest {
    
    public EmptyRecepientsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkRecepients method, of class EmptyRecepients.
     */
    @Test
    public void testCheckRecepients() throws Exception {
        System.out.println("Check for 0 recepients expecting NoRecepients error translated to false");
        int recCount = 0;
        EmptyRecepients instance = new EmptyRecepients();
        boolean expResult = false;
        boolean result;
        try{
            result = instance.checkRecepients(recCount);
        }
        catch(NoRecepients e ){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckRecepients2() throws Exception {
        System.out.println("Check for -1 recepients expecting NoRecepients error translated to false");
        int recCount = -1;
        EmptyRecepients instance = new EmptyRecepients();
        boolean expResult = false;
        boolean result;
        try{
            result = instance.checkRecepients(recCount);
        }
        catch(NoRecepients e ){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckRecepients3() throws Exception {
        System.out.println("Check for -2000000 recepients expecting NoRecepients error translated to false");
        int recCount = -2000000;
        EmptyRecepients instance = new EmptyRecepients();
        boolean expResult = false;
        boolean result;
        try{
            result = instance.checkRecepients(recCount);
        }
        catch(NoRecepients e ){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckRecepients4() throws Exception {
        System.out.println("Check for 1 recepients expecting no error returning true");
        int recCount = 1;
        EmptyRecepients instance = new EmptyRecepients();
        boolean expResult = true;
        boolean result;
        try{
            result = instance.checkRecepients(recCount);
        }
        catch(NoRecepients e ){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
    public void testCheckRecepients5() throws Exception {
        System.out.println("Check for 1000 recepients expecting no error returning true");
        int recCount = 1000;
        EmptyRecepients instance = new EmptyRecepients();
        boolean expResult = true;
        boolean result;
        try{
            result = instance.checkRecepients(recCount);
        }
        catch(NoRecepients e ){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
}
