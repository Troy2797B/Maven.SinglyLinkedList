package com.zipcodewilmington.singlylinkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest(){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(3);
        myList.add(8);
        assertTrue(myList.sizeOfList(myList) == 2);
    }

//    @Test
//    public void remove() throws Exception {
//        SinglyLinkedList hereIsAList = new SinglyLinkedList();
//
//        hereIsAList.add(1);
//        hereIsAList.add(2);
//        hereIsAList.add(3);
//        hereIsAList.add(4);
//        hereIsAList.add(5);
//        hereIsAList.remove(1);
//        hereIsAList.remove(3);
//        hereIsAList.remove(5);
//        assertTrue(hereIsAList.contains(1) && hereIsAList.contains(3) && hereIsAList.contains(5));
//        assertTrue(hereIsAList.contains(2) &&
//                hereIsAList.contains(4) && hereIsAList.sizeOfList(hereIsAList) == 2);
//    }
    @Test
    public void contains(){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(5);
        myList.add(6);
        myList.add(3);
        myList.add(8);
        assertTrue(myList.contains(6));
    }
    @Test
    public void find(){
        SinglyLinkedList hereIsAList = new SinglyLinkedList();
        hereIsAList.add(4);
        hereIsAList.add(3);
        hereIsAList.add(7);
        hereIsAList.add(1);
        Integer expected = 1;
        Integer actual = hereIsAList.find(3, hereIsAList);
        assertEquals(expected, actual);
    }
    @Test
    public void sizeOfList(){
        SinglyLinkedList hereIsAList = new SinglyLinkedList();
        hereIsAList.add(7);
        hereIsAList.add(3);
        hereIsAList.add(9);
        hereIsAList.add(2);
        hereIsAList.add(5);
        Integer expected = 5;
        Integer actual = hereIsAList.sizeOfList(hereIsAList);
        assertEquals(expected,actual);
    }

    @Test
    public void getTest(){
        SinglyLinkedList hereIsAList = new SinglyLinkedList();
        hereIsAList.add(7);
        hereIsAList.add(3);
        hereIsAList.add(9);
        hereIsAList.add(2);
        hereIsAList.add(5);
        Integer expected = 5;
        Integer actual = hereIsAList.get(4, hereIsAList);
        assertEquals(expected, actual);
    }

//    @Test
//    public void copyTest(){
//        SinglyLinkedList hereIsAList = new SinglyLinkedList();
//        hereIsAList.add(7);
//        hereIsAList.add(3);
//        hereIsAList.add(9);
//        hereIsAList.add(2);
//        hereIsAList.add(5);
//
//        Integer expected = hereIsAList.sizeOfList(hereIsAList);
//        Integer actual = hereIsAList.copy1(hereIsAList).sizeOfList(hereIsAList);
//        assertSame(actual, expected);
//    }
}
