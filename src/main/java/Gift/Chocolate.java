package Gift;

/**
 * Created by Obscur on 13.12.17.
 */
public class Chocolate extends Sweetness {
    public Chocolate (String name, float weight, float price) {
        super(name, weight, price);//наследуем параметры из класса сладость
    }
    @Override public String properties (){
        return "Chocolate "+getName()+", weight "+getWeight()+", price "+getPrice();
        //вытаскиваем параметры через гетер, тк переменные приватные

    }
}
