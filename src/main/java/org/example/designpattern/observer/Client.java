package org.example.designpattern.observer;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class Client {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        IObserver observerA = new ObserverImplA();
        subject.addObserver(observerA);
        subject.update("观察者模式", "观察者模式很好用", "新的消息");
    }
}
