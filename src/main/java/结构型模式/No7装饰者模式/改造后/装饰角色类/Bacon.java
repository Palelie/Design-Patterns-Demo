package 结构型模式.No7装饰者模式.改造后.装饰角色类;

import 结构型模式.No7装饰者模式.改造后.构件角色类.FastFood;

/**
 * 具体装饰（ConcreteDecorator）角色 ：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 *
 * 配料类：培根
 */
public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(fastFood, 4.0, "加培根");
    }

    @Override
    public Double cost() {
        return getPrice() + getFastFood().getPrice();
    }

    //此处重写了父类的方法
    @Override
    public String getDesc(){
        return getFastFood().getDesc() + super.getDesc();
    }
}
