package com.wuqi.linkedlist;

/**
 * @author wuqi
 * @Date 2018/12/8 11:48
 */
public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    /**
     * 队尾插入
     * @param t
     */
    public void insertTail(T t){
        Node<T> newNode = new Node<>(t,null);

        //空链表插入
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        //非空链表插入
        tail.next = newNode;
        tail = newNode;
    }

    /**
     * 删除头元素
     * @return
     */
    public T removeFirst(){
        if(head == null){
            return null;
        }

        Node<T> oldHead = head;
        head = head.next;
        oldHead.next = null;
        return oldHead.data;
    }


    class Node<O> {
        public O data;
        public Node next;

        public Node(O data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
