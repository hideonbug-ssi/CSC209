/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sll_lab;

/**
 *
 * @author User
 */
public class SinglyLinkedList {
    SLLNode head, tail;
    
    public SinglyLinkedList(){
        head = tail = null;
    }
    
    public void addToTail(int newValue){
        if(head == null){
            head = tail = new SLLNode(newValue, null);
        }else{
            tail.next = new SLLNode(newValue, null);
            tail = tail.next;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addToHead(int newValue){
        if(isEmpty()){
            head = tail = new SLLNode(newValue, head);
        }else{
            head = new SLLNode(newValue, head);
        }
        //create new node
        //put val of newVal in2 the new node
        //mske next of the new node pointing to og head
        //head points to new node
    }
    public int deleteFromHead(){
        int firstInfo = head.info;
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
        return firstInfo;
    }
    public void printAllNode(){
        for (SLLNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.info + "=>");
        }
        System.out.println(" end at null");
    }
    public int deleteFromTail(){
        if(head == null){
            return -1;
        }else if(head == tail){
                int lastInfo = tail.info;
                head = tail = null;
                return lastInfo;
        }else{
            int lastInfo = tail.info;
            SLLNode temp;
            for (temp = head; temp.next != tail; temp = temp.next);
            temp.next = null;
            tail = temp;
            return lastInfo;
        }
    }
//    public int deleteIthNode(int i){
//    
//    }
    public void insertNodeAtIthInMiddle(int i, int newValue){
        
    }
}
