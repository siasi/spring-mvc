package org.siasi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.ui.ModelMap;

public class HelloControllerTest 
{
    @Test
    public void test_shouldReturnIndex()
    {
        assertEquals("index", new HelloController().printWelcome(new ModelMap()) );
    }
}
