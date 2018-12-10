package com.wuqi;

/**
 * 栈实现浏览器的前进后退功能
 * @author wuqi
 * @Date 2018/12/6 13:23
 */
public class BroswerFunction {
    ArrayStack currentPage = new ArrayStack();
    ArrayStack backPage = new ArrayStack();

    /**
     * 查看页面
     * @param page
     */
    public void viewPage(int page){
        currentPage.push(page);
        backPage.clear();
        System.out.println("你当前所在" + page + "页面");
    }

    /**
     * 后退
     */
    public void back(){
        if(!currentPage.hasElement()){
            System.out.println("你还没有访问浏览器的页面");
            return;
        }

        if(currentPage.length() == 1){
            System.out.println("你已经在最后的" + currentPage.viewTopElement() + "页面了，不能再往后退了");
            return;
        }

        int pop = currentPage.pop();
        backPage.push(pop);
        System.out.println("你当前所在" + currentPage.viewTopElement() + "页面");
    }

    /**
     * 前进
     */
    public void forward(){
        if(!currentPage.hasElement()){
            System.out.println("你还没有访问浏览器的页面");
            return;
        }

        if(!backPage.hasElement()){
            System.out.println("你已经在最前的" + currentPage.viewTopElement() + "页面了，不能再往前了");
            return;
        }

        int pop = backPage.pop();
        currentPage.push(pop);
        System.out.println("你当前所在" + currentPage.viewTopElement() + "页面");
    }


    public static void main(String[] args) {
        BroswerFunction browser = new BroswerFunction();
        //查看页面1，2，3
        browser.viewPage(1);
        browser.viewPage(2);
        browser.viewPage(3);

        //后退到2页面
        browser.back();
        //后退到1页面
//        browser.back();
        //再次后退
//        browser.back();

        //前进到3页面
//        browser.forward();
//        browser.forward();
//        browser.forward();

        browser.viewPage(4);
        browser.back();
        browser.forward();
        browser.forward();
    }

}
