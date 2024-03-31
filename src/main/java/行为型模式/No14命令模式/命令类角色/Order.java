package 行为型模式.No14命令模式.命令类角色;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单： 命令中包含订单
 */
public class Order {
    //餐桌号
    private Integer diningTable;
    // 用来存储餐名并记录份数
    private Map<String,Integer> foodDic = new HashMap<>();

    public Integer getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(Integer diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String foodName,Integer num) {
        foodDic.put(foodName,num);
    }
}
