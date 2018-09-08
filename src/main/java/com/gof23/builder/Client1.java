package com.gof23.builder;

public class Client1 {
    public static void main(String[] args) {
        // 创建 构造者
        AirShipBuilder builder = new SxtAirShipBuilder();
        // 创建装配者
        SxtAirShipDirector airShipDirector = new SxtAirShipDirector(builder);
        // 开始构建
        AirShip sxtAirShip = airShipDirector.directorAirShip();
        System.out.println(sxtAirShip.getEngine().getName());

    }
}
