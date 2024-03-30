package 行为型模式.No13策略模式.优化前.具体策略类;

import 行为型模式.No13策略模式.优化前.抽象策略类.Comparator;

public class AscComparator implements Comparator {

    @Override
    public void compare() {
        System.out.println("升序");
    }
}
