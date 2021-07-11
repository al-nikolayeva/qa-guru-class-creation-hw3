package niko.al;

public class Cat {
    String name;
    String breed;
    int age;
    int energyReserve;
    boolean isPurring;

    public Cat (String name, String breed, int age, int energyReserve) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.energyReserve = energyReserve;
    }

    public String pet () {
        isPurring = true;
        return name + ": Purr-purr...";
    }

    public String feed (){
        if (energyReserve > 90)
        {
            return name + " is not hungry anymore" ;
        } else {
            energyReserve += 10;
            return name + " is full for " + energyReserve + " %";
        }
    }

    public String play () {
        if (energyReserve <= 10)
        {
            return name + " is too tired to play";
        } else {
            energyReserve -= 10;
            return "You played with the cat. The " + name + " energy is " + energyReserve + "%";
        }
    }

    public String getInfo () {
        return "Meet " + name + " . It's a " + age + " year(s) old " + breed + " cat.";
    }

}
