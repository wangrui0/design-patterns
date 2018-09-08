package com.gof23.factory.abstractfactory;
/**
 * 抽象 工厂模式，产品族的概念；
 * 某个对象，是由若干个产品组成，而每个产品都有对应的产品族；
 * （1）需要将每个产品定义为接口，然后不通产品进行实现；
 * （2）定义对象的接口，对象的实现类是各个产品族的组合；
 * @author jack
 *
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre creatTyre();
}
class LuxuryCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre creatTyre() {
        return new LuxuryTyre();
    }
}
class LowerCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LowerEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowerSeat();
    }

    @Override
    public Tyre creatTyre() {
        return new LowerTyre();
    }
}

