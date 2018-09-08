package com.gof23.state;
/**
 * 注意 ：状态模式，状态是主导。（伴随着对应的行为）
 * 策略模式：针对不同的情况，采用不同的策略。（策略是主导）
 * @author jack
 *
 */
public class Client {
    public static void main(String[] args) {
        HomeContext homeContext = new HomeContext();
        homeContext.setState(new FreeState());
    }
}
