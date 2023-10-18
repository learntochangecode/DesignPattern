package org.example.designpattern.componentpatternabstract;

/**
 * @author wzy
 * @since 2023/10/18
 */
class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(name);
    }
}
