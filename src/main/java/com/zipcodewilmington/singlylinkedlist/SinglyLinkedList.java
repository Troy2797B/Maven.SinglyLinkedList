package com.zipcodewilmington.singlylinkedlist;
//DONT DELETE THIS DELETE THE OTHER ONE
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    //these have no reason to be accessed outside this class so yeah that is why they are private
    //these are the atributes of the singly linked list...
    private Node<E> first;
    private int size;

    //gotta make the constructor....you really gotta get better at this
    //you don't even need accessors or mutators for the fields!!!
    public SinglyLinkedList(){
        first = null;
        size = 0;
    }
    //inner node class is static because you can really only access the nodes from an instance of SinglyLinkedList
    public static class Node<E>{
        //so what makes up a node? prolly the data that holds it and the reference to get to the next node
        //the data holds the type E by itself... idk.
        private E data;
        private Node<E> next;

        //constructors for Node you put in an obj and that obj is now the data. then the node also holds the reference to this next one
        //When there is no parameter to reference the next node, the next node will be null...
        private Node (E obj){
            data = obj;
            next = null;
        }
        private Node (E obj, Node nextRef){
            data = obj;
            next = nextRef;
        }
        //METHODS to be added
//        add -- add an element to the list
//        remove -- remove an element (specified by numeric index) from the list
//        contains -- returns true if the element is in the list, false otherwise
//        find -- returns the element's index if it is in the list, -1 otherwise
//        size -- returns the current size of the list
//        get -- returns the element at the specified index
//        copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//        sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)


    }
    //I'm adding methods down here because, from my understanding,
    // the node class can only be accessed from an instance of the outer class.
    //So in my mind you can't use these methods in the inner class...
    //Soo... we'll see what happens.

    //these are just void rn because idk what to do...
    //also intellij stop correcting me on my comments, ugly...
    public void add(E objToAdd){
        if ()
    }
    public void remove(E objToRemove){}
    public void contains(E objToCheck){}
    public void find(E objToFind){}
    public Integer size(){
        return size;
    }
    public void get(){}
    public void copy(){}
    public void sort(){}
}

