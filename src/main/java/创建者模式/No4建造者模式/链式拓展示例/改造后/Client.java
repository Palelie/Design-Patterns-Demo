package 创建者模式.No4建造者模式.链式拓展示例.改造后;

/**
 * 建造者模式除了标准写法外，在开发中还有一个常用的使用方式：
 * 当一个类构造器需要传入很多参数时，如果创建这个类的实例，代码可读性会非常差，而且很容易引入错误，此时就可以利用建造者模式进行重构。
 */

/**
 * 重构后代码：链式调用
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("AMD")     //可以清楚知道传递的是什么参数
                .memory("长城")
                .screen("三星")
                .mainboard("华硕")
                .build();
        System.out.println(computer);
    }
}
