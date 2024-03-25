package 结构型模式.No6适配器模式.对象适配器模式;

import 结构型模式.No6适配器模式.对象适配器模式.目标接口.SDCard;

/**
 * 电脑类：电脑只能使用SD卡不能使用TF卡，所以需要使用适配器将TF卡转换为SD卡接口
 */
public class Computer {
    //只接受sd卡接口
    public String readSD(SDCard sdCard){
        return sdCard.readSD();
    }

    public void writeSD(SDCard sdCard,String msg){
        sdCard.writeSD(msg);
    }
}
