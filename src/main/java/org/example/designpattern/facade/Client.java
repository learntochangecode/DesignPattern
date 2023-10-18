package org.example.designpattern.facade;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class Client {
    public static void main(String[] args) {
        //外观类
        Facade facade = new Facade();
        //打开电脑
        facade.open();
        //关闭电脑
        facade.down();
    }
}
