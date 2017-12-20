package factory;

import Gift.Sweetness;
import enums.SweetnessTypes;
import Gift.*;

/**
 * Created by user on 20.12.2017.
 */
public class SweetnessFsctory {

    public static Sweetness createInstance(String name, float weight, float price, SweetnessTypes type)
    {
        switch (type) {
            case CANDY:
                return  new Candy(name, weight, price);
            case BISCUIT:
                return  new Biscuit(name, weight, price);
            case CHOCOLATE:
                return  new Chocolate(name, weight, price);
                default:
                    return  null;
        }

    }
}
