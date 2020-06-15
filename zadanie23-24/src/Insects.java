

public class Insects {
    String name;
    int numberOfLegs;
    boolean wings;
    String abilities;
    boolean liveInSwarm;
    boolean isVenomous;

    //constructor
    Insects(String name, int numberOfLegs, boolean wings, String abilities, boolean liveInSwarm, boolean isVenomous) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.wings = wings;
        this.abilities = abilities;
        this.liveInSwarm = liveInSwarm;
        this.isVenomous = isVenomous;
    }

    //static block
    static {
        System.out.println("About my insects: ");
    }

}
