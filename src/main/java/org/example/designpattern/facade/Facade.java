package org.example.designpattern.facade;


/**
 * @author wzy
 * @since 2023/10/18
 */
public class Facade {

    private CPU cpu;
    private Memory memory;
    private Hard hard;

    //构造器 初始化子类实例
    public Facade() {
        super();
        this.cpu = CPU.getInstance();
        this.memory = Memory.getInstance();
        this.hard = Hard.getInstance();
    }

    //封装所有打开设备
    public void open() {
        cpu.open();
        hard.open();
        memory.open();
    }

    //封装所有关闭设备
    public void down() {
        cpu.down();
        hard.down();
        memory.down();
    }

}
