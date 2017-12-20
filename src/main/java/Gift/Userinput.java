package Gift;

import enums.SweetnessTypes;
import factory.SweetnessFsctory;

import static java.lang.System.*;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Obscur on 19.12.17.
 */
public class Userinput {
    public float allWeight = 0;
    float allPrice;
    public SweetBox   Userinput()
    {
        Scanner in = new Scanner(System.in);

        SweetBox choice = new SweetBox();//сюда сложим выбор пользователя
        boolean yes;//запускаем цикл выбора
        do {
            System.out.println("Enter Sweetness: 1-Chocolate, 2-Candy, 3-Biscuit, 0-Exit");
            int userProduct = in.nextInt();
            if(userProduct==0)
            {
                break;
            }
            if (userProduct < 1 || userProduct > 3) {
                System.out.println("Enter Sweetness: 1-Chocolate, 2-Candy, 3-Biscuit");
                continue;
            }
            System.out.println("Enter Name");
            String userName = in.next();
            System.out.println("Enter Weight");
            float userWeight = in.nextFloat();
            allWeight += userWeight;
            System.out.println("Enter Price");
            float userPrice = in.nextFloat();
            SweetnessTypes type = SweetnessTypes.values()[userProduct - 1];
            Sweetness result = SweetnessFsctory.createInstance(userName, userWeight, userPrice, type);
            choice.add(result);
        } while (true);
        return choice;
    }
}