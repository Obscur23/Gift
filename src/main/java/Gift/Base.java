package Gift;

import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by Obscur on 08.12.17.


}
 */
public class Base {
    public static void main(String[] args){
        Userinput input=new Userinput();
        SweetBox box=input.Userinput();
        for(Sweetness sw:box)
        {
           sw.printSweet();
             sw.fileR();
        }

        System.out.println("Total Weight = "+box.getTotalWeight());
        System.out.println("Total Price = "+box.getTotaPrice());
        System.out.println("Chocolate Weight = "+box.getChockWeight());


    }
}
