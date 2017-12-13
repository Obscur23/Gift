package Gift;

/**
 * Created by Obscur on 13.12.17.
 */
class Chocolate extends Sweetness {
    public Chocolate (String name, float weight, float price) {
        super(name, weight, price);//наследуем параметры из класса сладость
    }
    public String properties (){
        return "Шоколад "+getName()+", вес "+getWeight()+", цена "+getPrice();
        //вытаскиваем параметры через гетер, тк переменные приватные

    }
}
