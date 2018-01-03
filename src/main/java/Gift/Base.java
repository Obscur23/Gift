package Gift;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Obscur on 08.12.17.


}
 */
public class Base {
    public static void main(String[] args){

        Userinput input=new Userinput();
        SweetBox box=input.Userinput();

        try (FileWriter writer = new FileWriter("gift.txt")){}//удаляем файл перед записью

        catch (IOException ex) {

                System.out.println("Delete Problem");
            }
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
