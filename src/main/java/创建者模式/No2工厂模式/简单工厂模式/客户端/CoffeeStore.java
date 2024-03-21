package 创建者模式.No2工厂模式.简单工厂模式.客户端;

import 创建者模式.No2工厂模式.简单工厂模式.产品.Coffee;
import 创建者模式.No2工厂模式.简单工厂模式.工厂.SimpleCoffeeFactory;

/**
 * 简单工厂包含如下角色：
 *  抽象产品 ：定义了产品的规范，描述了产品的主要特性和功能。
 *  具体产品 ：实现或者继承抽象产品的子类
 *  具体工厂 ：提供了创建产品的方法，调用者通过该方法来获取产品。
 *
 *  优点：
 * 封装了创建对象的过程，可以通过参数直接获取对象。
 * 把对象的创建和业务逻辑层分开，这样以后就避免了修改客户代码，如果要实现新产品直接修改工厂类，而不需要在原代码中修改，这样就降低了客户代码修改的可能性，更加容易扩展。
 *
 * 缺点：
 * 增加新产品时还是需要修改工厂类的代码，违背了“开闭原则”。
 */

/**
 * 咖啡店：调用工厂创建产品对象
 */
public class CoffeeStore {
    public Coffee orderCoffee(String coffeeType){
        //调用工厂创建对象，具体创建对象的过程和方式不可见
        Coffee coffee = SimpleCoffeeFactory.createCoffee(coffeeType);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    /**
     * 客户端
     */
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
