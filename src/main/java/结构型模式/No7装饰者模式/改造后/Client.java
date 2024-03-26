package 结构型模式.No7装饰者模式.改造后;

import 结构型模式.No7装饰者模式.改造后.构件角色类.FastFood;
import 结构型模式.No7装饰者模式.改造后.构件角色类.FriedNoodles;
import 结构型模式.No7装饰者模式.改造后.构件角色类.FriedRice;
import 结构型模式.No7装饰者模式.改造后.装饰角色类.Bacon;
import 结构型模式.No7装饰者模式.改造后.装饰角色类.Egg;

/**
 * 定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式。
 *
 * 装饰（Decorator）模式中的角色：
 *    抽象构件（Component）角色 ：定义一个抽象接口以规范准备接收附加责任的对象。
 *    具体构件（Concrete  Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
 *    抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 *    具体装饰（ConcreteDecorator）角色 ：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 *
 * 好处：
 *    饰者模式可以带来比继承更加灵活性的扩展功能，使用更加方便，可以通过组合不同的装饰者对象来获取具有不同行为状态的多样化的结果。
 *    装饰者模式比继承更具良好的扩展性，完美的遵循开闭原则，继承是静态的附加责任，装饰者则是动态的附加责任。
 *    装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。
 *
 * 使用场景：
 *   1.当不能采用继承的方式对系统进行扩充或者采用继承不利于系统扩展和维护时。不能采用继承的情况主要有两类：
 *       第一类是系统中存在大量独立的扩展，为支持每一种组合将产生大量的子类，使得子类数目呈爆炸性增长
 *       第二类是因为类定义不能继承（如final类）
 *   2.在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
 *   3.当对象的功能要求可以动态地添加，也可以再动态地撤销时。
 *
 *  静态代理和装饰者模式的区别：
 *    相同点：
 *      都要实现与目标类相同的业务接口
 *      在两个类中都要声明目标对象
 *      都可以在不修改目标类的前提下增强目标方法
 *    不同点：
 *      目的不同：装饰者是为了增强目标对象，而静态代理是为了保护和隐藏目标对象
 *      获取目标对象构建的地方不同：装饰者是由外界传递进来，可以通过构造方法传递，而静态代理是在代理类内部创建，以此来隐藏目标对象
 *
 * 示例：快餐店
 * 快餐店有炒面、炒饭这些快餐，每个套餐可以额外附加鸡蛋、火腿、培根这些配菜，加配菜需要额外加钱，且每个配菜的价钱通常不太一样，那么计算总价就会显得比较麻烦。
 */
public class Client {
    public static void main(String[] args) {
        //单一套餐
        FriedRice friedRice = new FriedRice();
        System.out.println("点了" + friedRice.getDesc() + "，消费：" + friedRice.cost());
        //在原来套餐的基础上加配料
        FastFood eggFriedRice = new Egg(friedRice);
        System.out.println("点了" + eggFriedRice.getDesc() + "，消费：" + eggFriedRice.cost());

        System.out.println("======================================");

        //单一套餐
        FriedNoodles friedNoodles = new FriedNoodles();
        System.out.println("点了" + friedNoodles.getDesc() + "，消费：" + friedNoodles.cost());
        //在原来套餐的基础上加配料
        FastFood baconFriedNoodles = new Bacon(friedNoodles);
        System.out.println("点了" + baconFriedNoodles.getDesc() + "，消费：" + baconFriedNoodles.cost());

        System.out.println("========================================");

        /**
         * 注意与桥接模式不同
         */
        FastFood eggBaconFriedNoodles = new Egg(baconFriedNoodles);
        System.out.println("点了" + eggBaconFriedNoodles.getDesc() + "，消费：" + eggBaconFriedNoodles.cost());
    }
}
