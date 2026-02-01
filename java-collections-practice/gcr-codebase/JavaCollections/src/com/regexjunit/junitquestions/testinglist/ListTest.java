package com.regexjunit.junitquestions.testinglist;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    List<Integer> list;
    ListManager manager;

    @BeforeEach
    void setup() {
        list = new ArrayList<>();
        manager = new ListManager();
        list.add(10);
    }

    @Test
    void testAdd() {
        assertEquals(20, manager.addElement(list, 20));
        assertTrue(list.contains(20));
    }

    @Test
    void remove() {
        assertTrue(manager.removeElement(list, 10));
        assertFalse(list.contains(10));
    }

    @Test
    void getSize() {
        assertEquals(1, manager.getSize(list));
    }
}
