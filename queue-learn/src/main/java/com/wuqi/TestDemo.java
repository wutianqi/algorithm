package com.wuqi;

import com.wuqi.a.arrayqueue.ArrayQueue;
import com.wuqi.b.linkedqueue.LinkedQueue;
import com.wuqi.c.circulequeue.CirculeQueue;

/**
 * @author wuqi
 * @Date 2018/12/8 11:32
 */
public class TestDemo {
    public static void main(String[] args) {
//        testArrayQueue();
//        testLinkedQueue();
        testCirculeQueue();
    }

    private static void testCirculeQueue() {
        CirculeQueue queue = new CirculeQueue(5);

        //测试入队
        System.out.println(queue.enQueue("a"));
        System.out.println(queue.enQueue("b"));
        System.out.println(queue.enQueue("c"));
        System.out.println(queue.enQueue("d"));
        System.out.println(queue.enQueue("e"));

        //测试出队
        System.out.println(queue.outQueue());
        System.out.println(queue.enQueue("f"));
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
    }

    private static void testLinkedQueue() {
        LinkedQueue queue = new LinkedQueue();
        System.out.println(queue.enQueue("a"));
        System.out.println(queue.enQueue("b"));
        System.out.println(queue.enQueue("c"));
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.enQueue("d"));
        System.out.println(queue.outQueue());

    }

    private static void testArrayQueue() {
        ArrayQueue queue = new ArrayQueue(5);

        //测试入队
        System.out.println(queue.enQueue2("a"));
        System.out.println(queue.enQueue2("b"));
        System.out.println(queue.enQueue2("c"));
        System.out.println(queue.enQueue2("d"));
        System.out.println(queue.enQueue2("e"));

        //测试出队
        System.out.println(queue.outQueue());
        System.out.println(queue.enQueue2("f"));
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
        System.out.println(queue.outQueue());
    }
}
