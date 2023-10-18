package org.example.designpattern.observer;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzy
 * @since 2023/10/18
 * 具体主题类
 */
public class SubjectImpl implements ISubject{
    // 定义名称
    private String name;
    // 定义内容
    private String content;
    // 定义类型
    private String type;

    // 更新并通知观察者
    public void update(String name, String content, String type) {
        this.name = name;
        this.content = content;
        this.type = type;
        // 通知观察者
        notifyObserver();
    }
    // 定义一个集合存放观察者对象
    List<IObserver> observers;
    // 创建时生成一个观察者集合
    public SubjectImpl() {
        observers = new ArrayList<IObserver>();
    }
    // 添加
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    // 删除
    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }
    // 通知
    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            if(observer != null)
                observer.update(name, content, type);
        }
    }
}
