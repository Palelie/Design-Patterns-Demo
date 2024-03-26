package 结构型模式.No8桥接模式.抽象化角色类;

import 结构型模式.No8桥接模式.实现化角色类.VideoFile;

/**
 * 具体实现化（Concrete Implementor）角色 ：给出实现化角色接口的具体实现。
 *
 * Mac版本
 */
public class Mac extends OperatingSystemVersion{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("正在使用Mac电脑");
        videoFile.decode(fileName);
    }
}
