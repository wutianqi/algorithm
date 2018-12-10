package com.wuqi;

/**
 * 顺序栈
 * @author wuqi
 * @Date 2018/12/6 11:04
 */
public class ArrayStack {
    private static final int DEFAULT_SIZE = 12;
    private int[] elements;
    private int size;
    private int point;

    public ArrayStack(int size){
        this.size = size;
        elements = new int[size];
    }

    public ArrayStack(){
        this.size = DEFAULT_SIZE;
        elements = new int[size];
    }

    /**
     * 入栈
     * @param element
     * @return
     */
    public int push(int element){
        if(point == size){
            System.out.println("栈中空间用完，将扩充容量");
            int[] newElements = new int[2 * size];
            for (int i = 0; i < elements.length; i++){
                newElements[i] = elements[i];
            }
            newElements[point] = element;
            elements = newElements;
            point++;
            return 1;
        }

        elements[point] = element;
        point++;

        return 1;
    }

    /**
     * 出栈
     * @return
     */
    public int pop(){
        if(point == 0){
            throw new RuntimeException("角标越界");
        }
        return elements[--point];
    }

    /**
     * 判断栈中是否还有元素
     * @return
     */
    public boolean hasElement(){
        return point != 0;
    }

    /**
     * 查看栈顶的元素
     * @return
     */
    public int viewTopElement(){
        if(point != 0){
            return elements[point - 1];
        }

        throw new RuntimeException("栈中无元素");
    }

    /**
     * 栈的长度
     * @return
     */
    public int length(){
        return point;
    }

    /**
     * 清空栈
     */
    public void clear(){
        point = 0;
    }
}
