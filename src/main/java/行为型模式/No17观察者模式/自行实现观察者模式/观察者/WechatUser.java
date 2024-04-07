package 行为型模式.No17观察者模式.自行实现观察者模式.观察者;

/**
 * 具体观察者（消息订阅者）：实现抽象观察者定义的更新接口，以便在得到主题更改通知时更新自身的状态。
 *
 * 微信公众号订阅者
 */
public class WechatUser implements Observer{
    //微信用户名
    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String subscriptionName,String articleName) {
        System.out.println(name + "收到" + subscriptionName + "的文章更新通知，文章标题为：" + articleName);
    }
}
