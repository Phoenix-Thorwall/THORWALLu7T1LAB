import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args)
    {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Harvard");
        Cat cat2 = new Cat("Yale");
        Cat cat3 = new Cat("Brown");

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println(cats);

        Cat cat4 = new Cat("Princeton");

        cats.set(1, cat4);
        System.out.println(cats);
        System.out.println(cat2);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
