package 结构型模式.No7装饰者模式.改造前.炒饭;

import 结构型模式.No7装饰者模式.改造前.FastFood;

/**
 * 快餐套餐：炒饭（无配料）
 */
public class FriedRice extends FastFood {
    public FriedRice(){
        super(10.0,"炒饭");
    }

    public FriedRice(Double price,String desc){
        super(price,desc);
    }

    @Override
    public Double cost() {
        return getPrice();
    }
}
