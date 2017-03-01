package CommandPattern;

/**
 * Created by Xiaojun YU on 2017-02-28.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();
    }
}
