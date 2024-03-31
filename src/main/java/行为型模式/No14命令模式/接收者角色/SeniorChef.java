package 行为型模式.No14命令模式.接收者角色;

/**
 * 具体命令（Concrete  Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 *
 * 资深大厨： 接收者角色，真正命令执行的对象。
 */
public class SeniorChef {
    public void makeFood(String foodName,Integer num){
        System.out.println("大厨做了" + num + "份" + foodName);
    }
}
