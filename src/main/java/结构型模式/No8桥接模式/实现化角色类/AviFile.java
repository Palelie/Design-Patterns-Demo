package 结构型模式.No8桥接模式.实现化角色类;

/**
 * 实现化（Implementor）角色 ：定义实现化角色的接口，供扩展抽象化角色调用。
 *
 * avi文件
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("播放avi格式视频：" + fileName);
    }
}
