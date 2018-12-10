package com.wutqi;

/**
 * 链表实现
 * @author wuqi
 * @Date 2018/12/4 11:35
 */
public class MyLinkedList {
    /**
     * 头节点
     */
    private Node head;

    /**
     * 顺序插入
     * @param value
     */
    public void insertTail(int value){
        Node newNode = new Node(value,null);
        //空列表
        if(head == null){
            head = newNode;
            System.out.println("插入第一个元素" + value);
            return;
        }

        Node point = head;
        while (point.next != null){
            point = point.next;
        }
        point.next = newNode;
        if(newNode.getData() == 10){
            newNode.next = head;
        }
        System.out.println("插入元素" + value);
    }

    /**
     * 打印所有节点数据
     */
    public void printAll(){
        Node point = head;
        while (point != null){
            System.out.print(point.getData() + " ");
            point = point.next;
        }
        System.out.println();
    }

    /**
     * 判断是否为回文序列
     * @return
     */
    public boolean palindrome(){
        //空列表
        if(head == null){
            return false;
        }
        //只有一个元素
        if(head.next == null){
            return true;
        }

        //快慢指针查找中点
        Node p = head;
        Node q = head;
        while (q.next != null && q.next.next != null){
            p = p.next;
            q = q.next.next;
        }

        System.out.println("找到中间节点" + p.getData() + ",进行回文序列的判断");
        Node left = null;
        Node rigth = null;
        if(q.next == null){
            //有奇数个元素，p一定是中间节点
            rigth = p.next;
            left = inverseLinkList(p).next;
        } else {
            //有偶数个元素
            rigth = p.next;
            left = inverseLinkList(p);
        }

        return TFResult(left,rigth);

    }

    /**
     * 对比左右两个链表是否相同
     * @param left
     * @param rigth
     * @return
     */
    private boolean TFResult(Node left, Node rigth) {
        while (left != null && rigth != null){
            System.out.println("left: " + left.getData() + ", rigth: " + rigth.getData());
            if(left.getData() != rigth.getData()){
                return false;
            }
            left = left.next;
            rigth = rigth.next;
        }

        return true;
    }

    /**
     * 反转链表,不改变链表的顺序
     * @param p
     * @return
     */
    public Node inverseLinkList(Node p){
        Node inverseNode = new Node(p.getData(), null);
        if(p == head){
            //只有一个元素
            return inverseNode;
        }

        Node point = head;
        while (point != p){
            Node addNode = new Node(point.getData(), null);
            if(inverseNode.next != null){
                addNode.next = inverseNode.next;
                inverseNode.next = addNode;
            } else {
                inverseNode.next = addNode;
            }
            point = point.next;
        }
        return inverseNode;
    }

    /**
     * 链表反转，改变链表顺序
     * @param p
     * @return
     */
    public Node inverseLinkListChange(Node p){
        Node pre = null;
        Node next = null;
        Node curr = head;

        while (curr != p){
            //记录下一个元素
            next = curr.next;
            //将当前元素指向上一个元素
            curr.next = pre;
            //上一个元素记为当前元素
            pre = curr;
            //当前元素向后移动一位
            curr = next;
        }

        //到达p节点时，将当前节点指向上一位，结束反转
        curr.next = pre;
        return curr;
    }

    /**
     * 检测链表中是否有环
     * @return
     */
    public boolean cycleLinekdList(){
        if(head == null || head.next == null){
            System.out.println("没有或只有一个元素，没有环");
            return false;
        }

        Node p = head;
        Node q = head.next;
        while (q.next != null && q.next.next != null && p != q){
            p = p.next;
            q = q.next.next;
        }

        if(q.next == null || q.next.next == null){
            System.out.println("快指针到达终点，不成环");
            return false;
        }

        System.out.println("快慢指针在p = " + p.getData() + ",q = " + q.getData() + "相遇，链表中有环");
        return true;
    }


    private class Node{
        public int data;
        public Node next;

        public Node(int data, Node node){
            this.data = data;
            this.next = node;
        }

        public int getData(){
            return this.data;
        }
    }


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.insertTail(1);
        linkedList.insertTail(12);
        linkedList.insertTail(5);
        linkedList.insertTail(3);
        linkedList.insertTail(1);
        linkedList.insertTail(2);
        linkedList.insertTail(10);
//        linkedList.printAll();
//        boolean palindrome = linkedList.palindrome();
//        System.out.println("是回文序列？" + palindrome);
//        linkedList.printAll();

        System.out.println(linkedList.cycleLinekdList());
    }
}
