package 行为型模式.No17观察者模式.自行实现观察者模式.观察者;

/**
 * 抽象观察者（消息订阅者）：
 *   是观察者的抽象类，它定义了一个更新接口，使得在得到主题更改通知时更新自己。
 */
public interface Observer {
    void update(String subscriptionName,String articleName);
}
