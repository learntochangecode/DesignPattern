package org.example.designpattern.flyweight;

import java.awt.*;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class WhitePieces implements ChessPieces {
    @Override
    public void downPieces(Point pt) {
        System.out.println("当前获取到的为===白===颜色的棋子");
        System.out.println("坐标X=" + pt.getX() + ";Y=" + pt.getY());
    }
}
