package com.gof23.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式：
 * 抽象组件  相当于Component;(叶子组件和容器组件的抽象)
 * 由于叶子和组件都实现抽象组件，故调用接口对应的方法时，可以同样处理（operation方法）
 * @author jack
 */
public interface AbstractFile {
    void killVirus();//杀毒，相当于operation
}
/**
 * 叶子组件，相当于leaf
 * @author jack
 *
 */
class ImageFile implements AbstractFile{
    private String name;
    public ImageFile(String name) {
        super();
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("--查杀"+name+"图片文件");
    }
}
class TextFile implements AbstractFile{
    private String name;
    public TextFile(String name) {
        super();
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("--查杀"+name+"文本文件");
    }
}
class VideoFile implements AbstractFile{
    private String name;
    public VideoFile(String name) {
        super();
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("--查杀"+name+"视频文件");
    }
}
/**
 * 容器组件，相当于：Composite
 * @author jack
 *
 */
class Folder implements AbstractFile{
    private String name;
    private List<AbstractFile> childs=new ArrayList<AbstractFile>();
    public Folder(String name) {
        super();
        this.name = name;
    }
    public Boolean add(AbstractFile abstractFile){
        return childs.add(abstractFile);
    }
    public Boolean remove(AbstractFile abstractFile){
        return childs.remove(abstractFile);
    }
    public AbstractFile  get(int index){
        return childs.get(index);
    }
    @Override
    public void killVirus() {
        System.out.println("----查杀文件夹："+name);
        for (AbstractFile abstractFile : childs) {
            abstractFile.killVirus();
        }
    }
}