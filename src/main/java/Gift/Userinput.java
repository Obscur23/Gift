package Gift;

import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Obscur on 19.12.17.
 */
public class Userinput {
    public void Userinput()

    {   Scanner in = new Scanner(System.in);
        ArrayList choice = new ArrayList();//сюда сложим выбор пользователя
        boolean yes;//запускаем цикл выбора
        do {
            System.out.println("Enter Sweetness: 1-Chocolate, 2-Candy, 3-Biscuit");
            int userProduct = in.nextInt();
            System.out.println("Enter Name");
            String userName = in.next();
            System.out.println("Enter Weight");
            float userWeight = in.nextFloat();
            System.out.println("Enter Price");
            float userPrice = in.nextFloat();
                switch (userProduct){
                    case 1:
                    choice = new Chocolate(userName, userWeight,userPrice);
                }

        } while (yes);
    }
}