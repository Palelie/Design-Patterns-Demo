package 结构型模式.No7装饰者模式.改造前.炒饭.炒饭加配料;

import 结构型模式.No7装饰者模式.改造前.炒饭.FriedRice;

/**
 * 快餐套餐：炒饭（加蛋）
 */
public class EggFriedRice extends FriedRice {
    public EggFriedRice(){
        super(12.0,"蛋炒饭");
    }
}
