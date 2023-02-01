import java.util.ArrayList;
public class UsedCarLot {

    private ArrayList<Car> inventory;

    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getLot()
    {
        return inventory;
    }

    public void addCar(Car newbie)
    {
        inventory.add(newbie);
    }

    public boolean swap(int idx1, int idx2)
    {
        if (idx1 < inventory.size() && idx2 < inventory.size())
        {
            Car car1 = inventory.get(idx1);
            Car car2 = inventory.get(idx2);
            inventory.set(idx1, car2);
            inventory.set(idx2, car1);
            return true;
        }
        else
        {
            return false;
        }

    }
}
