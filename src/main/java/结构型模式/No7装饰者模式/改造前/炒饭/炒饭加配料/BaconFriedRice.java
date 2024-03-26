package 结构型模式.No7装饰者模式.改造前.炒饭.炒饭加配料;

import 结构型模式.No7装饰者模式.改造前.炒饭.FriedRice;

/**
 * 快餐套餐：炒饭（加培根）
 */
public class BaconFriedRice extends FriedRice {
    public BaconFriedRice(){
        super(14.0,"培根炒饭");
    }
}
