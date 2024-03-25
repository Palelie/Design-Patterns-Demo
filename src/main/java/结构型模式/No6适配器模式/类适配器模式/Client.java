package 结构型模式.No6适配器模式.类适配器模式;

import 结构型模式.No6适配器模式.类适配器模式.目标接口.SDCard;
import 结构型模式.No6适配器模式.类适配器模式.目标接口.SDCardImpl;
import 结构型模式.No6适配器模式.类适配器模式.适配器.SDAdapterTF;

/**
 * 定义：
 *  将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 *  适配器模式分为类适配器模式和对象适配器模式，前者类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
 *
 *  适配器模式（Adapter）包含以下主要角色：
 *    目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
 *    适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 *    适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 *
 *    注意：
 *      类适配器模式违背了合成复用原则。类适配器是客户类有一个接口规范的情况下可用，反之不可用。
 *
 *   实现方式：定义一个适配器类来实现当前系统的业务接口，同时又继承现有组件库中已经存在的组件。
 */

/**
 * 示例：读卡器
 * 现有一台电脑只能读取SD卡，而要读取TF卡中的内容的话就需要使用到适配器模式。创建一个读卡器，将TF卡中的内容读取出来。
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        sdCard.writeSD("这是张sd卡");
        System.out.println(computer.readSD(sdCard));

        System.out.println("====================================");

        //使用适配器
        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        sdAdapterTF.writeSD("这是张TF卡");
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
