package 创建者模式.No2工厂模式.工厂方法模式.客户端;

import 创建者模式.No2工厂模式.工厂方法模式.产品.Coffee;
import 创建者模式.No2工厂模式.工厂方法模式.工厂.AmericanCoffeeFactory;
import 创建者模式.No2工厂模式.工厂方法模式.工厂.CoffeeFactory;
import 创建者模式.No2工厂模式.工厂方法模式.工厂.LatteCoffeeFactory;

/**
 * 工厂方法模式的主要角色：
 *   抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法来创建产品。
 *   具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 *   抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
 *   具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
 *
 * 优点：
 * 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程。
 * 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则。
 *
 * 缺点：
 * 每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 */

/**
 * 咖啡店：调用工厂创建产品对象
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    //使用set注入方式指定具体咖啡工厂
    public void setCoffeeFactory(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        //调用工厂创建对象，具体创建对象的过程和方式不可见
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    /**
     * 客户端
     */
    public static void main(String[] args) {
        //需要指定具体的工厂
        CoffeeFactory factory;
        CoffeeStore coffeeStore = new CoffeeStore();

        //美式咖啡
        factory = new AmericanCoffeeFactory();
        coffeeStore.setCoffeeFactory(factory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());

        System.out.println("=======================");

        //拿铁咖啡
        factory = new LatteCoffeeFactory();
        coffeeStore.setCoffeeFactory(factory);
        coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
