package org.example.designpattern.flyweight;

import java.awt.*;

/**
 * @author wzy
 * @since 2023/10/18
 */
public interface ChessPieces {

    //落子方法 color:内部状态  pt：外部状态
    public void downPieces(Point pt);
}
