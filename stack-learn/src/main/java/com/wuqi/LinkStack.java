package com.wuqi;

/**
 * 链式栈
 * @author wuqi
 * @Date 2018/12/6 11:29
 */
public class LinkStack<T> {

    private MyLinkedList<T> elements;

    public LinkStack(){
        this.elements = new MyLinkedList<>();
    }

    /**
     * 入栈
     * @param value
     * @return
     */
    public int push(T value){
        elements.insertTail(value);
        return 1;
    }

    /**
     * 出栈
     * @return
     */
    public T pop(){
        return elements.removeLast();
    }

    public int length(){
        return elements.length();
    }
}
