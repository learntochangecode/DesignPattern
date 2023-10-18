package org.example.designpattern.observer;

/**
 * @author wzy
 * @since 2023/10/18
 * 抽象观察者
 */
public interface IObserver {
    // 接收主题类的消息
    public void update(String name, String content, String type);
}
