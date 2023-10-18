package org.example.designpattern.flyweight;

import java.util.HashMap;

/**
 * @author wzy
 * @since 2023/10/18
 */
public class PiecesFactory {
    //存储已创建的棋子   享元模式的精华
    HashMap<String, ChessPieces> pieces = new HashMap<>();
    private final String WHITE = "White";
    private final String BLACK = "Black";
    //创建一个静态方法 获取棋子对象
    public ChessPieces getPieceInstance(String color) {
        if(pieces.get(color) == null) {
            if(color == WHITE) {
                WhitePieces whitePieces = new WhitePieces();
                pieces.put(color, whitePieces);
            }else if(color == BLACK){
                BlackPieces blackPieces = new BlackPieces();
                pieces.put(color, blackPieces);
            }else {
                System.out.println("不存在的颜色");
                return null;
            }
        }
        return pieces.get(color);
    }

    //查看 hashmap 中总计的实例数量
    public int getInstallCount() {
        return pieces.size();
    }
}