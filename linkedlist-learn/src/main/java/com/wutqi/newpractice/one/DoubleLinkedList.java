package com.wutqi.newpractice.one;

/**
 * 双向链表
 * @author wuqi
 * @date 2020-05-22 17:30
 */
public class DoubleLinkedList {
    private int length;
    private Node root;


    /**
     * 添加数据
     * @param data
     */
    public void add(int data){
        if(root == null){
            root = new Node(data, null, null);
            return;
        }

        Node pos = root;
        Node pre = root;
        while (pos.next != null){
            pre = pos;
            pos = pos.next;
        }
        pos.next = new Node(data, pre, null);
        length++;
    }

    public void printAll(){
        if(root != null){
            Node pos = root;
            while (pos.next != null){
                System.out.print(pos.data + " ");
                pos = pos.next;
            }
            System.out.print(pos.data + " ");
        }
    }



    private class Node{
        public int data;
        public Node pre;
        public Node next;

        public Node(int data, Node pre, Node next){
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }
}
