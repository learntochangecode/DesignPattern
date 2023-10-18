package org.example.designpattern.component.safecomponent;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class ComponentPattern {
    public static void main(String[] args) {
        Composite folderRoot = new Composite("备忘录文件夹");
        folderRoot.add(new Leaf("word 文件"));
        folderRoot.add(new Leaf("ppt 文件"));

        Composite folderLevel1 = new Composite("周报文件夹");
        folderLevel1.add(new Leaf("20210101周报"));
        folderRoot.add(folderLevel1);


        Composite folderLevel2 = new Composite("笔记文件夹");
        folderLevel2.add(new Leaf("jvm.ppt"));
        folderLevel2.add(new Leaf("redis.txt"));
        folderLevel1.add(folderLevel2);


        folderRoot.add(new Leaf("需求.txt"));


        Leaf leaf = new Leaf("bug单.txt");
        folderRoot.add(leaf);
        folderRoot.remove(leaf);

        folderRoot.show(0);
    }
}

