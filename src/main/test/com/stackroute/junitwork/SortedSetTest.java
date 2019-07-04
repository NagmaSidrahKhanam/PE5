package com.stackroute.junitwork;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSetTest {
    SortedSet sortedSetExample;
    @Before
    public void setUp() throws Exception {
        sortedSetExample=new SortedSet();
    }

    @After
    public void tearDown() throws Exception {
        sortedSetExample=null;
    }

    @Test
    public void sortArrayListUsingSortedSet() {
        String expected="[Alice, Bluto, Eugene, Harry, Olive]";
        String actual=sortedSetExample.sortArrayListUsingSortedSet("Harry Olive Alice Bluto Eugene");
        assertEquals(expected,actual);
    }

    @Test
    public void sortArrayListUsingSortedSetNull() {

        String actual=sortedSetExample.sortArrayListUsingSortedSet(null);
        assertNull(actual);
    }


}