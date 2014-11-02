/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exceptions.InvalidEmailException;
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
public class emailAddressCheckTest {
    
    public emailAddressCheckTest() {
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
     * Test of checkaddress method, of class emailAddressCheck.
     */
    @Test
    public void testCheckaddress() throws Exception {
        System.out.println("Check empty address\n");
        String address = "";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = false;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testCheckaddress2() throws Exception {
        System.out.println("Check invalid address @.gr\n");
        String address = "@.gr";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = false;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCheckaddress3() throws Exception {
        System.out.println("Check invalid address ates@.gr\n");
        String address = "ates@.gr";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = false;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testCheckaddress4() throws Exception {
        System.out.println("Check invalid address atest@test.coomm\n");
        String address = "atest@test.coomm";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = false;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
    
      @Test
    public void testCheckaddress5() throws Exception {
        System.out.println("Check invalid address atest.test@coomm\n");
        String address = "address atest.test@coomm";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = false;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
    
       @Test
    public void testCheckaddress6() throws Exception {
        System.out.println("Check invalid address atest.test.coom\n");
        String address = "atest.test.coom";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = false;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
    
           @Test
    public void testCheckaddress7() throws Exception {
        System.out.println("Check invalid address atest@test@coo\n");
        String address = "atest.test@coo";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = false;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
    
               @Test
    public void testCheckaddress8() throws Exception {
        System.out.println("Check valid address atest@gmail.com\n");
        String address = "atest@gmail.com";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = true;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
    
                   @Test
    public void testCheckaddress9() throws Exception {
        System.out.println("Check valid address atest@gmail.eu\n");
        String address = "atest@gmail.eu";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = true;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
    
    public void testCheckaddress10() throws Exception {
        System.out.println("Check valid address a_test_@gmail.gr\n");
        String address = "a_test_@gmail.gr";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = true;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
        
    public void testCheckaddress11() throws Exception {
        System.out.println("Check valid address a_test123_@gmail.gr\n");
        String address = "a_test123_@gmail.gr";
        emailAddressCheck instance = new emailAddressCheck();
        boolean expResult = true;
        boolean result;
        try{ result = instance.checkaddress(address);}
        catch(InvalidEmailException e){
            result = false;
        }
        assertEquals(expResult, result);
        
    }
}
