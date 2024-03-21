package 创建者模式.No2工厂模式.简单工厂and配置文件.工厂;

import 创建者模式.No2工厂模式.简单工厂and配置文件.产品.Coffee;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * 具体工厂类（生产咖啡）
 *
 * 在工厂类中加载配置文件中的全类名，并创建对象进行存储，客户端如果需要对象，直接进行获取即可。
 */
public class CoffeeFactoryByProperties {

    /**
     * 静态成员变量用来存储创建的对象（键存储的是名称，值存储的是对应的对象）,
     * 而读取配置文件以及创建对象写在静态代码块中，目的就是只需要执行一次。
     */
    private static HashMap<String,Coffee> coffeeMap = new HashMap<>();

    static{
        //读取配置文件，获取要实例化的类路径
        Properties properties = new Properties();
        try {
            //获取字节流
            InputStream is = CoffeeFactoryByProperties.class.getClassLoader().getResourceAsStream("CoffeeBean.properties");
            //由于字节流无法读取中文，所以采取reader把inputStream转换成reader用字符流来读取中文
            properties.load(new InputStreamReader(is, StandardCharsets.UTF_8));
            //获取配置文件的所有key
            Set<Object> keySet = properties.keySet();
            for (Object key : keySet){
                //获取所有的value（全类名）
                String coffeeBeanName = properties.getProperty((String) key);
                //获取字节码对象
                Class coffeeBeanClass = Class.forName(coffeeBeanName);
                //通过反射实例化对象
                Coffee coffeeBean = (Coffee) coffeeBeanClass.newInstance();
                coffeeMap.put((String) key,coffeeBean);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee createCoffee(String coffeeName){
        return coffeeMap.get(coffeeName);
    }
}
