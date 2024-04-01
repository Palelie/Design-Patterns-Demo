package 行为型模式.No15责任链模式.具体处理者;

import 行为型模式.No15责任链模式.LeaveRequest;
import 行为型模式.No15责任链模式.抽象处理者.Handler;

/**
 * 具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 *
 * 小组长
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        //小组长只能处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天，请假原因：" + leaveRequest.getContent());
        System.out.println("小组长审批意见：同意");
    }
}
