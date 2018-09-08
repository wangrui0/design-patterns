package com.gof23.builder;

/**
 * 构建者 注意：一般结尾是Builder的都是构建者模式，如：StringBuilder,Dom解析 中的
 * 
 * @author jack
 *
 */
public interface AirShipBuilder {
    Engin builderEngine();

    OrbitalModul buildOrbitalModul();

    EscapeTower buildEscapeTower();
}
