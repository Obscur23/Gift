package Gift;

import org.junit.Assert;
import org.junit.Test;

import static Gift.SweetnessTypes.BISCUIT;
import static Gift.SweetnessTypes.CANDY;
import static Gift.SweetnessTypes.CHOCOLATE;


/**
 * Created by Obscur on 01.01.18.
 * Защищаем Класс SweetnessTypes от изменений. 
 */
public class SweetnessTypesTest {
    @Test
    public void namesTest() {
        SweetnessTypes ExpectedNames [] = {CHOCOLATE, CANDY, BISCUIT};
        SweetnessTypes [] RealNames = SweetnessTypes.values();
        Assert.assertArrayEquals("Должны быть только типы: CHOCOLATE, CANDY, BISCUIT", ExpectedNames, RealNames);
        }


}