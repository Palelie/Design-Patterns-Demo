package 行为型模式.No17观察者模式.自行实现观察者模式.被观察者;

import 行为型模式.No17观察者模式.自行实现观察者模式.观察者.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题（具体被观察者 / 消息发布者）：
 *   该角色将有关状态存入具体观察者对象，在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
 *
 * 微信公众号
 */
public class SubscriptionSubject implements Subject{
    //公众号名称
    private String name;

    //储存订阅公众号的微信用户
    private List<Observer> wechatUserList = new ArrayList<>();

    public SubscriptionSubject(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        wechatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        wechatUserList.remove(observer);
    }

    //通知所有订阅者（观察者）
    @Override
    public void notifyMessage(String articleName) {
        System.out.println(name + "发布新文章啦");
        for (Observer observer : wechatUserList) {
            observer.update(name,articleName);
        }
    }
}
