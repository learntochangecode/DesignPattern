package org.example.designpattern.flyweight;

import java.awt.*;
/**
 * @author wzy
 * @since 2023/10/18
 */
public class Client {
    private final static String WHITE = "White";
    private final static String BLACK = "Black";

    public static void main(String[] args) {
        //创建工程
        PiecesFactory factory = new PiecesFactory();
        //获取白色棋子
        //下棋1 = 白
        ChessPieces piece1 = factory.getPieceInstance(WHITE);
        piece1.downPieces(new Point(1,2));
        //下棋1 = 黑
        ChessPieces pieceB1 = factory.getPieceInstance(BLACK);
        pieceB1.downPieces(new Point(2,2));
        //下棋2 = 白
        ChessPieces piece2 = factory.getPieceInstance(WHITE);
        piece2.downPieces(new Point(2, 3));
        //下棋2 = 黑
        ChessPieces pieceB2 = factory.getPieceInstance(BLACK);
        pieceB2.downPieces(new Point(3,2));
        //下棋3 = 白
        ChessPieces piece3 = factory.getPieceInstance(WHITE);
        piece3.downPieces(new Point(5, 7));
        //下棋3 = 黑
        ChessPieces pieceB3 = factory.getPieceInstance(BLACK);
        pieceB3.downPieces(new Point(6,6));

        /**
         * 结果：
         * 当前获取到的为===白===颜色的棋子
         * 坐标X=1;Y=2
         * 当前获取到的为===黑===颜色的棋子
         * 坐标X=2;Y=2
         * 当前获取到的为===白===颜色的棋子
         * 坐标X=2;Y=3
         * 当前获取到的为===黑===颜色的棋子
         * 坐标X=3;Y=2
         * 当前获取到的为===白===颜色的棋子
         * 坐标X=5;Y=7
         * 当前获取到的为===黑===颜色的棋子
         * 坐标X=6;Y=6
         */

        //重点是,这6颗棋子 总共创建了多少个对象
        System.out.println(factory.getInstallCount());
        /**
         * 输入结果：2   复合享元模式的应用
         */
    }
}