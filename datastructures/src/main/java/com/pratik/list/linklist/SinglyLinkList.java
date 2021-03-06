package com.pratik.list.linklist;

import com.pratik.list.List;

public class SinglyLinkList<T> implements List<T> {

    Node start;
    Node end;
    Node current;
    private int position=0;

    private class Node{
        T element;
        Node next;

        private T getElement() {
            return element;
        }

        private Node getNext() {
            return next;
        }
    }

    @Override
    public void add(T element) {
        if(this.start==null){
            this.start=new Node();
            this.start.element=element;
            this.start.next=null;
            this.end=this.start;
            this.current=this.start;
        }
        else {
            Node tmp = new Node();
            tmp.element = element;
            this.current.next = tmp;
            tmp.next = null;
            this.end = tmp;
            this.current=tmp;
        }
        this.position++;
    }

    @Override
    public void add(int index, T element) {
        throw new RuntimeException("Not Defined");
    }


    @Override
    public T get(int index) {
        Node travesedElement=start;
        for(int count=0;count<index;count++){
            travesedElement=travesedElement.getNext();
        }
        return travesedElement.getElement();
    }

    @Override
    public void remove(T element) {
        Node currentNode=this.start;
        Node previousNode=currentNode;
        if(element.equals(currentNode.getElement())){
            this.start=currentNode.getNext();
        }
        for(int count=0;count<position;count++){
            currentNode=currentNode.getNext();
            if(element.equals(currentNode.getElement())){
                previousNode.next=currentNode.getNext();
                position--;
            }
            previousNode=currentNode;
        }

    }

    @Override
    public int size() {
        return this.position;
    }
}
