package 行为型模式.No16状态模式.优化后.状态角色;

import 行为型模式.No16状态模式.优化后.环境角色.Context;

public class RunningState extends LiftState{
    //运行时不能开电梯门
    @Override
    public void open() {
        //do nothing
    }

    //电梯门默认关闭
    @Override
    public void close() {
        //do nothing
    }

    //这是在运行状态下要实现的方法
    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    //可以在运行中停下来
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.stop();
    }
}
