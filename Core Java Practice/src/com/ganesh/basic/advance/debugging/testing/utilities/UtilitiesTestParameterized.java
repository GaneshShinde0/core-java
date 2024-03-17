package com.ganesh.basic.advance.debugging.testing.utilities;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private Utilities util;
    private final String input;
    private final String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][]{{"ABCDEFF", "ABCDEF"}, {"AB11E223", "AB1E23"}, {"2233664499", "23649"}, {"G", "G"},

        });
    }

    @Before
    public void setup() {
        util = new Utilities();
    }

    @Test
    public void removePairs() throws Exception {
        assertEquals(output, util.removePairs(input));
    }
}
