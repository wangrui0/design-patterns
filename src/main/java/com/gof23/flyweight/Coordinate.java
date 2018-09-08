package com.gof23.flyweight;
/**
 * 非共享享元类：
 * 不能被共享的子类可以被设计为非共享享元类；
 * @author jack
 *
 */
public class Coordinate {
    private int x,y;

    public Coordinate(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
