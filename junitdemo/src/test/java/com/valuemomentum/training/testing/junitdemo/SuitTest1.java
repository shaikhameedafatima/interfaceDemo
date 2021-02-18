package com.valuemomentum.training.testing.junitdemo;

import org.junit.Test;



public class SuitTest1 {

 

    public String message = "Raj";                            

 

    jUnitMessage jUnitMessage = new jUnitMessage(message);                            

 

    @Test//(expected = ArithmeticException.class)    //junit exception test                
    public void testJUnitMessage() {                    

 

        System.out.println("Junit Message is printing ");                    
        jUnitMessage.printMessage();            

 

    }        

 

    @Test        
    public void testJUnitHiMessage() {                    
        message = "Hi " + message;                            
        System.out.println("Junit Hi Message is printing ");                    
        assertEquals(message, jUnitMessage.printHiMessage());                    
        System.out.println("Suite Test 1 is successful " + message);    

 

}}

