package com.ganesh.basic.advance.debugging.testing.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @Before
    public void setup() {
        util = new Utilities();
    }

    @Test
    public void everyNthChar() throws Exception{
        char[] output = util.everyNthChar(new char[]{'A', 'B', 'C', 'C', 'D', 'F', 'F'}, 2);
        assertArrayEquals(new char[]{'B', 'C', 'F'}, output);
        char[] output2 = util.everyNthChar(new char[]{'A', 'B', 'C', 'C', 'D', 'F', 'F'}, 10);
        assertArrayEquals(new char[]{'A', 'B', 'C', 'C', 'D', 'F', 'F'}, output2);
    }

    @Test
    public void removePairs() throws Exception{
        assertEquals("ABCDF", util.removePairs("ABCCDFF"));
        assertEquals("ASDF", util.removePairs("ASDFFF"));
    }

    @Test
    public void convert() throws Exception{
        assertEquals(util.convert(4, 2), 120);
    }

    @Test(expected = ArithmeticException.class)
    public void convert_arithmeticException() throws Exception {
        util.convert(10, 0);
    }

    @Test
    public void nullIfOddLength() throws Exception{
        assertNull(util.nullIfOddLength("ASDFG"));
        assertNotEquals(util.nullIfOddLength("ASDF"), null);

    }
}
