package 创建者模式.No2工厂模式.简单工厂模式.工厂;

import 创建者模式.No2工厂模式.简单工厂模式.产品.AmericanoCoffee;
import 创建者模式.No2工厂模式.简单工厂模式.产品.Coffee;
import 创建者模式.No2工厂模式.简单工厂模式.产品.LatteCoffee;

/**
 * 具体工厂类（生产咖啡）
 *
 * 增加新产品时还是需要修改此处工厂类的代码，违背了“开闭原则”。
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String coffeeType){
        Coffee coffee;
        if ("americano".equals(coffeeType)){
            coffee = new AmericanoCoffee();
        }else if ("latte".equals(coffeeType)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("没有该种类型咖啡");
        }
        return coffee;
    }
}
