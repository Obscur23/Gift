package Gift;

/**
 * Created by Obscur on 10.12.17.
 * Задаем сладости для выбора в подарок
 */
public class Content extends Sweetness{
    /**    Sweetness candy = new Sweetness("Candy", 0.2f, 10.3f,"RotFront");//конфета
    Sweetness biscuit = new Sweetness("Biscuit", 0.5f, 12.2f,"RedOctober");//печенье
    Sweetness lollipop = new Sweetness("Lollipop", 0.3f, 9.4f,"Rostov");//леденец
    Sweetness chocolate = new Sweetness("Chocolate", 0.25f, 20.5f,"Babaev");//шоколад
*/
    public Content(String name, float weight, float price, String manuf, String hueta) {
        super(name, weight, price, manuf);
        this hueta = hueta;
    }
}
