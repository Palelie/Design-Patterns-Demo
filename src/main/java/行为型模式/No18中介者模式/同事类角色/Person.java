package 行为型模式.No18中介者模式.同事类角色;

import 行为型模式.No18中介者模式.中介者角色.Mediator;

/**
 * 抽象同事类（Colleague）角色：
 *   定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
