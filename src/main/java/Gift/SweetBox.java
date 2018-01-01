package Gift;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Здесь определяем методы обработки списка
 */
public class SweetBox extends ArrayList<Sweetness> {//общий вес

    public int getTotalWeight()
    {
        int w=0;
        for(Sweetness sw : this)
        {
            w+=sw.getWeight();
        }
        return  w;
    }

    public int getTotaPrice()//общая цена
    {
        int w=0;
        for(Sweetness sw : this)
        {
            w+=sw.getPrice();
        }
        return  w;
    }

    public int getChockWeight()
    {
        int w=0;
        for(Sweetness sw : this)
        {
            if(sw.getClass()==Chocolate.class) {//вес шоколада
                w += sw.getWeight();
            }
        }
        return  w;
    }

}
