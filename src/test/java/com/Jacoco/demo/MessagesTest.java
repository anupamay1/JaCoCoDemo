package com.Jacoco.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagesTest {
   @Test
    public void testName(){
        Messages msg = new Messages();
        Assertions.assertEquals("Hello Anupama!",msg.getMessage("Anupama"));
    }
    @Test
    public void testNameBlank(){
        Messages msg = new Messages();
        Assertions.assertEquals("Please provide a name",msg.getMessage(""));
    }
    @Test
    public void testNameNull(){
        Messages msg = new Messages();
        Assertions.assertEquals("Please provide a name",msg.getMessage(null));
    }

}