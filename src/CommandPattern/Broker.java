package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xiaojun YU on 2017-02-28.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
    }
}
