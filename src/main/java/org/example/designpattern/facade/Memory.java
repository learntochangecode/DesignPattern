package org.example.designpattern.facade;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class Memory {
    private static Memory memory = new Memory();
    public static Memory getInstance() {
        return memory;
    }

    public void open() {
        System.out.println("打开内存");
    }

    public void down() {
        System.out.println("关闭内存");
    }
}
