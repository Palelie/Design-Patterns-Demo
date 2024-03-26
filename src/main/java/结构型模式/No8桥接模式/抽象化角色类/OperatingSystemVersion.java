package 结构型模式.No8桥接模式.抽象化角色类;

import 结构型模式.No8桥接模式.实现化角色类.VideoFile;

/**
 * 抽象化（Abstraction）角色 ：定义抽象类，并包含一个对实现化对象的引用。
 *
 * 操作系统版本
 */
public abstract class OperatingSystemVersion {
    /**
     * 注意抽象化角色采用组合（或聚合）的方式避免了继承关系的耦合
     * 且与装饰者模式不同的是，桥接模式抽象类不继承接口，无法实现套娃，只是两种事物的介质
     */
    //注意：聚合（或组合）的属性类型为protected，子类也可以直接访问
    protected VideoFile videoFile;

    public OperatingSystemVersion(VideoFile videoFile){
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
