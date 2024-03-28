package 结构型模式.No10组合模式.树枝节点;

import 结构型模式.No10组合模式.抽象根节点.MenuComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类（在树形结构中相当于树枝节点）
 */
public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponentList;

    public Menu(String name,Integer level){
        super(name,level);
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("——");
        }
        System.out.println(name);
        for(MenuComponent component : menuComponentList){
            component.print();
        }
    }
}
