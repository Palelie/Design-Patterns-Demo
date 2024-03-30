package 行为型模式.No13策略模式.优化后;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 环境类
 *
 * 在环境类中使用 map（注册器模式）提前注入策略类，使用的时候直接在map中获取，优化了客户端的 if else 语句
 */
public class Arrays {
    private final static Map<String,Comparator> map;

    static {
        map = new HashMap<>();
        map.put("ASC",Comparator.ASC);
        map.put("DESC",Comparator.DESC);
    }

    private Arrays() {}

    public static void sort(String sortStrategy){
        Comparator comparator = map.get(sortStrategy);
        if (Objects.nonNull(comparator)){
            System.out.print("现在对数组进行排序：");
            comparator.compare();
        }
    }
}
