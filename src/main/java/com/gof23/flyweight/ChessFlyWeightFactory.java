package com.gof23.flyweight;

import java.util.HashMap;
import java.util.Map;
/**
 * 享元工厂类：
 * @author jack
 *
 */
public class ChessFlyWeightFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map=new HashMap<String,ChessFlyWeight>();
    public static ChessFlyWeight  getChess(String color){
        ChessFlyWeight chessFlyWeight = map.get(color);
        if( map.get(color)==null){
            chessFlyWeight=new ConcreteChess(color);
            map.put(color, chessFlyWeight);
        }
        return chessFlyWeight;
    }
}
