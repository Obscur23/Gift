package Gift;
import java.io.*;
/**
 * Created by Obscur on 10.12.17.
 * Конструктор сладости
 */
public class Sweetness { //класс сладость для подарка
    String name; //название
    float weight; //вес
    float price; //цена
    String manuf; //производитель
    //Конструктор класса
    public Sweetness(String name, float weight, float price, String manuf){
    this.name = name;
    this.weight = weight;
    this.price = price;
    this.manuf = manuf;
    }
    public void printContent() { //метод для вывода свойств сладости
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
        System.out.println("Price:" + price);
        System.out.println("Manufacturer:" + manuf);
    }
}
