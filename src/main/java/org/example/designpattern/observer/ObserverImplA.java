package org.example.designpattern.observer;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class ObserverImplA implements IObserver{
    @Override
    public void update(String name, String content, String type) {
        // 对接收的信息进行处理
        System.out.println("观察者A收到信息：");
        System.out.println("名称：" + name);
        System.out.println("内容：" + content);
        System.out.println("类型：" + type);
    }
}
