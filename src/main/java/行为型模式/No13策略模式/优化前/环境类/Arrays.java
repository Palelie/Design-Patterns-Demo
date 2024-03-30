package 行为型模式.No13策略模式.优化前.环境类;

import 行为型模式.No13策略模式.优化前.抽象策略类.Comparator;

public class Arrays {
    private Comparator comparator;

    public Arrays(Comparator comparator) {
        this.comparator = comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public void sort(){
        System.out.print("现在对数组进行排序：");
        comparator.compare();
    }
}
