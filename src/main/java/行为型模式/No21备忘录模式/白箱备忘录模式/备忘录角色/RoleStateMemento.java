package 行为型模式.No21备忘录模式.白箱备忘录模式.备忘录角色;

/**
 * 备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 */
public class RoleStateMemento {
    //生命值
    private int vit;
    //攻击力
    private int atk;
    //防御力
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
