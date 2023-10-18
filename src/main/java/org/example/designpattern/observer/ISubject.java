package org.example.designpattern.observer;

/**
 * @author wzy
 * @since 2023/10/18
 * 抽象主题类
 */
public interface ISubject {
    // 添加观察者对象
    public void addObserver(IObserver observer);
    // 删除观察者对象
    public void removeObserver(IObserver observer);
    // 通知方法
    public void notifyObserver();
}
