package 行为型模式.No17观察者模式.使用jdk实现观察者模式;

import java.util.Observable;

/**
 * Observable类：
 *   Observable 类是抽象目标类（被观察者），它有一个 Vector 集合成员变量，用于保存所有要通知的观察者对象，下面来介绍它最重要的 3 个方法。
 *     void addObserver(Observer o) 方法：用于将新的观察者对象添加到集合中。
 *     void notifyObservers(Object arg) 方法：调用集合中的所有观察者对象的 update方法，通知它们数据发生改变。通常越晚加入集合的观察者越先得到通知。
 *     void setChange() 方法：用来设置一个 boolean 类型的内部标志，注明目标对象发生了变化。当它为true时，notifyObservers() 才会通知观察者。
 *
 * 被观察者（消息发布者）：公众号
 */
public class SubscriptionSubject extends Observable {
    //公众号名称
    private String name;

    public SubscriptionSubject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //发布文章（消息）
    public void postArticle(String articleName){
        System.out.println(name + "发布新文章啦！");

        //父类Observable中，changed属性默认为false
        //只有当changed为true时使用notifyObservers()才会触发订阅者的update()方法
        super.setChanged();

        //调用订阅者的update方法
        super.notifyObservers(articleName);
    }
}
