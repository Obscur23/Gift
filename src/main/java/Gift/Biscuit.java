package Gift;

/**
 * Created by Obscur on 16.12.17.
 */

public class Biscuit extends Sweetness {
    public Biscuit (String name, float weight, float price) {
        super(name, weight, price);//наследуем параметры из класса сладость
    }
    @Override public String properties(){
        return "Biscuit "+getName()+", weight "+getWeight()+", price "+getPrice();
        //вытаскиваем параметры через гетер, тк переменные приватные

    }
}
