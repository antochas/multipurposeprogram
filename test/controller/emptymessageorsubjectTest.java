/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exceptions.EmptyBodySubjException;
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
public class emptymessageorsubjectTest {
    
    public emptymessageorsubjectTest() {
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
     * Test of checkMessageandSubject method, of class emptymessageorsubject.
     */
    @Test
    public void testCheckMessageandSubject() throws Exception {
        System.out.println("checkMessageandSubject message=\"\" subject=\"\" expecting EmptyBodySubjException translated to false");
        String msg = "";
        String sbj = "";
        emptymessageorsubject instance = new emptymessageorsubject();
        boolean expResult = false;
        boolean result;
        try{
            result = instance.checkMessageandSubject(msg, sbj);
        }
        catch(EmptyBodySubjException e){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckMessageandSubject2() throws Exception {
        System.out.println("checkMessageandSubject message=\"test\" subject=\"\" expecting EmptyBodySubjException translated to false");
        String msg = "test";
        String sbj = "";
        emptymessageorsubject instance = new emptymessageorsubject();
        boolean expResult = false;
        boolean result;
        try{
            result = instance.checkMessageandSubject(msg, sbj);
        }
        catch(EmptyBodySubjException e){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckMessageandSubject3() throws Exception {
        System.out.println("checkMessageandSubject message=\"\" subject=\"test\" expecting EmptyBodySubjException translated to false");
        String msg = "";
        String sbj = "test";
        emptymessageorsubject instance = new emptymessageorsubject();
        boolean expResult = false;
        boolean result;
        try{
            result = instance.checkMessageandSubject(msg, sbj);
        }
        catch(EmptyBodySubjException e){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCheckMessageandSubject4() throws Exception {
        System.out.println("checkMessageandSubject message=\"test\" subject=\"test\" expecting no error result true");
        String msg = "test";
        String sbj = "test";
        emptymessageorsubject instance = new emptymessageorsubject();
        boolean expResult = true;
        boolean result;
        try{
            result = instance.checkMessageandSubject(msg, sbj);
        }
        catch(EmptyBodySubjException e){
            result = false;
        }
        assertEquals(expResult, result);
    }
    
}
