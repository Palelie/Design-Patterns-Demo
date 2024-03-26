package 结构型模式.No8桥接模式;

import 结构型模式.No8桥接模式.实现化角色类.AviFile;
import 结构型模式.No8桥接模式.抽象化角色类.OperatingSystemVersion;
import 结构型模式.No8桥接模式.抽象化角色类.Windows;

/**
 * 定义：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 *
 * 桥接（Bridge）模式包含以下主要角色：
 *    抽象化（Abstraction）角色 ：定义抽象类，并包含一个对实现化对象的引用。
 *    扩展抽象化（Refined  Abstraction）角色 ：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 *    实现化（Implementor）角色 ：定义实现化角色的接口，供扩展抽象化角色调用。
 *    具体实现化（Concrete Implementor）角色 ：给出实现化角色接口的具体实现。
 *
 * 示例：视频播放器
 *     需要开发一个跨平台视频播放器，可以在不同操作系统平台（如Windows、Mac、Linux等）上播放多种格式的视频文件，常见的视频格式包括RMVB、AVI、WMV等。该播放器包含了两个维度，适合使用桥接模式。
 *
 * 好处：
 *   1.桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。
 *   如：如果现在还有一种视频文件类型mp4，我们只需要再定义一个类实现VideoFile接口即可，其他类不需要发生变化。
 *   2.实现细节对客户透明
 *
 * 使用场景：
 *   1.当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时。
 *   2.当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时。
 *   3.当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时。避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。
 */

public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion windowsVideoPlayer = new Windows(new AviFile());
        windowsVideoPlayer.play("奥本海默.avi");
    }
}
