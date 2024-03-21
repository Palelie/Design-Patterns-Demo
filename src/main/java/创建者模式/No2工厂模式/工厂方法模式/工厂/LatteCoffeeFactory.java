package 创建者模式.No2工厂模式.工厂方法模式.工厂;

import 创建者模式.No2工厂模式.工厂方法模式.产品.Coffee;
import 创建者模式.No2工厂模式.工厂方法模式.产品.LatteCoffee;

/**
 * 具体工厂：拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
