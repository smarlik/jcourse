package day15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Node {
    //properties
    Node next;
    int data;

    //methods

    //constructors
    public Node(int newData) {
        data= newData;
        next= null;
    }
    public Node(int newData, Node newNext) {
        data= newData;
        next= newNext;
    }

    //getters + setters

    public int getData(){
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int newData) {
        data= newData;
    }

    public void setNext(Node newNode) {
        next= newNode;
    }
}

