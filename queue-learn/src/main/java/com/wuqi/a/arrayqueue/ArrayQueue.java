package com.wuqi.a.arrayqueue;

/**
 * 顺寻队列，底层通过数组来实现
 * @author wuqi
 * @Date 2018/12/8 11:10
 */
public class ArrayQueue {
    private Object[] elements;
    private int head;
    private int tail;
    private int capcity;
    private int length;

    public ArrayQueue(int capcity){
        elements = new Object[capcity];
        this.capcity = capcity;
    }

    /**
     * 入队，当tail到达队尾时，判断数组中是否还有多余空间
     * 有多余空间则进行数据搬迁
     * @param element
     * @return
     */
    public boolean enQueue(Object element){
        if(tail == capcity){
            if(head == 0){
                return false;
            }

            //数据搬迁
            for(int i=head ; i<tail ; i++){
                elements[i-head] = elements[i];
            }

            tail = tail - head;
            elements[tail] = element;
            head = 0;
            tail++;
            return true;
        }

        elements[tail] = element;
        tail++;
        return true;
    }

    /**
     * 入队操作，队满通过长度来判断
     * @param element
     * @return
     */
    public boolean enQueue2(Object element){
        if(length == capcity){
            return false;
        }

        //数据搬迁
        if(tail == capcity){
            for(int i=head ; i<tail ; i++){
                elements[i-head] = elements[i];
            }

            tail = tail - head;
            elements[tail] = element;
            head = 0;
            tail++;
            length++;
            return true;
        }

        elements[tail] = element;
        tail++;
        length++;
        return true;
    }

    /**
     * 出队
     * @return
     */
    public Object outQueue(){
        if(head == tail){
            return null;
        }

        Object ret = elements[head];
        head++;
        length--;
        return  ret;
    }

}
