package 结构型模式.No7装饰者模式.改造后.构件角色类;

/**
 * 具体构件（Concrete  Component）角色 ：实现抽象构件，通过装饰角色为其添加一些职责。
 *
 * 快餐套餐：炒面（无配料）
 */
public class FriedNoodles extends FastFood {
    public FriedNoodles(){
        super(11.0,"炒面");
    }

    public FriedNoodles(Double price, String desc){
        super(price,desc);
    }

    @Override
    public Double cost() {
        return getPrice();
    }
}
