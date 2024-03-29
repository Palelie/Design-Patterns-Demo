package 结构型模式.No11享元模式.享元角色;

/**
 * 具体享元（Concrete Flyweight）角色 ：它实现了抽象享元类，称为享元对象；在具体享元类中为内部状态提供了存储空间。通常我们可以结合单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象。
 */
public class ZBox extends AbstractBox{
    @Override
    public String getShape() {
        return "Z";
    }
}
