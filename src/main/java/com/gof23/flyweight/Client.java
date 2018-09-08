package com.gof23.flyweight;

public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);
        System.out.println("增加外部的处理状态================");
        chess1.display(new Coordinate(1, 2));
        chess1.display(new Coordinate(2, 4));
        
    }
}
