package 创建者模式.No4建造者模式.链式拓展示例.改造后;

/**
 * 使用建造者模式进行改造的产品类
 */
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    /**
     * 私有构造方法，使用建造者进行建造
     */
    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.screen = builder.screen;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder(){}

        public Builder cpu(String cpu){
            this.cpu = cpu;
            //为了链式调用
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        public Computer build(){
            //这里调用的是私有的构造方法
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
