package com.wutqi.newpractice.one;

/**
 * 单向链表
 *
 * @author wuqi
 * @date 2020-05-22 15:13
 */
public class SingleLinkedList {
    //链表的长度
    private int length;

    //根节点
    private Node root;


    /**
     * 添加数据
     * @param data
     */
    public void add(int data){
        if(root == null){
            root = new Node(data, null);
            return;
        }

        Node pos = root;
        while (pos.next != null){
            pos = pos.next;
        }
        pos.next = new Node(data, null);
        length++;
    }

    //遍历
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

    /**
     * 长度
     * @return
     */
    public int length(){
        return length;
    }

    /**
     * 插入
     * @param newData 新数据
     * @param data 指定数据
     */
    public void addAfter(int newData, int data){
        if(root == null){
            return;
        }

        Node pos = root;
        while (pos != null){
            if(pos.data == data){
                //d-c
                //b-d
                pos.next = new Node(newData, pos.next);
                length++;
                return;
            }
            pos = pos.next;
        }
    }

    /**
     * 删除元素
     * @param data 需要删除的元素
     */
    public void delete(int data){
        //a-b-c
        if(root == null){
            return;
        }

        Node pos = root;
        Node pre = null;
        while (pos != null){
            if(pos.data == data){
                if(pre != null){
                    pre.next = pos.next;
                }
                pos.next = null;
                length--;
            }

            pre = pos;
            pos = pos.next;
        }
    }


    private class Node{
        //数据
        public int data;
        //后继节点
        public Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
