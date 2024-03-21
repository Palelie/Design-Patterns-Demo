package 创建者模式.No2工厂模式.工厂方法模式.工厂;

import 创建者模式.No2工厂模式.工厂方法模式.产品.Coffee;

/**
 * 抽象工厂：抽象咖啡工厂
 */
public interface CoffeeFactory {
    Coffee createCoffee();
}
