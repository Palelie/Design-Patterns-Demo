package 结构型模式.No6适配器模式.类适配器模式.目标接口;

/**
 * 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
 *
 * SD卡的接口
 */
public interface SDCard {
    //读取SD卡方法
    String readSD();

    //写入SD卡功能
    void writeSD(String msg);
}
