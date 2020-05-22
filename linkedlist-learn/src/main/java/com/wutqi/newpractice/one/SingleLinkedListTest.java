package com.wutqi.newpractice.one;

/**
 * 单向链表测试类
 * @author wuqi
 * @date 2020-05-22 16:19
 */
public class SingleLinkedListTest {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for (int i=0;i<10;i++){
            //新增
            singleLinkedList.add(i);
        }

        //打印
        singleLinkedList.printAll();

        //插入
        singleLinkedList.addAfter(111, 5);

        //再次打印
        System.out.println();
        singleLinkedList.printAll();

        //删除元素
        singleLinkedList.delete(111);

        //再次打印
        System.out.println();
        singleLinkedList.printAll();

    }
}
