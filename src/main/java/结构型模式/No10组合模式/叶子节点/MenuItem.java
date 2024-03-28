package 结构型模式.No10组合模式.叶子节点;

import 结构型模式.No10组合模式.抽象根节点.MenuComponent;

/**
 * 菜单项类（在树型结构中相当于叶子节点）
 * MenuItem是菜单项，不能再有子菜单，所以添加菜单，移除菜单和获取子菜单的功能并不能实现。
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, Integer level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.printf("——");
        }
        System.out.println(name);
    }
}
