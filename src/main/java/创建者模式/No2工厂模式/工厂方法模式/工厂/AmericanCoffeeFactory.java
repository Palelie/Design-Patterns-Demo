package 创建者模式.No2工厂模式.工厂方法模式.工厂;

import 创建者模式.No2工厂模式.工厂方法模式.产品.AmericanoCoffee;
import 创建者模式.No2工厂模式.工厂方法模式.产品.Coffee;

/**
 * 具体工厂：美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
