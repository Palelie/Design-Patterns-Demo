package 创建者模式.No4建造者模式.链式拓展示例.改造前;

/**
 * 建造者模式除了标准写法外，在开发中还有一个常用的使用方式：
 * 当一个类构造器需要传入很多参数时，如果创建这个类的实例，代码可读性会非常差，而且很容易引入错误，此时就可以利用建造者模式进行重构。
 */

/**
 * 重构前代码：
 * 在客户端代码中构建Computer对象，传递了四个参数，如果参数更多，代码的可读性及使用的成本就是比较高。
 */
public class Client {
    public static void main(String[] args) {
        //构建Phone对象
        Computer computer = new Computer("intel","三星屏幕","金士顿","华硕");
        System.out.println(computer);
    }
}