package 行为型模式.No21备忘录模式.黑箱备忘录模式;

/**
 * 发起人（Originator）角色：
 *   记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 *
 * 游戏角色类
 */
public class GameRole {
    //生命值
    private int vit;
    //攻击力
    private int atk;
    //防御力
    private int def;

    //初始化状态
    public void initState(){
        vit = 100;
        atk = 100;
        def = 100;
    }

    //战斗
    public void fight(){
        vit = 0;
        atk = 0;
        def = 0;
    }

    //保存角色状态
    public Memento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

    //恢复角色状态
    public void recoverState(Memento memento){
        //此处注意需要对接口进行向下强制类型转换
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    //展示角色状态
    public void stateDisplay(){
        System.out.println("角色生命值：" + vit);
        System.out.println("角色攻击力：" + atk);
        System.out.println("角色防御力：" + def);
    }

    //定义备忘录角色内部类，且该类为内部私有的，外部无法直接实例化
    private class RoleStateMemento implements Memento{
        private int vit;
        private int atk;
        private int def;

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public int getVit() {
            return vit;
        }

        public int getAtk() {
            return atk;
        }

        public int getDef() {
            return def;
        }
    }


}
