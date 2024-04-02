package 行为型模式.No16状态模式.优化前;

/**
 * 示例：
 * 通过按钮来控制一个电梯的状态，一个电梯有开门状态，关门状态，停止状态，运行状态。
 * 每一种状态改变，都有可能要根据其他状态来更新处理。
 * 例如，如果电梯门现在处于运行时状态，就不能进行开门操作，而如果电梯门是停止状态，就可以执行开门操作。
 *
 * 使用状态模式优化代码前存在的问题：
 *   1.使用了大量的switch…case这样的判断（if…else也是一样)，使程序的可阅读性变差。
 *   2.扩展性很差。如果新加了断电的状态，我们需要修改判断逻辑
 */
public class Client {
    public static void main(String[] args) {
        ILife lift = new Lift();
        lift.setState(ILife.STOPPING_STATE); //电梯是停止的
        lift.open();    //开门
        lift.close();   //关门
        lift.run();     //运行
        lift.stop();    //停止
    }
}
