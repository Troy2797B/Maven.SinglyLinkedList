package com.zipcodewilmington.singlylinkedlist;
//DONT DELETE THIS DELETE THE OTHER ONE
/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList{
    public static class Node{
        private int data;
        private Node next;

        private Node (int obj){
            this.data = obj;
            this.next = null;
        }
    }

    private Node first;
    private Node last;


    public void add(int data){
        Node newNode = new Node(data);

        if (first == null){
            first = newNode;
            last = newNode;
        } else {
            last.next=newNode;
            last = newNode;
        }
    }
    public void remove(int index) throws Exception {
        int count =0;
        Node current = first;
        if(current == null){
            throw new Exception("You know better.");
        }
        while (current != null){
            if (count != index){
                current = current.next;
                count++;
            }
            if (count == index){
               current = null;
            }
        }

    }
    public boolean contains(int value){
        Node current = first;
        if(current == null){
            return false;
        }
        while (current != null && current.data != value){
            current = current.next;
        }
        if (current != null && current.data == value){
            return true;
        } return false;
    }
    public Integer find(int value, SinglyLinkedList list){
        Node current = first;
        int count = 0;
        if (!list.contains(value)){
            return -1;
        }
        while (current != null){
            if (current.data != value){
                current = current.next;
                count++;
            }
            if (current.data == value){
                return count;
            }
        } return count;
    }
    public Integer sizeOfList(SinglyLinkedList list){
        Node current = last;
        return list.find(current.data, list) + 1;
    }
    public Integer get(Integer index, SinglyLinkedList list){
        Node current = first;
        int count = 0;
        if (list.sizeOfList(list) < index){
            throw new IllegalArgumentException();
        }
        while (current != null){
            if (current.data != value){
                current = current.next;
                count++;
            }
            if (current.data == value){
                return count;
            }
        } return count;
    }
    public SinglyLinkedList copy(SinglyLinkedList listToCopy){
        //look up deep vs shallow copy
        return new SinglyLinkedList();
    }
    public void sort(SinglyLinkedList listToSort){

    }
    public int compareTo(Object o) {
        return 0;
    }
}
//so what makes up a node? prolly the data that holds it and the reference to get to the next node
//the data holds the type E by itself... idk.
//data stores the value of the node, next stores the address of the node

//constructors for Node you put in an obj and that obj is now the data.
//then the node also holds the reference to this next one
//When there is no parameter to reference the next node, the next node will be null...
//gotta make the constructor....you really gotta get better at this
//you don't even need accessors or mutators for the fields!!!
//    public SinglyLinkedList(){
//        this.first = null;
//    }



//inner node class is static because you can really only access the nodes from an instance of SinglyLinkedList
//inner classes aren't really great practice, but in this case linked lists are made of nodes... so it is alright

//I'm adding methods down here because, from my understanding,
// the node class can only be accessed from an instance of the outer class.
//So in my mind you can't use these methods in the inner class...
//Soo... we'll see what happens.

//these are just void rn because idk what to do...
//also intellij stop correcting me on my comments, ugly...

//ok ok so the parameters have to be node <e> and not just e because
//we literally are adding the nodes and not the values...

