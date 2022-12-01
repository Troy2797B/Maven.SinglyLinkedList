package com.zipcodewilmington.singlylinkedlist;
//DONT DELETE THIS DELETE THE OTHER ONE
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<E> {
    //these have no reason to be accessed outside this class so yeah that is why they are private
    //these are the atributes of the singly linked list...
    private Node<E> first;
    private int size;

    //gotta make the constructor....you really gotta get better at this
    //you don't even need accessors or mutators for the fields!!!
    public SinglyLinkedList(){
        this.first = null;
        this.size = 0;
    }
    //inner node class is static because you can really only access the nodes from an instance of SinglyLinkedList
    //inner classes aren't really great practice, but in this case linked lists are made of nodes... so it is alright
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
        private Node (E obj, Node<E> nextRef){
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

    //ok ok so the parameters have to be node <e> and not just e because
    //we literally are adding the nodes and not the values...
    public void add(Node<E> nodeToAdd){

    }
    public void remove(Node<E> nodeToRemove){}
    public boolean contains(Node<E> nodeToCheck){
        return false;
    }
    public Integer find(Node<E> nodeToFind){
//        SinglyLinkedList<E> a = new SinglyLinkedList<E>();
//        for (int i = 0; i < a.size; i++) {
//            if (a.get(i).contains(nodeToFind)) {
//                return i;
//            }
//        } return -1;
        return -1;
    }
    public Integer size(){
        SinglyLinkedList<E> a = new SinglyLinkedList<E>();
        for (int i = 0; i < a.size; i++) {
            size++;
        }
        return size;
    }
    public Node<E> get(Integer index){
        return new Node<E>(null);
    }
    public SinglyLinkedList<E> copy(SinglyLinkedList<E> listToCopy){
        //look up deep vs shallow copy
        return new SinglyLinkedList<E>();
    }
    public void sort(SinglyLinkedList<E> listToSort){

    }
}

