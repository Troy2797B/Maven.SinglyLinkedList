package com.zipcodewilmington.singlylinkedlist;

import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest(){
        SinglyLinkedList<E> myList = new SinglyLinkedList<E>();
        SinglyLinkedList.Node<E> nodeToAdd1 = "ZipCode";
        SinglyLinkedList.Node<E> nodeToAdd2 = "Wilmington";
        myList.add(nodeToAdd1);
        myList.add(nodeToAdd2);
        assertTrue(myList.size == 2);
    }

    @Test
    public void remove(){
        SinglyLinkedList<E> hereIsAList = new SinglyLinkedList<E>();
        SinglyLinkedList.Node<E> nodeToAdd1 = 1;
        SinglyLinkedList.Node<E> nodeToAdd2 = 2;
        SinglyLinkedList.Node<E> nodeToAdd3 = 3;
        SinglyLinkedList.Node<E> nodeToAdd4 = 4;
        SinglyLinkedList.Node<E> nodeToAdd5 = 5;
        hereIsAList.add(nodeToAdd1);
        hereIsAList.add(nodeToAdd2);
        hereIsAList.add(nodeToAdd3);
        hereIsAList.add(nodeToAdd4);
        hereIsAList.add(nodeToAdd5);
        hereIsAList.remove(nodeToAdd1);
        hereIsAList.remove(nodeToAdd3);
        hereIsAList.remove(nodeToAdd5);
        assertTrue(hereIsAList.contains(nodeToAdd2) &&
                hereIsAList.contains(nodeToAdd4) && hereIsAList.size() == 2);
    }
    @Test
    public void contains(){
        SinglyLinkedList<E> myList = new SinglyLinkedList<E>();
        SinglyLinkedList.Node<E> nodeToAdd1 = "ZipCode";
        SinglyLinkedList.Node<E> nodeToAdd2 = "Wilmington";
        myList.add(nodeToAdd1);
        myList.add(nodeToAdd2);
        assertTrue(myList.contains(nodeToAdd1));
    }
    @Test
    public void find(){
        SinglyLinkedList<E> hereIsAList = new SinglyLinkedList<E>();
        SinglyLinkedList.Node<E> nodeToAdd1 = 1;
        SinglyLinkedList.Node<E> nodeToAdd2 = 2;
        SinglyLinkedList.Node<E> nodeToAdd3 = 3;
        SinglyLinkedList.Node<E> nodeToAdd4 = 4;
        SinglyLinkedList.Node<E> nodeToAdd5 = 5;
        hereIsAList.add(nodeToAdd1);
        hereIsAList.add(nodeToAdd2);
        hereIsAList.add(nodeToAdd3);
        hereIsAList.add(nodeToAdd4);
        hereIsAList.add(nodeToAdd5);
        Integer expected = 3;
        Integer actual = hereIsAList.find(nodeToAdd4);
        assertEquals(expected, actual);
    }
    @Test
    public void size(){
        SinglyLinkedList<E> hereIsAList = new SinglyLinkedList<E>();
        SinglyLinkedList.Node<E> nodeToAdd1 = true;
        SinglyLinkedList.Node<E> nodeToAdd2 = true;
        SinglyLinkedList.Node<E> nodeToAdd3 = false;
        SinglyLinkedList.Node<E> nodeToAdd4 = true;
        SinglyLinkedList.Node<E> nodeToAdd5 = false;
        hereIsAList.add(nodeToAdd1);
        hereIsAList.add(nodeToAdd2);
        hereIsAList.add(nodeToAdd3);
        hereIsAList.add(nodeToAdd4);
        hereIsAList.add(nodeToAdd5);
        Integer expected = 5;
        Integer actual = hereIsAList.size();
        assertEquals(expected,actual);
    }
}
