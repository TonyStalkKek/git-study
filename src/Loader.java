
public class Loader
{
    public static void main(String[] args)
    {
        Cat batya = new Cat();
        batya.getWeight();
        batya.getColor(Color.SCHWARZ);
        System.out.println("Batya's weight=" + batya.getWeight() + "; Pasha is " + batya.getStatus());
        while (batya.getWeight()>Cat.MIN_WEIGHT)
        {
            batya.meow();
            System.out.println(batya.getStatus() + "; Batya's weight=" + batya.getWeight());
        }
        System.out.println("Total Count of Cats now is " + batya.getCount());

        Cat masha = new Cat();
        masha.getWeight();
        System.out.println("Masha's weight=" + masha.getWeight() + "; Masha is " + masha.getStatus());
        while (masha.getWeight()<Cat.MAX_WEIGHT)
        {
            double amount = 20;
            masha.feed(amount);
            System.out.println(masha.getStatus() + "; Masha's weight=" + masha.getWeight());
        }
        System.out.println("Total Count of Cats now is " + masha.getCount());

        Cat vasya = new Cat();
        vasya.getWeight();
        System.out.println("Vasya's weight before Bathroom=" + vasya.getWeight() + "; Vasya is " + vasya.getStatus() +
                "; Vasya's weight after Bathroom=" + vasya.goBathroom() +  "; Total Count of Cats now is " + vasya.getCount());

        Cat vova = new Cat();
        vova.getWeight();
        vova.Pee();
        System.out.println("Vova's weight before eating=" + vova.getWeight() + "; Vova is " + vova.getStatus() + "; Vova eated " + vova.Pee() +  "; Total Count of Cats now is " + vova.getCount());

        Cat pasha = new Cat();
        pasha.getWeight();
        System.out.println("Pasha's weight=" + pasha.getWeight() + "; Pasha is " + pasha.getStatus() +  "; Total Count of Cats now is " + pasha.getCount());
    }
}