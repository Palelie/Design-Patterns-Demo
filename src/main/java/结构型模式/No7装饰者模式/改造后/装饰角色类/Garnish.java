package 结构型模式.No7装饰者模式.改造后.装饰角色类;

import 结构型模式.No7装饰者模式.改造后.构件角色类.FastFood;

/**
 * 抽象装饰（Decorator）角色 ： 继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 *
 * 配料类
 */
public abstract class Garnish extends FastFood {
    /**
     * 注意：装饰抽象类既继承了抽象构建类，又聚合了抽象构建类，传入（构造）参数和返回值（类本身）一致，因此可以无限套用自己（可以无限加蛋加培根）
     * 而桥接模式抽象类不继承接口，只是用来连接两个事物
     */
    private FastFood fastFood;

    public Garnish(FastFood fastFood,Double price,String desc){
        super(price,desc);
        this.fastFood = fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }
}
