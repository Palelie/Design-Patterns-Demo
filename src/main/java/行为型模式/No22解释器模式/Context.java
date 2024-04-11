package 行为型模式.No22解释器模式;

import 行为型模式.No22解释器模式.终结符表达式角色.Variable;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境（Context）角色：
 *   通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 */
public class Context {
    private Map<Variable,Integer> map = new HashMap<>();

    public void assign(Variable variable,Integer value){
        map.put(variable,value);
    }
    public int getValue(Variable variable) {
        return map.get(variable);
    }
}
