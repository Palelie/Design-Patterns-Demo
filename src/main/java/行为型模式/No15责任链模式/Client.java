package 行为型模式.No15责任链模式;

import 行为型模式.No15责任链模式.具体处理者.GeneralManager;
import 行为型模式.No15责任链模式.具体处理者.GroupLeader;
import 行为型模式.No15责任链模式.具体处理者.Manager;

/**
 * 定义：
 *   为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链
 *   当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
 *
 * 职责链模式主要包含以下角色:
 *   抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 *   具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 *   客户类（Client）角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 *
 * 优点：
 *   1.降低了对象之间的耦合度：该模式降低了请求发送者和接收者的耦合度。
 *   2.增强了系统的可扩展性：可以根据需要增加新的请求处理类，满足开闭原则。
 *   3.增强了给对象指派职责的灵活性：当工作流程发生变化，可以动态地改变链内的成员或者修改它们的次序，也可动态地新增或者删除责任。
 *   4.责任链简化了对象之间的连接：一个对象只需保持一个指向其后继者的引用，不需保持其他所有处理者的引用，这避免了使用众多的 if 或者 if···else 语句。
 *   5.责任分担：每个类只需要处理自己该处理的工作，不能处理的传递给下一个对象完成，明确各类的责任范围，符合类的单一职责原则。
 *
 * 缺点：
 *   1.不能保证每个请求一定被处理。由于一个请求没有明确的接收者，所以不能保证它一定会被处理，该请求可能一直传到链的末端都得不到处理。
 *   2.对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响。
 *   3.职责链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于职责链的错误设置而导致系统出错，如可能会造成循环调用。
 *
 *
 * 案例：请假流水线
 *   现需要开发一个请假流程控制系统。请假1-3天的假只需要小组长同意即可；请假3-7天的假还需要部门经理同意；请假7天以上需要总经理同意。
 */

/**
 * 客户类（Client）角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 */
public class Client {
    public static void main(String[] args) {
        //创建请假条
        LeaveRequest leaveRequest1 = new LeaveRequest("张三", 2, "生病");
        LeaveRequest leaveRequest2 = new LeaveRequest("李四", 6, "累了");
        LeaveRequest leaveRequest3 = new LeaveRequest("王五", 99, "谁爱干谁干");

        //创建责任链（审批流水线）
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //之所以在这里设置上级领导，是因为可以根据实际需求来更改设置，如果实战中上级领导人都是固定的，则可以移到领导实现类中。
        //小组长的领导是部门经理
        groupLeader.setNextHandler(manager);
        //部门经理的领导是总经理
        manager.setNextHandler(generalManager);

        //提交申请
        groupLeader.submit(leaveRequest1);
        groupLeader.submit(leaveRequest2);
        groupLeader.submit(leaveRequest3);
    }
}
