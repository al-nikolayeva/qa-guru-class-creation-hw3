package niko.al;

public class Main {

    public static void main (String[] args) {
        var Freckle = new Cat("Freckle", "Abyssinian", 1, 20);
        var Pirate = new Cat ("Pirate", "European", 10, 70);
        System.out.println(Freckle.getInfo());
        System.out.println(Freckle.pet());
        System.out.println(Freckle.play());
        System.out.println(Freckle.play());

        System.out.println(Pirate.getInfo());
        System.out.println(Pirate.feed());
        System.out.println(Pirate.feed());
        System.out.println(Pirate.feed());
        System.out.println(Pirate.feed());
    }
}
