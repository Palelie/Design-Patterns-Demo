package 创建者模式.No2工厂模式.抽象工厂模式.工厂;

import 创建者模式.No2工厂模式.抽象工厂模式.产品.咖啡.Coffee;
import 创建者模式.No2工厂模式.抽象工厂模式.产品.咖啡.LatteCoffee;
import 创建者模式.No2工厂模式.抽象工厂模式.产品.甜品.Dessert;
import 创建者模式.No2工厂模式.抽象工厂模式.产品.甜品.Triamisu;

/**
 * 具体工厂类（用于整合同一产品族的不同类别产品）：意大利风味甜品工厂
 */
public class ItalyDessertFactory implements DessertFactory{
    //拿铁咖啡
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    //提拉米苏
    @Override
    public Dessert createDessert() {
        return new Triamisu();
    }
}
