package 行为型模式.No21备忘录模式.白箱备忘录模式;

import 行为型模式.No21备忘录模式.白箱备忘录模式.发起人角色.GameRole;
import 行为型模式.No21备忘录模式.白箱备忘录模式.管理者角色.RoleStateCaretaker;

/**
 * 定义：
 *   又叫快照模式，在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后当需要时能将该对象恢复到原先保存的状态。
 *
 * 备忘录模式的主要角色如下：
 *   发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 *   备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 *   管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 *
 * 备忘录有两个等效的接口：
 *   窄接口：管理者(Caretaker)对象（和其他发起人对象之外的任何对象）看到的是备忘录的窄接口(narror Interface)，这个窄接口只允许他把备忘录对象传给其他的对象。
 *   宽接口：与管理者看到的窄接口相反，发起人对象可以看到一个宽接口(wide Interface)，这个宽接口允许它读取所有的数据，以便根据这些数据恢复这个发起人对象的内部状态。
 *
 * “白箱”备忘录模式：
 *   备忘录角色对任何对象都提供一个接口，即宽接口，备忘录角色的内部所存储的状态就对所有对象公开。
 *   (在该示例中，管理者（Caretaker）可直接调用备忘录角色（Memento）里的所有接口，直接获取所有备份记录）
 *
 * 示例：挑战游戏boss
 *   游戏中的某个场景，一游戏角色有生命力、攻击力、防御力等数据，在打Boss前和后一定会不一样的，我们允许玩家如果感觉与Boss决斗的效果不理想可以让游戏恢复到决斗之前的状态。
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色，并初始化属性
        GameRole gameRole = new GameRole();
        gameRole.initState();
        //展示角色当前属性
        System.out.println("----------打boss前-------------");
        gameRole.stateDisplay();
        //保存当前角色状态
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        //战斗
        gameRole.fight();
        System.out.println("----------打boss后-------------");
        gameRole.stateDisplay();

        //恢复角色战斗前状态
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        System.out.println("----------恢复状态-------------");
        gameRole.stateDisplay();

    }
}
