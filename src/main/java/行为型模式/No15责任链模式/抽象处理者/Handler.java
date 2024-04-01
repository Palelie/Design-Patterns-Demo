package 行为型模式.No15责任链模式.抽象处理者;

import 行为型模式.No15责任链模式.LeaveRequest;

/**
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 */
public abstract class Handler {
    protected final static Integer NUM_ONE = 1;
    protected final static Integer NUM_THREE = 3;
    protected final static Integer NUM_SEVEN = 7;

    //该领导处理请假的天数范围
    private Integer numStart;
    private Integer numEnd;

    //领导的上级领导
    private Handler nextHandler;

    public Handler(Integer numStart, Integer numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //提交请假条
    public final void submit(LeaveRequest leaveRequest){
        if (leaveRequest.getNum() < 1){
            System.out.println("无效假条");
            return;
        }
        //如果请假天数在当前领导的审批范围
        Integer leaveNum = leaveRequest.getNum();
        if (numStart <= leaveNum && numEnd >= leaveNum){
            this.handleLeave(leaveRequest);
            //当前领导无权限审批该假条，同时还存在上级领导，交给上级领导审批
        }else if (numEnd < leaveNum && nextHandler != null){
            nextHandler.submit(leaveRequest);
        }else {
            System.out.println("流程结束");
        }
    }

    //各级领导处理请假条的方法
    protected abstract void handleLeave(LeaveRequest leaveRequest);
}
