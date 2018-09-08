package com.gof23.flyweight;
/**
 * （1）抽象享元类：
 * 通常是一个接口或者是抽象类，声明公共方法，这些方法一般向外界提供对象的内部状态，设置外部状态；
 * @author jack
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}
/**
 * 具体享元类：
 * 为内部状态提供成员变量进行存储;
 * @author jack
 *
 */
class  ConcreteChess implements ChessFlyWeight{
    private String color;
    
    public ConcreteChess(String color) {
        super();
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色"+color);
        System.out.println("棋子位置"+coordinate.getX()+"---"+coordinate.getY());
    }
    
}