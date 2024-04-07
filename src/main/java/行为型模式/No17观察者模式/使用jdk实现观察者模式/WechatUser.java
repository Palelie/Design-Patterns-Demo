package 行为型模式.No17观察者模式.使用jdk实现观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * Observer 接口：
 *   Observer 接口是抽象观察者，它监视目标对象的变化，当目标对象发生变化时，观察者得到通知，并调用 update 方法，进行相应的工作。
 *
 * 观察者（消息订阅者）：微信公众号订阅用户
 */
public class WechatUser implements Observer {
    //微信用户名
    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    //当被观察者调用notifyObservers()方法时，观察者的该方法就会执行
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到" + ((SubscriptionSubject)o).getName() + "的文章更新通知，文章标题为：" + arg);
    }
}
