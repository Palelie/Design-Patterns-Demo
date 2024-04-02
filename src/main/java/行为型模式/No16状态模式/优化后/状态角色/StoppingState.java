package 行为型模式.No16状态模式.优化后.状态角色;

import 行为型模式.No16状态模式.优化后.环境角色.Context;

public class StoppingState extends LiftState{
    @Override
    public void open() {
        //电梯停下来后可以打开
        super.context.setLiftState(Context.openingState);
        super.context.open();
    }

    @Override
    public void close() {
        //电梯停止时可以关门
        super.context.setLiftState(Context.closeingState);
        super.context.close();
    }

    @Override
    public void run() {
        //电梯停止时可以关门
        super.context.setLiftState(Context.runningState);
        super.context.run();
    }

    @Override
    public void stop() {
        //电梯停止的动作需要自己执行
        System.out.println("电梯停止了...");
    }
}
