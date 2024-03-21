package 创建者模式.No2工厂模式.抽象工厂模式.工厂;

import 创建者模式.No2工厂模式.抽象工厂模式.产品.咖啡.Coffee;
import 创建者模式.No2工厂模式.抽象工厂模式.产品.甜品.Dessert;

/**
 * 抽象工厂类（用于整合同一产品族的不同类别产品）：甜品工厂
 */
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
