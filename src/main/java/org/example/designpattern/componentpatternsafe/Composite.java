package org.example.designpattern.componentpatternsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzy
 * @since 2023/10/18
 */
class Composite extends Component {
    List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        this.children.add(component);
    }

    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(name + ": ");
        for (Component component : children) {
            component.show(depth + 1);
        }
    }
}
