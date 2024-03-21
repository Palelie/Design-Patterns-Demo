package 创建者模式.No2工厂模式.抽象工厂模式.客户端;
/**
 * 抽象工厂模式的主要角色如下：
 *   抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品。
 *   具体工厂（ConcreteFactory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 *   抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 *   具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。
 *
 * 优点：
 * 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 *
 * 缺点：
 * 当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
 */


import 创建者模式.No2工厂模式.抽象工厂模式.产品.咖啡.Coffee;
import 创建者模式.No2工厂模式.抽象工厂模式.产品.甜品.Dessert;
import 创建者模式.No2工厂模式.抽象工厂模式.工厂.AmericanDessertFactory;
import 创建者模式.No2工厂模式.抽象工厂模式.工厂.DessertFactory;
import 创建者模式.No2工厂模式.抽象工厂模式.工厂.ItalyDessertFactory;

/**
 * 示例：甜品店有不同风味的产品族，每种风味的产品族包含不同级别的产品
 * 每种抽象工厂包含同一产品族下的不同种类产品
 * 如：
 *  美式风味产品族包含产品（美式咖啡、抹茶慕斯）
 *  意大利风味产品族包含产品（拿铁咖啡、提拉米苏）
 */
public class CoffeeStore {
    private DessertFactory dessertFactory;

    //使用set注入方式指定具体工厂
    public void setCoffeeFactory(DessertFactory dessertFactory){
        this.dessertFactory = dessertFactory;
    }

    public Dessert orderDessert(){
        //调用工厂创建对象，具体创建对象的过程和方式不可见
        Dessert dessert = dessertFactory.createDessert();
        return dessert;
    }

    public Coffee orderCoffee(){
        //调用工厂创建对象，具体创建对象的过程和方式不可见
        Coffee coffee = dessertFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    /**
     * 客户端
     */
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        //需要指定具体的工厂
        DessertFactory factory;

        //美式风味
        factory = new AmericanDessertFactory();
        coffeeStore.setCoffeeFactory(factory);
        Coffee coffee = coffeeStore.orderCoffee();
        Dessert dessert = coffeeStore.orderDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());

        System.out.println("=======================");

        //意大利风味
        factory = new ItalyDessertFactory();
        coffeeStore.setCoffeeFactory(factory);
        coffee = coffeeStore.orderCoffee();
        dessert = coffeeStore.orderDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());
    }
}
