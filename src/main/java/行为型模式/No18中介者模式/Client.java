package 行为型模式.No18中介者模式;

import 行为型模式.No18中介者模式.中介者角色.MediatorStructure;
import 行为型模式.No18中介者模式.同事类角色.HouseOwner;
import 行为型模式.No18中介者模式.同事类角色.Tenant;

/**
 * 定义：又叫调停模式，定义一个中介角色来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
 *
 * 中介者模式包含以下主要角色：
 *   抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 *   具体中介者（ConcreteMediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 *   抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 *   具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 *
 * 优点：
 *   1.松散耦合：
 *     中介者模式通过把多个同事对象之间的交互封装到中介者对象里面，从而使得同事对象之间松散耦合，基本上可以做到互补依赖。这样一来，同事对象就可以独立地变化和复用，而不再像以前那样“牵一处而动全身”了。
 *   2.集中控制交互：
 *     多个同事对象的交互，被封装在中介者对象里面集中管理，使得这些交互行为发生变化的时候，只需要修改中介者对象就可以了，当然如果是已经做好的系统，那么就扩展中介者对象，而各个同事类不需要做修改。
 *   3.一对多关联转变为一对一的关联
 *     没有使用中介者模式的时候，同事对象之间的关系通常是一对多的，引入中介者对象以后，中介者对象和同事对象的关系通常变成双向的一对一，这会让对象的关系更容易理解和实现。
 * 缺点：
 *   当同事类太多时，中介者的职责将很大，它会变得复杂而庞大，以至于系统难以维护。
 *
 * 使用场景：
 *   系统中对象之间存在复杂的引用关系，系统结构混乱且难以理解。
 *   当想创建一个运行于多个类之间的对象，又不想生成新的子类时。
 *
 * 示例：租房
 *   现在租房基本都是通过房屋中介，房主将房屋托管给房屋中介，而租房者从房屋中介获取房屋信息。房屋中介充当租房者与房屋所有者之间的中介者。
 */
public class Client {
    public static void main(String[] args) {
        //创建一个中介者
        MediatorStructure mediatorStructure = new MediatorStructure();

        //创建同事类对象，并绑定中介者（房主和租户都需要知道中介机构）
        HouseOwner houseOwner1 = new HouseOwner("包租婆", mediatorStructure);
        HouseOwner houseOwner2 = new HouseOwner("包租公", mediatorStructure);
        Tenant tenant1 = new Tenant("张三", mediatorStructure);
        Tenant tenant2 = new Tenant("李四", mediatorStructure);

        //往中介者里面添加同事类角色（中介机构也要知道房主和租房者）
        mediatorStructure.setHouseOwner(houseOwner1);
        mediatorStructure.setHouseOwner(houseOwner2);
        mediatorStructure.setTenant(tenant1);
        mediatorStructure.setTenant(tenant2);

        //同事类对象联系中介
        tenant1.constact("我要租单间");
        tenant2.constact("我要租两室一厅");
        houseOwner1.constact("我有一套大别野");
        houseOwner2.constact("我有一间厕所");
    }
}
