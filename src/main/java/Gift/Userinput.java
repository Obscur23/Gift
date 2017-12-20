package Gift;

import java.util.Scanner;

/**
 * Created by Obscur on 19.12.17.
 * Запрос значений у пользователя
 */
public class Userinput {
    public SweetBox   Userinput()
    {
        Scanner in = new Scanner(System.in);

        SweetBox choice = new SweetBox();//сюда сложим выбор пользователя
        do {
            System.out.println("Enter Sweetness: 1-Chocolate, 2-Candy, 3-Biscuit, 0-Exit");//начальный цикл
            int userProduct = in.nextInt();
            if(userProduct==0)
            {
                break;
            }
            if (userProduct < 1 || userProduct > 3) {//запрос данных у пользователя, заготовка фильтра
                System.out.println("Enter Sweetness: 1-Chocolate, 2-Candy, 3-Biscuit");
                continue;
            }
            System.out.println("Enter Name");
            String userName = in.next();
            System.out.println("Enter Weight");
            float userWeight = in.nextFloat();
            System.out.println("Enter Price");
            float userPrice = in.nextFloat();
            SweetnessTypes type = SweetnessTypes.values()[userProduct - 1];
            Sweetness result = SweetnessFsctory.createInstance(userName, userWeight, userPrice, type);
            choice.add(result);
        } while (true);
        return choice;
    }
}