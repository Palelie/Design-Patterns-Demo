package 创建者模式.No2工厂模式.抽象工厂模式.工厂;

import 创建者模式.No2工厂模式.抽象工厂模式.产品.咖啡.AmericanoCoffee;
import 创建者模式.No2工厂模式.抽象工厂模式.产品.咖啡.Coffee;
import 创建者模式.No2工厂模式.抽象工厂模式.产品.甜品.Dessert;
import 创建者模式.No2工厂模式.抽象工厂模式.产品.甜品.MatchaMousse;

/**
 * 具体工厂类（用于整合同一产品族的不同类别产品）：美式风味甜品工厂
 */
public class AmericanDessertFactory implements DessertFactory{
    //美式咖啡
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }

    //抹茶慕斯
    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
