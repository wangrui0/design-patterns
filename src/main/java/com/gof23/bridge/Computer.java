package com.gof23.bridge;
/**
 * 不使用桥接模式：
 * 每个电脑由品牌和类型组成，违反了单一职责原则。导致类结构的膨胀
 * @author jack
 *
 */
public interface Computer {
    void sale();
}
class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("台式机");
    }
    
}
class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("笔记本");
    }
    
}
class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("平板电脑");
    }
}
class LenvoDesktop implements Computer{

    @Override
    public void sale() {
        System.out.println("联想台式机");
    }
    
}
class LenvoLaptop implements Computer{

    @Override
    public void sale() {
        System.out.println("联想笔记本");
    }
    
}
class LenvoPad implements Computer{

    @Override
    public void sale() {
        System.out.println("联想平板平板电脑");
    }
}
class HuaWeiDesktop implements Computer{

    @Override
    public void sale() {
        System.out.println("华为台式机");
    }
    
}
class HuaWeiLaptop implements Computer{

    @Override
    public void sale() {
        System.out.println("华为笔记本");
    }
    
}
class HuaWeiPad implements Computer{

    @Override
    public void sale() {
        System.out.println("平板平板电脑");
    }
}
    

