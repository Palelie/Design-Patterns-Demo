package 行为型模式.No18中介者模式.中介者角色;

import 行为型模式.No18中介者模式.同事类角色.HouseOwner;
import 行为型模式.No18中介者模式.同事类角色.Person;
import 行为型模式.No18中介者模式.同事类角色.Tenant;
import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者（ConcreteMediator）角色：
 *   实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 */
public class MediatorStructure extends Mediator{
    //首先中介者需要知道所有房主和租户的信息
    private List<HouseOwner> houseOwnerList = new ArrayList<>();

    private List<Tenant> tenantList = new ArrayList<>();

    public void setHouseOwner(HouseOwner houseOwner) {
        houseOwnerList.add(houseOwner);
    }

    public void setTenant(Tenant tenant){
        tenantList.add(tenant);
    }

    //这个constact方法是中介向同事类角色联系（解耦各个同事类的关键逻辑）
    @Override
    public void constact(String message, Person person) {
        //如果是房主联系的中介，那么就需要中介向租户传递消息
        if (person instanceof HouseOwner){
            for (Tenant tenant : tenantList) {
                tenant.getMessage(message);
            }
        //如果是租户联系的中介，那么就需要中介向房主传递消息
        }else if (person instanceof Tenant){
            for (HouseOwner houseOwner : houseOwnerList) {
                houseOwner.getMessage(message);
            }
        }
    }
}
