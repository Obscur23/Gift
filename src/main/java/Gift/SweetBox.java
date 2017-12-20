package Gift;

import enums.SweetnessTypes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20.12.2017.
 */
public class SweetBox extends ArrayList<Sweetness> {



    public int getTotalWeight()
    {
        int w=0;
        for(Sweetness sw : this)
        {
            w+=sw.getWeight();
        }
        return  w;
    }



    public int getChockWeight()
    {
        int w=0;
        for(Sweetness sw : this)
        {
            if(sw.getClass()==Chocolate.class) {
                w += sw.getWeight();
            }
        }
        return  w;
    }
}
