package 结构型模式.No7装饰者模式.改造前.炒面.炒面加配料;

import 结构型模式.No7装饰者模式.改造前.炒面.FriedNoodles;

/**
 * 快餐套餐：炒面（加培根）
 */
public class BaconFriedNoodles extends FriedNoodles {
    public BaconFriedNoodles(){
        super(15.0,"培根炒面");
    }
}
