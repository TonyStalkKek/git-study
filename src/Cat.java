
public class Cat
{
    private static int globalCount; //Стартовое значение глобальной переменной менять тут через " = сколько-то"
    private double originWeight;
    private double weight;
    public static final double MAX_WEIGHT = 9000;
    public static final double MIN_WEIGHT = 1000;
    public static final int EYES_COUNT = 2;
    public double ves;

    public Cat()
    {
        weight = 1500.1 + 3000.0 * Math.random();
        originWeight = weight;

    }


    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void getColor (Color type)
    {

    }

    public Cat(Double ves)
    {
        this();
        this.weight = ves;

    }

    public Double Pee()
    {
        Double feedAmount = 0.05*weight;
        weight = weight - feedAmount;
        return feedAmount;
    }

    public Double goBathroom()
    {
        weight = weight - 0.1*weight;
        return weight;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public int getCount()
    {
        if (weight < this.MAX_WEIGHT && weight > this.MIN_WEIGHT)
        {
            this.globalCount = this.globalCount + 1;
        }
        else
        {
            this.globalCount = this.globalCount;
        }
        return globalCount;
    }

}