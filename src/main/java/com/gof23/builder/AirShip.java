package com.gof23.builder;

public class AirShip {
    private Engin engine;// 发动机
    private OrbitalModul orbitalModul;// 轨道舱
    private EscapeTower escapeTower;// 逃逸塔

    public AirShip() {}

    public AirShip(Engin engine, OrbitalModul orbitalModul, EscapeTower escapeTower) {
        super();
        this.engine = engine;
        this.orbitalModul = orbitalModul;
        this.escapeTower = escapeTower;
    }

    public Engin getEngine() {
        return engine;
    }

    public void setEngine(Engin engine) {
        this.engine = engine;
    }

    public OrbitalModul getOrbitalModul() {
        return orbitalModul;
    }

    public void setOrbitalModul(OrbitalModul orbitalModul) {
        this.orbitalModul = orbitalModul;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}


class Engin {
    private String name;

    public Engin(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class OrbitalModul {
    private String name;

    public OrbitalModul(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
