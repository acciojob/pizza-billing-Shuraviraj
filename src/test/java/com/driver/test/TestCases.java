package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.DeluxePizza;
import com.driver.Pizza;

public class TestCases {
    @Test
    public void testStringConcatenation() {
        String result = "Hello, " + "world!";
        assertEquals("Hello, world!", result);
    }
}
