package Gift;
import java.io.*;

/**
 * Created by Obscur on 10.12.17.
 * Конструктор сладости
 */
public abstract class Sweetness { //класс сладость для подарка, переменные недоступны
    private String name; //название
    private float weight; //вес
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
        System.out.println("Name:" + name+"  Weight:" + weight+"  Price:" + price);
    }
    public void fileR() {//метод для записи выбора в файл

        try (FileWriter writer = new FileWriter("gift.txt", true)) {//здесь добавление, файл инициирован в классе Base
            // запись всей строки
            writer.write("Name:" + name + "  Weight:" + weight + "  Price:" + price);
            // перенос строки
            writer.append('\n');

            writer.flush();
            writer.close();
        } catch (IOException ex) {

            System.out.println("Record Problem");
        }
    }


    }




