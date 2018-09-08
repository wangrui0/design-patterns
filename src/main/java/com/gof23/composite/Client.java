package com.gof23.composite;

public class Client {
    public static void main(String[] args) {
        AbstractFile f1,f2,f3,f4;
        f1=new VideoFile("笑傲江湖.mp4");
        f2=new VideoFile("独孤九剑.mp4");
        f3=new TextFile("毕业论文.txt");
        f4=new ImageFile("毕业照");
        Folder videos = new Folder("电影文件夹");
        videos.add(f1);
        videos.add(f2);
        Folder folder = new Folder("我的收藏夹");
        folder.add(f3);
        folder.add(f4);
        folder.add(videos);
        folder.killVirus();
    }
}
