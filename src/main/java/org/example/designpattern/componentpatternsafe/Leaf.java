package org.example.designpattern.componentpatternsafe;

/**
 * @author wzy
 * @since 2023/10/18
 */
class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void show(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(name);
    }
}
