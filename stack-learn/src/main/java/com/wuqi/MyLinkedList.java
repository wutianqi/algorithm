package com.wuqi;

/**
 * 链表
 * @author wuqi
 * @Date 2018/12/6 11:30
 */
public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    /**
     * 尾部插入
     * @param value
     */
    public void insertTail(T value){
        Node<T> newNode = new Node(value,null,null);
        if(tail == null){
            head = newNode;
            tail = newNode;
            length++;
            return;
        }

        newNode.pre = tail;
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    /**
     * 移除最后一个元素
     * @return
     */
    public T removeLast(){
        if(length == 0){
            return null;
        }

        T retValue = tail.data;

        if(length == 1){
            head = null;
            tail = null;
            length--;
            return retValue;
        }


        Node tailPre = tail.pre;
        tailPre.next = null;
        tail.pre = null;
        tail = tailPre;
        length--;
        return  retValue;
    }

    public int length(){
        return length;
    }



    class Node<t>{
        public t data;
        public Node<t> pre;
        public Node<t> next;

        public Node(t data, Node<t> pre, Node<t> next){
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }
}
