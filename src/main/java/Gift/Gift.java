package Gift;

/**
 * Created by Obscur on 16.12.17.
 */
public class Gift {
    Sweetness[] mSweetness = new Sweetness[0];//создаем массив mSweetness объектов класса Sweetness
    private float allWeight = 0;
    private float allPrice = 0;

    public void addSweetness(Sweetness sweet) {//будем добавлять
        int counter = mSweetness.length;//инит счетчика = количеству сладостей в массиве
        Sweetness[] newSweetness = new Sweetness[counter + 1];//создаем новый массив длиной +1
        for (int i = 0; i < counter; i++) {
            newSweetness[i] = mSweetness[i];
        }
        newSweetness[counter] = sweet;
        mSweetness = newSweetness;
        allWeight +=Sweetness.getWeight();
        allPrice += Sweetness.getPrice();
    }

    public void printItems() {
        for (int i = 0; i < mSweetness.length; i++) {
            System.out.println(mSweetness[i].properties());
        }
    }

    public double getTotalWeight() {
        return allWeight;
    }

    public double getTotalPrice() {
        return allPrice;
    }

    public int getNumOfSweets() {
        return mSweetness.length;
    }

}
