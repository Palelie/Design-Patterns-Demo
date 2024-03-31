package 行为型模式.No14命令模式.请求者角色;

import 行为型模式.No14命令模式.命令类角色.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者/请求者（Invoker）角色：
 *   要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。
 *   这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 *
 * 服务员：就是调用者角色，由她来发起命令
 */
public class Waiter {
    List<Command> commandList = new ArrayList<>();

    public Waiter(){
        commandList = new ArrayList<>();
    }

    public void setCommand(Command command){
        commandList.add(command);
    }

    // 发出命令:订单来了，厨师开始执行
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (int i = 0; i < commandList.size(); i++) {
            Command cmd = commandList.get(i);
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
