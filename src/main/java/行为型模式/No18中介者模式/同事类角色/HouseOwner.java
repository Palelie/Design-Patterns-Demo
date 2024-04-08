package 行为型模式.No18中介者模式.同事类角色;

import 行为型模式.No18中介者模式.中介者角色.Mediator;

/**
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 *
 * 房屋拥有者
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //与中介者联系
    public void constact(String message){
        mediator.constact(message,this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("房主" + name + "收到消息：" + message);
    }
}
