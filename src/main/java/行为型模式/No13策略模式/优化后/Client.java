package 行为型模式.No13策略模式.优化后;

/**
 * 优化前存在问题：
 *    1.过多的策略类
 *       解决方法：使用枚举将“抽象策略类”和“具体策略类”进行统一
 *    2.过多使用 if else 结构语句导致维护困难
 *       解决方法：在环境类中使用 map（注册器模式）提前注入策略类，使用的时候直接在map中获取
 *
 * 缺点：每次新增策略都得修改枚举策略类和环境类，不符合“开闭原则”
 */
public class Client {
    public static void main(String[] args) {
        //指定排序规则
        String sortStrategy = "ASC";

        //直接优化掉 if else 语句
        Arrays.sort(sortStrategy);
    }
}
