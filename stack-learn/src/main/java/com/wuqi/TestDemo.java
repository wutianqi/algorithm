package com.wuqi;

/**
 * @author wuqi
 * @Date 2018/12/6 11:21
 */
public class TestDemo {
    public static void main(String[] args) {
//        testArrayStack();
        testLinkStack();
    }

    private static void testLinkStack() {
        LinkStack stack = new LinkStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        while (stack.length() != 0){
            System.out.println(stack.pop());
        }

    }

    private static void testArrayStack() {
        ArrayStack stack = new ArrayStack();
        for(int i = 0; i < 13; i++){
            stack.push(i);
        }
//        stack.push(2);
//        stack.push(3);
//        stack.push(12);
//        stack.push(56);
//        stack.push(222);
//        stack.push(223);

        while (stack.hasElement()){
            System.out.println(stack.pop());
        }

    }
}
