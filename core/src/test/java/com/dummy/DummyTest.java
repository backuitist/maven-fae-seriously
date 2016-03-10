package com.dummy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {
    @Test
    public void testMsg() {
        assertEquals(Dummy.msg, "blabla");
    }

}