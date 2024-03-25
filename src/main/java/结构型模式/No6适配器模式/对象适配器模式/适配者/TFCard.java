package 结构型模式.No6适配器模式.对象适配器模式.适配者;

/**
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 *
 * TF卡接口
 */
public interface TFCard {
    //读取TF卡方法
    String readTF();

    //写入TF卡功能
    void writeTF(String msg);
}
