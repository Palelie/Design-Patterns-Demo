package 行为型模式.No18中介者模式.中介者角色;

import 行为型模式.No18中介者模式.同事类角色.Person;

/**
 * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 */
public abstract class Mediator {
    //声明一个联络的方法
    public abstract void constact(String message, Person person);
}
