package com.gof23.builder;

public class SxtAirShipDirector implements AirShipDirector {
    private AirShipBuilder airShipBuilder;

    public SxtAirShipDirector(AirShipBuilder airShipBuilder) {
        super();
        this.airShipBuilder = airShipBuilder;
    }

    /**
     * 开始构造并装配对象
     */
    @Override
    public AirShip directorAirShip() {
        // 调用构造则
        Engin engine = airShipBuilder.builderEngine();
        EscapeTower tower = airShipBuilder.buildEscapeTower();
        OrbitalModul modul = airShipBuilder.buildOrbitalModul();
        // 开始装配
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(tower);
        airShip.setOrbitalModul(modul);
        return airShip;
    }
}
