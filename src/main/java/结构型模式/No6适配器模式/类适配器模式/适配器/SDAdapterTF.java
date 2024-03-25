package 结构型模式.No6适配器模式.类适配器模式.适配器;

import 结构型模式.No6适配器模式.类适配器模式.目标接口.SDCard;
import 结构型模式.No6适配器模式.类适配器模式.适配者.TFCardImpl;

/**
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 *
 * 定义适配器类（SD兼容TF）
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        super.writeTF(msg);
    }
}
