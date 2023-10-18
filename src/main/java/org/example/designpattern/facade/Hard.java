package org.example.designpattern.facade;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class Hard {
    private static Hard hard = new Hard();
    public static Hard getInstance() {
        return hard;
    }

    public void open() {
        System.out.println("打开硬盘");
    }

    public void down() {
        System.out.println("关闭硬盘");
    }
}
