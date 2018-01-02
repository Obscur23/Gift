package Gift;

import Gift.SweetBox;
import org.junit.Assert;
import org.junit.Test;

//import simple.Chocolate;
//import simple.Cookie;
//import simple.GiftBox;


/**
 * Created by Obscur on 01.01.18.
 */
public class Test1 {
    @Test
    public void zeroNewWeight() {

        SweetBox zeroWeight = new SweetBox();

        Assert.assertEquals("Пустая коробка весит 0", 0, zeroWeight.getTotalWeight(), 0);
    }
    @Test
    public void zeroNewPrice() {

        SweetBox zeroPrice = new SweetBox();

        Assert.assertEquals("Пустая коробка стоит 0", 0, zeroPrice.getTotalWeight(), 0);
    }
}
