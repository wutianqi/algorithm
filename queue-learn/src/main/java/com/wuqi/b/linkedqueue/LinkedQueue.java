package com.wuqi.b.linkedqueue;

import com.wuqi.linkedlist.MyLinkedList;

/**
 * 链表
 * @author wuqi
 * @Date 2018/12/8 12:00
 */
public class LinkedQueue {
    public MyLinkedList<Object> elements;

    public LinkedQueue(){
        this.elements = new MyLinkedList<>();
    }

    /**
     * 入队
     * @param element
     * @return
     */
    public boolean enQueue(Object element){
        elements.insertTail(element);
        return true;
    }

    /**
     * 出队
     * @return
     */
    public Object outQueue(){
        return elements.removeFirst();
    }
}
