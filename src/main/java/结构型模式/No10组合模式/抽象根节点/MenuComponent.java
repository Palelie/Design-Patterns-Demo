package 结构型模式.No10组合模式.抽象根节点;

/**
 * 抽象根节点（Component）：定义系统各层次对象的共有方法和属性，可以预先定义一些默认行为和属性。
 *
 * 菜单组件：不管是菜单还是菜单项，都应该继承自统一的接口
 *
 *  这里的MenuComponent定义为抽象类，因为有一些共有的属性和行为要在该类中实现
 *  Menu和MenuItem类就可以只覆盖自己感兴趣的方法，而不用搭理不需要或者不感兴趣的方法
 *  举例来说，Menu类可以包含子菜单，因此需要覆盖add()、remove()方法，但是MenuItem就不应该有这些方法。
 *  这里给出的默认实现是抛出异常，也可以根据自己的需要改写默认实现。
 */
public abstract class MenuComponent {
    protected String name;
    protected Integer level;

    public MenuComponent(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    //添加菜单
    public void add(MenuComponent menuComponent){
        throw new IllegalArgumentException();
    }

    //删除菜单
    public void remove(MenuComponent menuComponent){
        throw new IllegalArgumentException();
    }

    //获取菜单名称
    public String getName(){
        return name;
    }

    //打印菜单结构
    public abstract void print();
}
