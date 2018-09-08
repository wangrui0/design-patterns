package com.gof23.builder;

/**
 * 构建时可以和单例模式或者是工厂模式进行搭配创建 对象
 * 
 * @author jack
 *
 */
public class SxtAirShipBuilder implements AirShipBuilder {

    @Override
    public Engin builderEngine() {
        System.out.println("构建尚学堂发动机");
        return new Engin("尚学堂发动机");
    }

    @Override
    public OrbitalModul buildOrbitalModul() {
        System.out.println("构建尚学堂轨道舱");
        return new OrbitalModul("尚学堂轨道舱");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建尚学堂逃生塔");
        return new EscapeTower("尚学堂逃生塔");
    }

}
