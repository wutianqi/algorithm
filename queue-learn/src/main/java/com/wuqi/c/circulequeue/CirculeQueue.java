package com.wuqi.c.circulequeue;

/**
 * 循环数组队列
 * @author wuqi
 * @Date 2018/12/8 12:08
 */
public class CirculeQueue {
    private Object[] elements;
    private int capcity;
    private int head;
    private int tail;

    public CirculeQueue(int capcity){
        elements = new Object[capcity];
        this.capcity = capcity;
    }

    /**
     * 入队
     * @param element
     * @return
     */
    public boolean enQueue(Object element){
        //队满
        if((tail + 1)%capcity == head) return false;

        elements[tail] = element;
        tail = (tail + 1)%capcity;
        return true;
    }

    /**
     * 出队
     * @return
     */
    public Object outQueue(){
        //队空
        if(head == tail) return null;

        Object ret = elements[head];
        head = (head + 1)%capcity;
        return ret;
    }


}
