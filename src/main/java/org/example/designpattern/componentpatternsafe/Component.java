package org.example.designpattern.componentpatternsafe;

/**
 * @author wzy
 * @since 2023/10/18
 */
abstract class Component {
    String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void show(int depth);
}
