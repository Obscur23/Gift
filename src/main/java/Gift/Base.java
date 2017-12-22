package Gift;

import java.util.ArrayList;

/**
 * Created by Obscur on 08.12.17.


}
 */
public class Base {
    public static void main(String[] args) {
//        Gift box=new Gift();
//        box.addSweetness(new Chocolate("Chok1", 20,80));
//        box.addSweetness(new Candy("Candy1",50,150));
//        box.addSweetness(new Biscuit("Bisc1",50,150));
//        box.printItems();

        Userinput input=new Userinput();
        SweetBox box=input.Userinput();
        for(Sweetness sw:box)
        {
           sw.printSweet();
        }
     System.out.println("Total Weight = "+box.getTotalWeight());
        System.out.println("Total Price = "+box.getTotaPrice());

        System.out.println("Cocolate Weight = "+box.getChockWeight());

        //System.out.println(input.allWeight);

    }
}
