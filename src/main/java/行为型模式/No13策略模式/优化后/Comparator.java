package 行为型模式.No13策略模式.优化后;

/**
 * 抽象策略类 + 具体策略类
 *
 * 使用枚举类实现了“抽象策略类”和“具体策略类”的统一，解决了具体策略类过多的问题
 */
public enum Comparator {
    ASC{
        @Override
        public void compare(){
            System.out.println("升序");
        }
    },
    DESC{
        @Override
        public void compare(){
            System.out.println("降序");
        }
    };
    public abstract void compare();
}
