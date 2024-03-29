package 结构型模式.No11享元模式.享元工厂;

import 结构型模式.No11享元模式.享元角色.AbstractBox;
import 结构型模式.No11享元模式.享元角色.IBox;
import 结构型模式.No11享元模式.享元角色.LBox;
import 结构型模式.No11享元模式.享元角色.ZBox;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂（Flyweight Factory）角色 ：负责创建和管理享元角色。
 * 当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 *
 * 该工厂类对象只需要一个，所以使用单例模式（这里使用内部类方式实现的懒汉式）
 */
public class BoxFactory {
    private static Map<String, AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("Z",new ZBox());
    };

    public static BoxFactory getInstance(){
        return SingletonHolder.boxFactory;
    }

    private static class SingletonHolder{
        private static BoxFactory boxFactory= new BoxFactory();
    }

    public AbstractBox getBox(String key){
        return map.get(key);
    }

}
