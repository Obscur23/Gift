package Gift;

/**
 * Created by Obscur on 08.12.17.

public class Base {
    public static void main(String[] args) {
        class Content {
            Sweetness candy = new Sweetness("Candy", 0.2f, 10.3f,"RotFront");//конфета
            Sweetness biscuit = new Sweetness("Biscuit", 0.5f, 12.2f,"RedOctober");//печенье
            Sweetness lollipop = new Sweetness("Lollipop", 0.3f, 9.4f,"Rostov");//леденец
            Sweetness chocolate = new Sweetness("Chocolate", 0.25f, 20.5f,"Babaev");//шоколад
//Хотим получить объект вида candy.Sweetnes

        }

    System.out.println();

    }
}
 */
public class Base {
    public static void main(String[] args) {
        Gift box=new Gift();
        box.addSweetness(new Chocolate("Chok1", 20,80));
        box.addSweetness(new Candy("Candy1",50,150));
        box.addSweetness(new Biscuit("Bisc1",50,150));
        box.printItems();


    }
}
