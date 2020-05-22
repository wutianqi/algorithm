package com.wutqi.newpractice.one;

/**
 * 双向链表测试类
 * @author wuqi
 * @date 2020-05-22 17:45
 */
public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        for (int i=0;i<10;i++){
            doubleLinkedList.add(i);
        }

        doubleLinkedList.printAll();
    }
}
