package 结构型模式.No7装饰者模式.改造前.炒面;

import 结构型模式.No7装饰者模式.改造前.FastFood;

/**
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
