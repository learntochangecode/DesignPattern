package org.example.designpattern.component.abstractcomponent;

/**
 * @author wzy
 * @since 2023/10/18
 */
abstract class Component {
    String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void show(int depth);
}
