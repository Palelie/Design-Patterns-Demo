package 行为型模式.No17观察者模式.使用jdk实现观察者模式;

/**
 * 在 Java 中，通过 java.util.Observable 类和 java.util.Observer 接口定义了观察者模式，只要实现它们的子类就可以编写观察者模式实例
 */
public class Client {
    public static void main(String[] args) {
        //新建被观察者（公众号）
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject("环球时报");

        //添加并绑定观察者
        subscriptionSubject.addObserver(new WechatUser("张三"));
        subscriptionSubject.addObserver(new WechatUser("李四"));
        subscriptionSubject.addObserver(new WechatUser("王五"));

        //被观察者发布消息
        subscriptionSubject.postArticle("全国房价下跌");
    }
}
