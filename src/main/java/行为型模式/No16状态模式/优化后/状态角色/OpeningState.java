package 行为型模式.No16状态模式.优化后.状态角色;

import 行为型模式.No16状态模式.优化后.环境角色.Context;

public class OpeningState extends LiftState{

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    //开启当然可以关闭了，我就想测试一下电梯门开关功能
    @Override
    public void close() {
        //虽然我可以关门，但这个动作不归我执行。状态切换
        //相当于双向链表，这个方法执行完后，Context类不再指向这个状态类，而是指向closeingState
        //同时在指向closeingState的时候也将closeingState里的context指向context自己，形成双向链表
        super.context.setLiftState(Context.closeingState);
        //动作委托给ClosingState来执行，也就是委托给了ClosingState子类执行这个动作
        super.context.getLiftState().close();
    }

    //电梯门不能开着就跑，这里什么都不做
    @Override
    public void run() {
        //do nothing
    }


    //开门状态已经是停止的了
    @Override
    public void stop() {
        //do nothing
    }
}
