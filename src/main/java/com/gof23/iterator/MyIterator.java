package com.gof23.iterator;
/**
 * 自定义迭代器接口
 * @author jack
 *
 */
public interface MyIterator {
    void first();//将游标指向第一个
    void last();
    boolean isFirst();//是否是第一个
    boolean isLast();
    boolean hasNext();//是否有下一个
    void next();//将游标移向下一个
    Object getCurrentObj();//获取当前游标下的元素
}
