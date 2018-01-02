package Gift;
import java.io.*;

/**
 * Created by Obscur on 10.12.17.
 * Конструктор сладости
 */
public abstract class Sweetness { //класс сладость для подарка, переменные недоступны
    private String name; //название
    private float weight = 5; //вес
    private float price; //цена
    //Конструктор класса
    Sweetness(String name, float weight, float price){
    this.name = name;
    this.weight = weight;
    this.price = price;
    }
    public String getName()  {//можем отдавать название из класса
        return name;
    }
    public void setName(String name){//можем получать название в класс
        this.name = name;
    }
    public float getWeight()  {//можем отдавать вес из класса
        return weight;
    }
    public void setWeight(float weight){//можем получать вес в класс
        this.weight = weight;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice (float price){
        this.price = price;
    }
    public abstract String properties();
    public void printSweet() { //метод для вывода свойств сладости,
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
        System.out.println("Price:" + price);
    }

    public void fileRecord(){
        String text = "Hello world";
        BufferedWriter output = null;
        try {
            File file = new File("record.txt");
            output = new BufferedWriter(new FileWriter(file));

            output.write(text);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if ( output != null ) try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

        public void fileR (String[] args) throws Exception {

            FileWriter nFile = new FileWriter("file1.txt");

            nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");

            nFile.close();
        }
    }
}
