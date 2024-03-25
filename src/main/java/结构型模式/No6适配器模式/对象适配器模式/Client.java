package 结构型模式.No6适配器模式.对象适配器模式;

import 结构型模式.No6适配器模式.对象适配器模式.目标接口.SDCard;
import 结构型模式.No6适配器模式.对象适配器模式.目标接口.SDCardImpl;
import 结构型模式.No6适配器模式.对象适配器模式.适配器.SDAdapterTF;
import 结构型模式.No6适配器模式.对象适配器模式.适配者.TFCard;
import 结构型模式.No6适配器模式.对象适配器模式.适配者.TFCardImpl;
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
 *   实现方式：对象适配器模式可釆用将现有组件库中已经实现的组件引入适配器类中，该类同时实现当前系统的业务接口。
 *
 *   注意：
 *   还有一个适配器模式是接口适配器模式。当不希望实现一个接口中所有的方法时，可以创建一个抽象类Adapter ，实现所有方法。而此时我们只需要继承该抽象类即可。
 *   另外还有一个适配器模式是接口适配器模式。当不希望实现一个接口中所有的方法时，可以创建一个抽象类Adapter ，实现所有方法。而此时我们只需要继承该抽象类即可。
 */

/**
 * 示例：读卡器
 * 现有一台电脑只能读取SD卡，而要读取TF卡中的内容的话就需要使用到适配器模式。创建一个读卡器，将TF卡中的内容读取出来。
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        sdCard.writeSD("这是张SD卡");
        System.out.println(computer.readSD(sdCard));

        System.out.println("==============================");

        //使用适配器
        TFCard tfCard = new TFCardImpl();
        tfCard.writeTF("这是张TF卡");
        //对象适配器模式需要给适配器传递适配者对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(sdAdapterTF));

    }
}
