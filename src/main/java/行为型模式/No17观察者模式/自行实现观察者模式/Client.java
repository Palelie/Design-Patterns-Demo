package 行为型模式.No17观察者模式.自行实现观察者模式;

import 行为型模式.No17观察者模式.自行实现观察者模式.被观察者.Subject;
import 行为型模式.No17观察者模式.自行实现观察者模式.被观察者.SubscriptionSubject;
import 行为型模式.No17观察者模式.自行实现观察者模式.观察者.WechatUser;

/**
 * 定义：
 *   又被称为发布-订阅（Publish/Subscribe）模式，它定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 *   这个主题对象在状态变化时，会通知所有的观察者对象，使他们能够自动更新自己。
 *
 * 在观察者模式中有如下角色：
 *   Subject：抽象主题（抽象被观察者），抽象主题角色把所有观察者对象保存在一个集合里，每个主题都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象。
 *   ConcreteSubject：具体主题（具体被观察者），该角色将有关状态存入具体观察者对象，在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
 *   Observer：抽象观察者，是观察者的抽象类，它定义了一个更新接口，使得在得到主题更改通知时更新自己。
 *   ConcrereObserver：具体观察者，实现抽象观察者定义的更新接口，以便在得到主题更改通知时更新自身的状态。
 *
 * 优点：
 *   降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。
 *   被观察者发送通知，所有注册的观察者都会收到信息【可以实现广播机制】
 * 缺点：
 *   如果观察者非常多的话，那么所有的观察者收到被观察者发送的通知会耗时
 *   如果被观察者有循环依赖的话，那么被观察者发送通知会使观察者循环调用，会导致系统崩溃
 *
 * 使用场景：
 *   对象间存在一对多关系，一个对象的状态发生改变会影响其他对象。
 *   当一个抽象模型有两个方面，其中一个方面依赖于另一方面时。
 *
 * 示例：微信公众号
 *   当关注的公众号中有新内容更新，就会推送给关注公众号的微信用户端。
 *   我们使用观察者模式来模拟这样的场景，微信用户就是观察者，微信公众号是被观察者，有多个的微信用户关注了环球时报这个公众号。
 */
public class Client{
    public static void main(String[] args) {
        //新建被观察者（公众号）
        Subject subscriptionSubject = new SubscriptionSubject("环球时报");

        //观察者（微信用户）订阅被观察者
        subscriptionSubject.attach(new WechatUser("张三"));
        subscriptionSubject.attach(new WechatUser("李四"));
        subscriptionSubject.attach(new WechatUser("王五"));

        //被观察者发出消息通知
        subscriptionSubject.notifyMessage("全国房价下跌");
    }
}
