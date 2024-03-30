package 行为型模式.No13策略模式.优化前;

import 行为型模式.No13策略模式.优化前.具体策略类.AscComparator;
import 行为型模式.No13策略模式.优化前.具体策略类.DescComparator;
import 行为型模式.No13策略模式.优化前.抽象策略类.Comparator;
import 行为型模式.No13策略模式.优化前.环境类.Arrays;

/**
 * 定义：
 * 	 该模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。
 * 	 策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 *
 * 策略模式的主要角色如下：
 *   抽象策略（Strategy）类：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 *   具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现或行为。
 *   环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 *
 * 优点：
 *   策略类之间可以自由切换：由于策略类都实现同一个接口，所以使它们之间可以自由切换。
 *   易于扩展：增加一个新的策略只需要添加一个具体的策略类即可，基本不需要改变原有的代码，符合“开闭原则“
 *   避免使用多重条件选择语句（if else），充分体现面向对象设计思想。
 *
 * 缺点：
 *   客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
 *   策略模式将造成产生很多策略类，可以通过使用享元模式在一定程度上减少对象的数量。
 *
 * 扩展：
 *   在策略模式的基础上，使用 map（注册器模式）优化 if else 结构语句，使用枚举减少策略类数量
 *
 * 示例：使用Arrays类中的sort方法对数组进行排序，使用comparator指定排序策略
 */
public class Client {
    /**
     * 存在问题：
     *    过多的策略类
     *    过多使用 if else 结构语句导致维护困难
     */
    public static void main(String[] args) {
        //指定排序规则
        String sortStrategy = "asc";
        Comparator comparator;

        //根据排序规则进行排序
        if ("asc".equals(sortStrategy)){
            comparator = new AscComparator();
        }else if ("desc".equals(sortStrategy)){
            comparator = new DescComparator();
        }else {
            throw new RuntimeException();
        }
        Arrays arrays = new Arrays(comparator);
        arrays.sort();
    }
}
