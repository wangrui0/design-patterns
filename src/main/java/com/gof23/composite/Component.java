package com.gof23.composite;
/**
 * 抽象主键
 */
public interface Component {
    void operation();
}
/**
 * 叶子主键
 */
interface Leaf extends Component{
}
/**
 *容器组件 
 */
interface Composite extends Component{
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}
