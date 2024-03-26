package 结构型模式.No7装饰者模式.改造前.炒面.炒面加配料;

import 结构型模式.No7装饰者模式.改造前.炒面.FriedNoodles;

/**
 * 快餐套餐：炒面（加蛋）
 */
public class EggFriedNoodles extends FriedNoodles {
    public EggFriedNoodles(){
        super(13.0,"蛋炒面");
    }
}
