/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bstnode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Casa
 */
public class BSTTest {
    
    public BSTTest() {
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
     * Test of getRoot method, of class BST.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        BST instance = new BST();
        BSTNode expResult = null;
        BSTNode result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class BST.
     */
    @Test
    public void testPut() {
        System.out.println("Prueba para Agregar");
        System.out.println("put");
        String key = "testIsEmpty";
        Object value = null;
        BST instance = new BST();
        instance.put(key, value);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class BST.
     */
    @Test
    public void testGet() {
        System.out.println("Prueba para Buscar");
        System.out.println("get");
        String key = "testIsEmpty";
        BST instance = new BST();
        instance.put(key, key);
        Object expResult = "testIsEmpty";
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of InorderPrint method, of class BST.
     */
    @Test
    public void testInorderPrint() {
        System.out.println("InorderPrint");
        BSTNode root = null;
        BST.InorderPrint(root);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
